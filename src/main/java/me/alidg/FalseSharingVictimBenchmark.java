package me.alidg;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.openjdk.jmh.annotations.Mode.AverageTime;

@Threads(24)
@Fork(value = 2)
@Warmup(iterations = 5)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class FalseSharingVictimBenchmark {

    private static final SimpleCounter simple = new SimpleCounter();
    private static final PaddedCounter padded = new PaddedCounter();

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long simple() {
        return simple.inc((int) (Thread.currentThread().getId() % 24));
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded() {
        return padded.inc((int) (Thread.currentThread().getId() % 24));
    }

    public static void main(String[] args) throws Exception {
        Main.main(args);
    }
}

package me.alidg;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static org.openjdk.jmh.annotations.Mode.AverageTime;

@Threads(8)
@State(Scope.Benchmark)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class FalseSharingVictimBenchmark {

    private static final SimpleCounter simple = new SimpleCounter();
    private static final Padded8Counter padded8 = new Padded8Counter();
    private static final Padded7Counter padded7 = new Padded7Counter();
    private static final Padded6Counter padded6 = new Padded6Counter();
    private static final Padded5Counter padded5 = new Padded5Counter();
    private static final Padded4Counter padded4 = new Padded4Counter();
    private static final Padded3Counter padded3 = new Padded3Counter();
    private static final Padded2Counter padded2 = new Padded2Counter();
    private static final Padded1Counter padded1 = new Padded1Counter();
    private static final AtomicInteger threadCounter = new AtomicInteger(1);
    private static final ThreadLocal<Integer> id = ThreadLocal.withInitial(threadCounter::getAndIncrement);

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long simple() {
        return simple.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded8() {
        return padded8.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded7() {
        return padded7.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded6() {
        return padded6.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded5() {
        return padded5.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded4() {
        return padded4.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded3() {
        return padded3.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded2() {
        return padded2.inc(id.get() % 8);
    }

    @Benchmark
    @BenchmarkMode(AverageTime)
    public long padded1() {
        return padded1.inc(id.get() % 8);
    }

    public static void main(String[] args) throws Exception {
        Main.main(args);
    }
}

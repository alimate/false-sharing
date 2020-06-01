package me.alidg;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class ContendedCounter implements Counter {

    @jdk.internal.vm.annotation.Contended
    private volatile long v1;

    @jdk.internal.vm.annotation.Contended
    private volatile long v2;

    @jdk.internal.vm.annotation.Contended
    private volatile long v3;

    @jdk.internal.vm.annotation.Contended
    private volatile long v4;

    @jdk.internal.vm.annotation.Contended
    private volatile long v5;

    @jdk.internal.vm.annotation.Contended
    private volatile long v6;

    @jdk.internal.vm.annotation.Contended
    private volatile long v7;

    @jdk.internal.vm.annotation.Contended
    private volatile long v8;

    private static final VarHandle V1;
    private static final VarHandle V2;
    private static final VarHandle V3;
    private static final VarHandle V4;
    private static final VarHandle V5;
    private static final VarHandle V6;
    private static final VarHandle V7;
    private static final VarHandle V8;

    static {
        try {
            V1 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v1", long.class);
            V2 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v2", long.class);
            V3 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v3", long.class);
            V4 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v4", long.class);
            V5 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v5", long.class);
            V6 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v6", long.class);
            V7 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v7", long.class);
            V8 = MethodHandles.lookup().findVarHandle(ContendedCounter.class, "v8", long.class);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Override
    @SuppressWarnings("DuplicatedCode")
    public long inc(int index) {
        switch (index) {
            case 1: return (long) V1.getAndAdd(this, 1);
            case 2: return (long) V2.getAndAdd(this, 1);
            case 3: return (long) V3.getAndAdd(this, 1);
            case 4: return (long) V4.getAndAdd(this, 1);
            case 5: return (long) V5.getAndAdd(this, 1);
            case 6: return (long) V6.getAndAdd(this, 1);
            case 7: return (long) V7.getAndAdd(this, 1);
            case 8: return (long) V8.getAndAdd(this, 1);
        }

        return 0;
    }
}

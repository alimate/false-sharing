package me.alidg;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class SimpleCounter implements Counter {

    private volatile long v1;
    private volatile long v2;
    private volatile long v3;
    private volatile long v4;
    private volatile long v5;
    private volatile long v6;
    private volatile long v7;
    private volatile long v8;
    private volatile long v9;
    private volatile long v10;
    private volatile long v11;
    private volatile long v12;
    private volatile long v13;
    private volatile long v14;
    private volatile long v15;
    private volatile long v16;
    private volatile long v17;
    private volatile long v18;
    private volatile long v19;
    private volatile long v20;
    private volatile long v21;
    private volatile long v22;
    private volatile long v23;
    private volatile long v24;

    private static final VarHandle V1;
    private static final VarHandle V2;
    private static final VarHandle V3;
    private static final VarHandle V4;
    private static final VarHandle V5;
    private static final VarHandle V6;
    private static final VarHandle V7;
    private static final VarHandle V8;
    private static final VarHandle V9;
    private static final VarHandle V10;
    private static final VarHandle V11;
    private static final VarHandle V12;
    private static final VarHandle V13;
    private static final VarHandle V14;
    private static final VarHandle V15;
    private static final VarHandle V16;
    private static final VarHandle V17;
    private static final VarHandle V18;
    private static final VarHandle V19;
    private static final VarHandle V20;
    private static final VarHandle V21;
    private static final VarHandle V22;
    private static final VarHandle V23;
    private static final VarHandle V24;

    static {
        try {
            V1 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v1", long.class);
            V2 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v2", long.class);
            V3 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v3", long.class);
            V4 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v4", long.class);
            V5 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v5", long.class);
            V6 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v6", long.class);
            V7 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v7", long.class);
            V8 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v8", long.class);
            V9 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v9", long.class);
            V10 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v10", long.class);
            V11 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v11", long.class);
            V12 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v12", long.class);
            V13 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v13", long.class);
            V14 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v14", long.class);
            V15 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v15", long.class);
            V16 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v16", long.class);
            V17 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v17", long.class);
            V18 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v18", long.class);
            V19 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v19", long.class);
            V20 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v20", long.class);
            V21 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v21", long.class);
            V22 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v22", long.class);
            V23 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v23", long.class);
            V24 = MethodHandles.lookup().findVarHandle(SimpleCounter.class, "v24", long.class);
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
            case 9: return (long) V9.getAndAdd(this, 1);
            case 10: return (long) V10.getAndAdd(this, 1);
            case 11: return (long) V11.getAndAdd(this, 1);
            case 12: return (long) V12.getAndAdd(this, 1);
            case 13: return (long) V13.getAndAdd(this, 1);
            case 14: return (long) V14.getAndAdd(this, 1);
            case 15: return (long) V15.getAndAdd(this, 1);
            case 16: return (long) V16.getAndAdd(this, 1);
            case 17: return (long) V17.getAndAdd(this, 1);
            case 18: return (long) V18.getAndAdd(this, 1);
            case 19: return (long) V19.getAndAdd(this, 1);
            case 20: return (long) V20.getAndAdd(this, 1);
            case 21: return (long) V21.getAndAdd(this, 1);
            case 22: return (long) V22.getAndAdd(this, 1);
            case 23: return (long) V23.getAndAdd(this, 1);
            case 24: return (long) V24.getAndAdd(this, 1);
        }

        return 0;
    }
}

package me.alidg;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class Padded8Counter implements Counter {

    private long p01, p02, p03, p04, p05, p06 = 0;
    private volatile long v1;
    private long p11, p12, p13, p14, p15, p16, p17, p18 = 0;

    private volatile long v2;
    private long p21, p22, p23, p24, p25, p26, p27, p28 = 0;

    private volatile long v3;
    private long p31, p32, p33, p34, p35, p36, p37, p38 = 0;

    private volatile long v4;
    private long p41, p42, p43, p44, p45, p46, p47, p48 = 0;

    private volatile long v5;
    private long p51, p52, p53, p54, p55, p56, p57, p58 = 0;

    private volatile long v6;
    private long p61, p62, p63, p64, p65, p66, p67, p68 = 0;

    private volatile long v7;
    private long p71, p72, p73, p74, p75, p76, p77, p78 = 0;

    private volatile long v8;
    private long p81, p82, p83, p84, p85, p86, p87, p88 = 0;

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
            V1 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v1", long.class);
            V2 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v2", long.class);
            V3 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v3", long.class);
            V4 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v4", long.class);
            V5 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v5", long.class);
            V6 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v6", long.class);
            V7 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v7", long.class);
            V8 = MethodHandles.lookup().findVarHandle(Padded8Counter.class, "v8", long.class);
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

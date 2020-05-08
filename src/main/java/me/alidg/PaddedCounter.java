package me.alidg;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class PaddedCounter implements Counter {

    private volatile long v1;
    private long p11, p12, p13, p14, p15, p16, p17 = 0;

    private volatile long v2;
    private long p21, p22, p23, p24, p25, p26, p27 = 0;

    private volatile long v3;
    private long p31, p32, p33, p34, p35, p36, p37 = 0;

    private volatile long v4;
    private long p41, p42, p43, p44, p45, p46, p47 = 0;

    private volatile long v5;
    private long p51, p52, p53, p54, p55, p56, p57 = 0;

    private volatile long v6;
    private long p61, p62, p63, p64, p65, p66, p67 = 0;

    private volatile long v7;
    private long p71, p72, p73, p74, p75, p76, p77 = 0;

    private volatile long v8;
    private long p81, p82, p83, p84, p85, p86, p87 = 0;

    private volatile long v9;
    private long p91, p92, p93, p94, p95, p96, p97 = 0;

    private volatile long v10;
    private long p10_1, p10_2, p10_3, p10_4, p10_5, p10_6, p10_7 = 0;

    private volatile long v11;
    private long p11_1, p11_2, p11_3, p11_4, p11_5, p11_6, p11_7 = 0;

    private volatile long v12;
    private long p12_1, p12_2, p12_3, p12_4, p12_5, p12_6, p12_7 = 0;

    private volatile long v13;
    private long p13_1, p13_2, p13_3, p13_4, p13_5, p13_6, p13_7 = 0;

    private volatile long v14;
    private long p14_1, p14_2, p14_3, p14_4, p14_5, p14_6, p14_7 = 0;

    private volatile long v15;
    private long p15_1, p15_2, p15_3, p15_4, p15_5, p15_6, p15_7 = 0;

    private volatile long v16;
    private long p16_1, p16_2, p16_3, p16_4, p16_5, p16_6, p16_7 = 0;

    private volatile long v17;
    private long p17_1, p17_2, p17_3, p17_4, p17_5, p17_6, p17_7 = 0;

    private volatile long v18;
    private long p18_1, p18_2, p18_3, p18_4, p18_5, p18_6, p18_7 = 0;

    private volatile long v19;
    private long p19_1, p19_2, p19_3, p19_4, p19_5, p19_6, p19_7 = 0;

    private volatile long v20;
    private long p20_1, p20_2, p20_3, p20_4, p20_5, p20_6, p20_7 = 0;

    private volatile long v21;
    private long p21_1, p21_2, p21_3, p21_4, p21_5, p21_6, p21_7 = 0;

    private volatile long v22;
    private long p22_1, p22_2, p22_3, p22_4, p22_5, p22_6, p22_7 = 0;

    private volatile long v23;
    private long p23_1, p23_2, p23_3, p23_4, p23_5, p23_6, p23_7 = 0;

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
            V1 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v1", long.class);
            V2 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v2", long.class);
            V3 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v3", long.class);
            V4 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v4", long.class);
            V5 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v5", long.class);
            V6 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v6", long.class);
            V7 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v7", long.class);
            V8 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v8", long.class);
            V9 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v9", long.class);
            V10 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v10", long.class);
            V11 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v11", long.class);
            V12 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v12", long.class);
            V13 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v13", long.class);
            V14 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v14", long.class);
            V15 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v15", long.class);
            V16 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v16", long.class);
            V17 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v17", long.class);
            V18 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v18", long.class);
            V19 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v19", long.class);
            V20 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v20", long.class);
            V21 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v21", long.class);
            V22 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v22", long.class);
            V23 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v23", long.class);
            V24 = MethodHandles.lookup().findVarHandle(PaddedCounter.class, "v24", long.class);
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

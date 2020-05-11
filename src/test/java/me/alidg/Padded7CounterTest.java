package me.alidg;

import org.junit.jupiter.api.Test;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Padded7CounterTest {

    private final Padded7Counter counter = new Padded7Counter();
    private final Unsafe unsafe = getUnsafe();

    @Test
    void offsetDifferenceShouldBeBiggerThanCacheLineSize() {
        long offsetForV1 = unsafe.objectFieldOffset(getField(counter.getClass(), "v1"));
        long offsetForV2 = unsafe.objectFieldOffset(getField(counter.getClass(), "v2"));

        long offsetDiff = offsetForV2 - offsetForV1;
        assertTrue(offsetDiff >= 64);
    }

    private Field getField(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Unsafe getUnsafe() {
        try {
            var field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);

            return (Unsafe) field.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

package me.alidg;

import org.junit.jupiter.api.Test;
import sun.misc.Unsafe;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCounterTest {

    private final SimpleCounter counter = new SimpleCounter();
    private final Unsafe unsafe = getUnsafe();

    @Test
    void verifyingSimpleCounterMemoryLayout() {
        assertEquals(16, offsetOf("v1"));
        assertEquals(24, offsetOf("v2"));
        assertEquals(32, offsetOf("v3"));
        assertEquals(40, offsetOf("v4"));
        assertEquals(48, offsetOf("v5"));
        assertEquals(56, offsetOf("v6"));
        assertEquals(64, offsetOf("v7"));
        assertEquals(72, offsetOf("v8"));
    }

    private long offsetOf(String fieldName) {
        return unsafe.objectFieldOffset(getField(counter.getClass(), fieldName));
    }

    private Unsafe getUnsafe() {
        try {
            var unsafe = Unsafe.class.getDeclaredField("theUnsafe");
            unsafe.setAccessible(true);

            return (Unsafe) unsafe.get(null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Field getField(Class<?> clazz, String fieldName) {
        try {
            return clazz.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}

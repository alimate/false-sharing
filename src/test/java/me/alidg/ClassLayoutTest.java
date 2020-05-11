package me.alidg;

import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;

public class ClassLayoutTest {

    @Test
    void printCounterLayout() {
        System.out.println(ClassLayout.parseClass(Padded4Counter.class).toPrintable());
    }
}

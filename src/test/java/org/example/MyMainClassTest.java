package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyMainClassTest {
    @Test
    public void testCompareIntegers() {
        MyMainClass myClass = new MyMainClass();
        assertEquals("firstInteger is greater than secondInteger", myClass.compareIntegers(5, 3));
        assertEquals("firstInteger is less than secondInteger", myClass.compareIntegers(2, 7));
        assertEquals("firstInteger is equal to secondInteger", myClass.compareIntegers(4, 4));
    }
}

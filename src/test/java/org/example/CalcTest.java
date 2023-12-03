package org.example;

import junit.framework.TestCase;

public class CalcTest extends TestCase {

    public void testAdd() {
        assertEquals(10, new Calc().add(5,5));
    }

    public void testSub() {
        assertEquals(0, new Calc().sub(5,5));
    }
}
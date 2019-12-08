package com.maxwit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void sumTest()
    {
        Calculator cal = new Calculator();
        int res = cal.add(1, 3);
        assertEquals(4, res);
    }
}

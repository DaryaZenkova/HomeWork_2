package ru.geekbrains.webuigroup;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

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
    public void testMultiplication(){
        int a = 5;
        int b = 7;
        int expected = 35;
        int result = App.multiplication(a, b);

        assertEquals(expected, result);
    }
}

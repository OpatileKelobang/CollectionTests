package org.example;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private List<Integer> actual;
    private List<Integer> expected;
    private int randomNumber;

    @Before
    public void setup() throws Exception
    {
        actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        expected = actual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    // Test List Equality
    @Test
    public void listEqualTest()
    {
        assertThat(actual, is(expected));
        System.out.println("Actual: " + actual + "\n" + "Expected: " + expected);
    }


    // Change actual List to random numbers
    @Test
    public void setTest()
    {
        Random random = new Random();

        for (int i = 0; i < actual.size(); i++) {
            randomNumber = random.nextInt(101);
            actual.set(i, randomNumber);
        }
        System.out.println("Random Numbers set:" + actual);
    }
}

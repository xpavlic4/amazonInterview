
package com.laurinka.amazon.interview.task1;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;


public class SortingByAlphabethTest {

    @Test
    public void testSoring() throws Exception {
        SortingByAlphabeth sortingByAlphabeth = new SortingByAlphabeth
                ();
        char[] color = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] arr = {'f', 'a', 'b', 'b', 'a', 'a', 'a'};
        sortingByAlphabeth.setColor(color);
        char[] run = sortingByAlphabeth.run(arr);
        char[] expected = {'a', 'a', 'a', 'a', 'b', 'b', 'f'};
        assertEquals(new String(expected), new String(run));

    }
}

import static junit.framework.Assert.assertEquals;

/**
 * Given a char array color[]={'a','b','c','d','e','f'.......'z'}
 * <p/>
 * and a random array arr[]= {'f','a','b','b','z','a','a','a'}
 * <p/>
 * you need to sort them such that resultant array will be {'a','a','a','a','b','b','f','z'}.
 * <p/>
 * Conditions:
 * 1) You should use swap function.
 * 2) Every element may repeat minimum 5 times and maximum 26 times.
 * 3) 'a' can be swapped only 1 time, 'b' can be swapped max 2 times,'c' can be swapped 3 times ...... z can be swapped max 26 times.
 * 4) You cannot make elements of given array to 0.
 * 5) you should not write helper functions.
 * <p/>
 * Input will be of 100 elements each.
 */
public class SortingByAlphabethTest {

    @org.junit.Test
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

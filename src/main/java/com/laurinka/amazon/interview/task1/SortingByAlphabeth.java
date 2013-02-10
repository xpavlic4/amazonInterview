package com.laurinka.amazon.interview.task1;


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
public class SortingByAlphabeth {
    char[] color;

    public char[] getColor() {
        return color;
    }

    public void setColor(char[] color) {
        this.color = color;
    }

    public char[] run(char[] arr) {
        int lastSwapIndex = 0;
        for (int i = 0; i < color.length; i++) {
            char pivot = color[i];
            for (int j = 0; j < arr.length; j++) {
                if (pivot == arr[j]) {
                    arr[j] = arr[lastSwapIndex];
                    arr[lastSwapIndex] = pivot;
                    lastSwapIndex++;
                }
            }

        }
        return arr;
    }

}
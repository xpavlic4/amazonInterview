/**
 * Created with IntelliJ IDEA.
 * User: radimpavlicek
 * Date: 10.02.13
 * Time: 19:45
 * To change this template use File | Settings | File Templates.
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
        for (int i = 0;i<color.length; i++) {
            char pivot = color[i];
            for (int j=0; j<arr.length; j++) {
                if (pivot==arr[j]) {
                    arr[j] = arr[lastSwapIndex];
                    arr[lastSwapIndex ] = pivot;
                    lastSwapIndex++;
                }
            }

        }
        return        arr;
    }

}
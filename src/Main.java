import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        int[] newArray = noOdds(array);
        System.out.println(Arrays.toString(newArray));
    }


    public static int[] noOdds(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
            }
        }

        return Arrays.copyOfRange(arr, 2, 7);
    }
}
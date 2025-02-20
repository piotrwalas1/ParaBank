package przyk2;
import java.util.Arrays;

public class odwracanieTabDwa {

    public static void main(String[] args) {
        int[] array = {7, 8, 9, 10, 11};
        System.out.println("Array : " + Arrays.toString(array));


        int[] reversedArray = reverse(array);
        System.out.println("Reversed array : " + Arrays.toString(reversedArray));
    }


    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }

        return newArray;
    }

}

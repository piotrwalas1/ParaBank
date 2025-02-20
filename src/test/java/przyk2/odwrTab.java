package przyk2;

public class odwrTab {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,3,5,88,7,0};
        for (int i = 0; i<( numbers.length/2); i++){
            int temp = numbers[i];
            numbers[i]= numbers[numbers.length-1-i];
            numbers[numbers.length-1-i]= temp;
        }
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
}

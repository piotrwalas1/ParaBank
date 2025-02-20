public class odwracanieTablicy {
    public static void main(String[] args) {
        int[] numbers = new int[]{0,1,4,9,5,7,8};
        for (int i =0; i<(numbers.length/2); i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
for (int i=0; i< numbers.length; i++){
    System.out.println(numbers[i]);
}
        }
    }


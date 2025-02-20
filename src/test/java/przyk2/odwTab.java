package przyk2;

public class odwTab {
    public static void main(String[] args) {
        int[] tab = new int[]{1,3,5,4,8};
        for(int i=0; i< tab.length/2; i++){
            int temp = tab[i];
            tab[i] = tab[tab.length - 1 -i];
            tab[tab.length - 1 - i] = temp;
        }
        for(int i=0; i< tab.length; i++){
            System.out.println(tab[i]);
        }


    }
}

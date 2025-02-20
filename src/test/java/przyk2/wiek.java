package przyk2;

import java.util.Scanner;

public class wiek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek: ");
        int wiek = scanner.nextInt();
        if (wiek >=18){
            System.out.println(" mozesz kupic piwo");
        }
        else if (wiek <= 0 ){
            System.out.println(" nie ma takiego wieku");
        }
        else System.out.println(" nie jestes pelnoletni i nie mozesz kupic piwa");
    }
}

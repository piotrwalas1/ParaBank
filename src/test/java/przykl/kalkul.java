package przykl;

import java.util.Scanner;

public class kalkul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe: ");
        int pierwszaLiczba = scanner.nextInt();
        System.out.println("podaj 2 liczbe: ");
        int drugaLiczba = scanner.nextInt();
        int dodawanie = pierwszaLiczba + drugaLiczba;
        int odejmowanie = pierwszaLiczba - drugaLiczba;
        int mnozenie = pierwszaLiczba * drugaLiczba;
        int dzielenie = pierwszaLiczba / drugaLiczba;
        System.out.println("wynik dodawania = " + dodawanie);
        System.out.println("wynik odejmowania = " + odejmowanie);
        System.out.println("wynik mnożenia = "+ mnozenie);
        System.out.println("wynik dzielenia = "+ dzielenie);
    }
}

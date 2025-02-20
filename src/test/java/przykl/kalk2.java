package przykl;

import java.util.Scanner;

public class kalk2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe : ");
        int a = scanner.nextInt();
        System.out.println("Podaj 2 liczbę :");
        int b = scanner.nextInt();

        kalk kalkulator = new kalk();
        int dod = kalkulator.dodawanie(a,b);
        int ode = kalkulator.odejmowanie(a,b);
        int mno = kalkulator.mnozenie(a,b);
        int dzie = kalkulator.dzielenie(a,b);
        System.out.println("dodawanie "+ dod);
        System.out.println("odejmowanie "+ ode);
        System.out.println("mnozenie "+ mno);
        System.out.println("dzielenie "+ dzie);
    }
}

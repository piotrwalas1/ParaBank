package przyk2;

import java.util.Scanner;

public class kalkTest {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println(" podaj 1 liczbe ");
        int pierwszaLiczba = scaner.nextInt();
        System.out.println("podaj 2 liczbe ");
        int drugaLiczba = scaner.nextInt();

        Calculator calculator = new Calculator();
        int dodawanie = calculator.dod(pierwszaLiczba, drugaLiczba);
        int odejmowanie = calculator.odej(pierwszaLiczba, drugaLiczba);
        int mnozenie = calculator.mnoz(pierwszaLiczba, drugaLiczba);

        int dzielenie = calculator.dziel(pierwszaLiczba, drugaLiczba);
        System.out.println(" wynik dodawania : "+ dodawanie);
        System.out.println("wynik odejmowania : "+ odejmowanie);
        System.out.println(" wynik mnozenia : "+ mnozenie);
        if(pierwszaLiczba > drugaLiczba){
            System.out.println("wynik dielenia " + dzielenie);}
            else System.out.println(" mianoiwnik ma byc wiekszy od licznika !!");



    }


}

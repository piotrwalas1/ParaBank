package przykl;

import java.util.Scanner;

public class kupno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" podaj swoj wiek : ");
        int wiek = scanner.nextInt();
        if (wiek >=18){
            System.out.println("jestes pelnoletni i mozesz kupic alkochol");}
            else {
                System.out.println(" niemasz 18 lat i idz do domu");
            }
        }


    }


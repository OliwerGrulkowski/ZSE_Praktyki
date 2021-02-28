package first_week.statements;

import java.util.Scanner;

public class lekcja_statements {

    public static void main(String[] args) {
        boolean stan = true;
        if(stan){
            System.out.println("Wykonała się instrukacja IF");
        }
            else{
            System.out.println("Wykonała się instrukcja ELSE");
        }
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swój wiek");
        int wiek = skaner.nextInt();

        if(wiek >= 18){
            System.out.println("Jesteś pełnoletni");
        }
        else{
            System.out.println("Jesteś niepełnoletni");
        }
        System.out.println("Podaj liczbę");
        int liczba = skaner.nextInt();

        if(10 < liczba && liczba < 20){
            System.out.println("Liczba mieści się w zakresie ");
        }
        else{
            System.out.println("Liczba mieści się w zakresie ");
        }
        System.out.println("Podaj liczbe całkowitą A: ");
        int a = skaner.nextInt();

        System.out.println("Podaj liczbe całkowitą B: ");
        int b = skaner.nextInt();

        if(a > b){
            System.out.println("A jest większe od B");
        }

        if(a < b){
            System.out.println("A jest mniejsze od B");
        }
        if(a == b){
            System.out.println("A jest równe B");
        }
        if(a > b){
            System.out.println("A jest większe od B");
        }

        if(a < b){
            System.out.println("A jest mniejsze od B");
        }
        if(a == b){
            System.out.println("A jest równe B");
        }
        else{
            if (a < b){
                System.out.println("A jest mniejsze od B");
            }
            else{
                System.out.println("A jest równe B");
            }


            char charA = 'A';
            char charB = 'B';

            if (charA == charB){
                System.out.println("charA ma wieksza wartosc od charB w tabeli ASCII");
            }
            else{
                System.out.println("charB ma mniejsza wartosc od charB w tabeli ASCII");
            }

            String hello = "hello";
            String world = "world";

            if(hello.equals(world)){
                System.out.println("hello jest rowne world");
            }
            else {
                System.out.println("hello nie jest rowne world");
            }

        }

    }

}

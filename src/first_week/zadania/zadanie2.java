package first_week.zadania;

import java.util.Scanner;

public class zadanie2 {

    public static void main(String[] args) {

        // Zad.1

        Scanner zad1 = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int x = zad1.nextInt();

        if (x > 0){
            System.out.println(" Liczba jest większa od 0");
        }
        else {
            System.out.println(" Liczba jest mniejsza od 0");
        }

        // Zad.2
        
        Scanner zad2 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int a = zad2.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int b = zad2.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int c = zad2.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("Największa liczba: " + a);
            }
        }
        if (a < b){
            if (c < b){
                System.out.println("Największa liczba: " + b);
            }
        }
        if (a > b){
            if (a < c){
                System.out.println("Największa liczba: " + c);
            }
        }
        // Zad.3

        Scanner zad3 = new Scanner(System.in);
        System.out.println("Podaj login: ");
        String login = zad3.next();
        System.out.println("Podaj hasło: ");
        String hasło = zad3.next();

        if (login.equals("admin")){
            if (hasło.equals("tajnehaslo")){
                System.out.println("Zalogowano pomyślnie ");
            }
            else{
                System.out.println("Niezautoryzowany użytkownik ");
            }
        }
        else{
            System.out.println("Niezautoryzowany użytkownik ");
        }
        // Zad.4

        Scanner zad4 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int aa = zad4.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int bb = zad4.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int cc = zad4.nextInt();
        if (aa > bb) {
            if (bb > cc) {
                System.out.println("Kolejność malejąca");
            }
        }
        if (aa < bb){
            if (bb < cc){
                System.out.println("Kolejność rosnąca");
            }
        }
        if (aa > bb){
            if (bb < cc){
                System.out.println("Brak kolejności");
            }
        }
        else {
            System.out.println("Brak kolejności");
        }
        // Zad.5

        Scanner zad5 = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        double w = zad5.nextDouble();
        System.out.println("Podaj drugą liczbę: ");
        double e = zad5.nextDouble();
        System.out.println("Podaj swój wybór (+,- ,* ,/): ");
        char wybor = zad5.next().charAt(0);

        switch (wybor){
            case '+':
                double sum = w + e;
                System.out.println("Dodawanie = " + sum);
                break;
            case '-':
                double odejm = w - e;
                System.out.println("Odejmowanie = " + odejm);
                break;
            case '*':
                double mnoz = w * e;
                System.out.println("Mnożenie = " + mnoz);
                break;
            case '/':
                double dziel = w / e;
                System.out.println("Dzielenie = " + dziel);
                break;
        }
    }
}

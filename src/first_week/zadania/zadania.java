package first_week.zadania;

public class zadania {
    public static void main(String[] args) {
        // Zadanie 1
        int A = 17;
        System.out.println("Mój wiek: " + A);
        double B = 4.8;
        System.out.println("Moja średnia w gimnazjum: " + B);
        char C = '@';
        System.out.println("Mój ulubiony znak: " + C);

        String myA = "Oliwer";
        String myB = " lubi ";
        String myC = "KFC";

        String sumString = myA + myB + myC;
        System.out.println(sumString + "\nAle jest nie zdrowe ;(");

        // Zadanie 2
        int a = 7;
        int b = 2;
        double wynik=a*a+b*b;
        System.out.println("Suma: " + wynik);

        // Zadanie 3
        double sqrt = Math.sqrt(3);
        int bok = 7;
        double wynikk = bok*bok*sqrt/4;
        System.out.println("Pole: "+ wynikk);

        // Zadanie 4
        String O ="Oliwer";
        String G =" Grulkowski";
        String sumaString = O + G;
        System.out.println(sumaString);
    }
}

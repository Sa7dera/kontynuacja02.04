import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //System.out.println("============.=============");

        //04.02
        //zad1

        System.out.println("============1=============");
           Scanner sc = new Scanner(System.in);
            System.out.print("Podaj swoj login: ");
            String login = sc.nextLine();

        System.out.print("Podaj swoj e-mail: ");
        String email = sc.nextLine();


        System.out.print("Podaj swoja nazwe uzytkownika: ");
        String username = sc.nextLine();




        //zad2
        System.out.println("============zadanie2=============");

        String nazwa = "";

        while (nazwa.isEmpty()) {
            System.out.print("podaj nazwe produktu: ");
            nazwa = sc.nextLine();
            if (nazwa.isEmpty()) {
                System.out.println("nazwa produktu nie moze byc pusta");
            }
        }
        int ilosc = 0;
        while (ilosc <= 0) {
            System.out.print("podaj ilosc sztuk: ");
            if (sc.hasNextInt()) {
                ilosc = sc.nextInt();
                if (ilosc <= 0) {
                    System.out.println("ilosc musi byc wieksza niż 0");
                }
            } else {
                System.out.println("blad! wpisz poprawna liczbe całkowita");
                sc.next();
            }
        }
        sc.nextLine();
        double cena = 0.0;

        while (cena < 0.01) {
            System.out.print("podaj cene za sztuke: ");
            if (sc.hasNextDouble()) {
                cena = sc.nextDouble();
                if (cena < 0.01) {
                    System.out.println("cena musi być rowna lub większa niż 0.01 zł");
                }
            } else {
                System.out.println("blad! Wpisz poprawną cene");
                sc.next(); // Usuwa błędne dane z wejścia
            }
        }
        System.out.println("zamówienie: " + ilosc + "x " + nazwa + " po " + cena + " zł");

        //03.Refaktoryzacja kodu
        //zad1
        System.out.println("============3=============");
        System.out.println("podaj wage ");
        double waga = sc.nextDouble();
        System.out.println("podaj wzrost (W METRACH 175cm---->1,75)");
        double wzrost = sc.nextDouble();
        double bmi= waga/(wzrost*wzrost);
        System.out.printf("Twoje BMI: %.2f\n", bmi);

        //zad2














    }
}
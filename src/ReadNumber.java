import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        int quantity = (int) readNumber("podaj liczbe produktow: ", 1, 100000);
        double price = (double) readNumber("podaj cene jednostkowa: ", 0, 100000);
        double vat = (double) readNumber("podaj podatek vat: ", 0, 100);
        double brutto=quantity*price*(1+vat/100);

        System.out.println(brutto);
    }

    public static double readNumber (String prompt,double min, double max){

        Scanner scanner = new Scanner(System.in);

        double value;


        while (true) {

            System.out.print(prompt);

            value = scanner.nextDouble();

            if (value >= min && value <= max)

                return value;

            System.out.println("Wartosc musi byc z zakresu od " + min + " do " + max);

        }

    }
}


import java.util.Scanner;
//04. tworzenie uniwersalnej metody..
//zad1
public class Temperatura {

    public static void main(String[] args) {
        int wiek = (int) readNumber("podaj wiek: ", 1, 120);
        double temp = (double) readNumber("podaj temperature ", 35, 42);
        System.out.println("wiek: " + wiek + " temperatura: " + temp + " stopni C");
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

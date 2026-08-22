import java.util.Scanner;

public class MedivealMeasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight (g): ");
        double grams = Double.parseDouble(scanner.nextLine());

        //kokonais luotien määrä
        double totalLuoti = grams / 13.28;

        //kokonais naulojen määrä
        int totalNaula = (int)(totalLuoti / 32);

        //Jako jäännös naulojen laskun jälkeen = luotien määrä
        double luoti = totalLuoti % 32;

        //Levisköjen määrä
        int leviska = totalNaula / 20;

        //Jako jäännös Levisköjen laskun jälkeen = naulojen määrä
        int naula = totalNaula % 20;

        System.out.printf("%.0f grams is %d leviskä, %d naula, %.2f luoti.",
                grams, leviska, naula, luoti);
    }
}

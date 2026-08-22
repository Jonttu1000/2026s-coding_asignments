import java.util.Scanner;

public class MedivealMeasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight (g): ");
        double grams = Double.parseDouble(scanner.nextLine());

        double luoti = grams / 13.28;
        double naula = luoti / 32;
        double levis = naula / 20;

        System.out.printf("%2f grams is %d leviskä, %d naula, %.2f luoti.",
                grams, (int)levis, (int)naula, luoti);


    }
}

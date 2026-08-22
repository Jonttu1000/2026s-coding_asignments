import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give temperature in Fahrenheit");

        float F = Float.parseFloat(scanner.nextLine());
        float C = (F-32)*5/9;

        System.out.println("\n");
        System.out.printf("Temperature in celsius = %6.1f\n", C);

    }
}

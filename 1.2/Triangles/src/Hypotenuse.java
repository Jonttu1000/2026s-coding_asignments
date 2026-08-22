import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the length of first side of a triangle");
        float first = Float.parseFloat(scanner.nextLine());

        System.out.println("Give the length of second side of a triangle");
        float second = Float.parseFloat(scanner.nextLine());

        double hypotenuse = Math.sqrt((Math.pow(first, 2) + Math.pow(second, 2)));

        System.out.printf("Hypotenuse of this triangle is: %6.2f\n", hypotenuse);
    }
}

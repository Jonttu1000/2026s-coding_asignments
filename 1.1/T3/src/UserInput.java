import java.util.Scanner;

/*
Using variables of type float in order to get a decimal number.
aswell as "Int.parseInt -> Float.parseFloat"
 */
public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number");
        float first = Float.parseFloat(scanner.nextLine());

        System.out.println("Give the second number");
        float second = Float.parseFloat(scanner.nextLine());

        System.out.println("Give the third number");
        float third = Float.parseFloat(scanner.nextLine());

        System.out.println("Sum = " + (first + second + third));
        System.out.println("Product = " + (first * second * third));
        System.out.println("AVG = " + ((first + second + third) / 3));
    }
}

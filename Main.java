import java.util.Scanner;

public class Main{
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Quadratic Equation Solver ===");

        System.out.print("Enter username: ");
        String inputUser = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPass = scanner.nextLine();

        if (inputUser.equals(USERNAME) && inputPass.equals(PASSWORD)) {
            System.out.println("Login successful.\n");

            System.out.print("Enter coefficient a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter coefficient b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter coefficient c: ");
            double c = scanner.nextDouble();

            double discriminant = b * b - 4 * a * c;
            System.out.println("Discriminant: " + discriminant);

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("One real root: " + root);
            } else {
                System.out.println("No real roots. Complex roots.");
            }
        } else {
            System.out.println("Authentication failed.");
        }
    }
}

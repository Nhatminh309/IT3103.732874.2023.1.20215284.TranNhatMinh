import java.util.Scanner;

public class oneVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập a
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        // Nhập b
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        scanner.close();

        if (a == 0 && b == 0)
        {
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if (a == 0 && b != 0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else
        {
            System.out.println("Phuong trinh co nghiem: " + (-b/a));
        }
    }
}

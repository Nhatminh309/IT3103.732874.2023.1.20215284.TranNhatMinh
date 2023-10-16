import java.util.Scanner;

public class twoVariable {
    public static void main(String[] args) {
        System.out.println("a11 + a12 = b1");
        System.out.println("a21 + a22 = b2");
        Scanner scanner = new Scanner(System.in);

        // Nhập a11
        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();

        // Nhập a12
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();

        // Nhập b1
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();

        // Nhập a21
        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();

        // Nhập a22
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();

        // Nhập b2
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();
        scanner.close();

        double D = a11 * a22 - a21 * a12;
        double D_x1 = b1 * a22 - b2 * a12;
        double D_x2 = a11 * b2 - a21 * b1;

        if (D == 0)
        {
            if (D_x1 == 0 && D_x2 == 0)
            {
                System.out.println("He phuong trinh vo so nghiem");
            }
            else
            {
                System.out.println("He phuong trinh vo nghiem");
            }
        }
        else
        {
            double x1 = D / D_x1;
            double x2 = D / D_x2;
            System.out.println("He phuong trinh co nghiem: x1 = " + x1 + " x2 = " +x2);
        }
    }
}

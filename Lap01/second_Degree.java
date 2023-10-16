import java.util.Scanner;
import java.lang.Math;

public class second_Degree {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);

        // Nhập a
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        // Nhập b
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        // Nhập c
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        scanner.close();

        if (a == 0)
        {
            System.out.println("Not second Degree (a = 0)");
        }
        else
        {
            double delta = b*b - 4*a*c;
            if (delta < 0)
            {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (delta == 0)
            {
                System.out.println("Phuong trinh co nghiem duy nhat " + (-b/(2*a)));
            }
            else 
            {
                System.out.println("Phuong trinh co hai nghiem x1 = " + ((-b + Math.sqrt(delta)) / ( 2* a)) 
                                    + " x2 = " + ((-b - Math.sqrt(delta)) / (2*a) ) );
            }

        }

    
    }
    
    
        
}

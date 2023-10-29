import java.util.Scanner;  // Import thư viện để sử dụng Scanner
import java.lang.Math;  // Import thư viện Math để sử dụng hàm tính toán

public class second_Degree {
    public static void main(String[] args) {
        System.out.println("ax^2 + bx + c = 0");
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        // Nhập giá trị của a
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        // Nhập giá trị của b
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        // Nhập giá trị của c
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        scanner.close();  // Đóng đối tượng Scanner

        if (a == 0) {
            System.out.println("Not second Degree (a = 0)");  // Trường hợp a = 0, không phải phương trình bậc hai
        } else {
            double delta = b * b - 4 * a * c;  // Tính delta
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");  // Trường hợp delta < 0, phương trình vô nghiệm
            } else if (delta == 0) {
                double solution = -b / (2 * a);  // Tính nghiệm duy nhất
                System.out.println("Phuong trinh co nghiem duy nhat " + solution);  // Trường hợp có một nghiệm
            } else {
                // Tính và hiển thị hai nghiệm
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co hai nghiem x1 = " + x1 + " x2 = " + x2);  // Trường hợp có hai nghiệm
            }
        }
    }
}

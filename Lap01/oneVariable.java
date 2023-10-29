import java.util.Scanner;  // Import thư viện để sử dụng Scanner

public class oneVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        // Nhập giá trị của a
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        // Nhập giá trị của b
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        scanner.close();  // Đóng đối tượng Scanner

        // Kiểm tra và giải phương trình tuyến tính
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");  // Trường hợp phương trình có vô số nghiệm
        } else if (a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");  // Trường hợp phương trình vô nghiệm
        } else {
            double solution = -b / a;  // Tính nghiệm của phương trình
            System.out.println("Phuong trinh co nghiem: " + solution);  // Trường hợp phương trình có một nghiệm
        }
    }
}

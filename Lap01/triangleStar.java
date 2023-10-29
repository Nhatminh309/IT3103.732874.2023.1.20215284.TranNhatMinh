import java.util.Scanner;  // Import thư viện để sử dụng Scanner

public class triangleStar {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = keyboard.nextInt();
        keyboard.close();  // Đóng đối tượng Scanner sau khi đã nhập giá trị n

        for (int i = 0; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");  // In ra khoảng trống để dịch phải tam giác
            }
            for (int j = n - i; j < n; j++) {
                System.out.print("* ");  // In ra dấu '*' để tạo hình tam giác
            }
            System.out.print("\n");  // Xuống dòng để chuyển sang dòng mới
        }
    }
}

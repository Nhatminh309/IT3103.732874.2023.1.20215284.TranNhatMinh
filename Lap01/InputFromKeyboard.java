import java.util.Scanner;  // Import thư viện để sử dụng Scanner

public class InputFromKeyboard {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);  // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím

        System.out.println("What is your name: ");  // Hiển thị thông báo yêu cầu nhập tên
        String strName = keyboard.nextLine();  // Đọc tên từ người dùng

        System.out.println("How old are you ?");  // Hiển thị thông báo yêu cầu nhập tuổi
        int iAge = keyboard.nextInt();  // Đọc tuổi từ người dùng

        System.out.println("How tall are you (m) ?");  // Hiển thị thông báo yêu cầu nhập chiều cao
        double dHeight = keyboard.nextDouble();  // Đọc chiều cao từ người dùng

        keyboard.close();  // Đóng đối tượng Scanner

        // Hiển thị thông tin đã nhập
        System.out.println("Mrs/Mr. " + strName + ", " + iAge + " years old."
                            + " Your height is: " + dHeight + ".");
    }
}

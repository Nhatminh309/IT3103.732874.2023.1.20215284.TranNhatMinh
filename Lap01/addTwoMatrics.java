// Import thư viện Scanner để đọc dữ liệu từ bàn phím
import java.util.Scanner;

// Khai báo lớp addTwoMatrics
public class addTwoMatrics {
    // Phương thức main, bắt đầu chương trình
    public static void main(String[] arg) {
        // Khai báo và khởi tạo ma trận arr1
        int arr1[][] = {{1, 2, 3}, {4, 5, 6}};

        // Khai báo và khởi tạo ma trận arr2
        int arr2[][] = {{1, 2, 3}, {7, 8, 9}};

        // Khai báo ma trận arr_sum để lưu tổng của hai ma trận arr1 và arr2
        int arr_sum[][] = new int[2][3];

        // In ra dòng thông báo
        System.out.println("Sum of two matrices: ");

        // Vòng lặp for lặp qua từng phần tử của ma trận
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                // Tính tổng của hai phần tử tương ứng từ arr1 và arr2, và lưu vào arr_sum
                arr_sum[i][j] = arr1[i][j] + arr2[i][j];
                // In ra giá trị của arr_sum[i][j] với một khoảng trắng
                System.out.print(" " + arr_sum[i][j]);
            }
            // Xuống dòng sau khi hoàn thành một hàng của ma trận
            System.out.print("\n");
        }
    }
}

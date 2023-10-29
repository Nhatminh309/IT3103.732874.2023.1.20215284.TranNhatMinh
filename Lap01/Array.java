import java.util.Arrays;  // Import thư viện để sử dụng Arrays
import java.util.Scanner;  // Import thư viện để sử dụng Scanner

public class Array {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);  // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím

        System.out.print("Nhap so phan tu: ");  // In ra thông báo yêu cầu nhập số phần tử của mảng
        int number = input.nextInt();  // Đọc số phần tử từ người dùng
        int arr[] = new int[number];  // Khai báo một mảng có kích thước dựa trên số phần tử người dùng đã nhập
        int sum = 0;  // Khởi tạo biến sum để tính tổng các phần tử mảng

        // Vòng lặp để nhập giá trị cho mảng và tính tổng
        for (int i = 0; i < number; i++) {
            arr[i] = input.nextInt();  // Đọc giá trị từ người dùng và gán vào mảng
            sum += arr[i];  // Cộng giá trị vào biến tổng
        }

        Arrays.sort(arr);  // Sắp xếp mảng theo thứ tự tăng dần

        System.out.println("Mang sau khi sap xep: ");  // In ra thông báo về việc sắp xếp mảng
        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + " ");  // In ra từng phần tử của mảng sau khi đã sắp xếp
        }
        System.out.print("\n");  // Xuống dòng sau khi hoàn thành việc in mảng

        System.out.println("Tong cua mang: " + sum);  // In ra tổng của mảng
        System.out.println("Gia tri trung binh: " + (1.0 * sum / number));  // In ra giá trị trung bình của các phần tử trong mảng
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class Array {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int number = input.nextInt();
        int arr[] = new int[number];
        int sum = 0;
        for (int i = 0; i < number; i++)
        {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep: " );
        for (int  i = 0; i < number; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Tong cua mang: " + sum);
        System.out.println("Gia tri trung binh: " + (1.0*sum/number));
    }
}

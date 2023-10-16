import java.util.Scanner;

public class addTwoMatrics{
    public static void main(String[] arg){
        int arr1[][] = {{1,2,3}, {4,5,6}};
        int arr2[][] = {{1,2,3}, {7,8,9}};
        int arr_sum[][] = new int[2][3];
        System.out.println("Sum of two matrics: ");
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                arr_sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(" " + arr_sum[i][j]);
            }
            System.out.print("\n");
        }

    }
}
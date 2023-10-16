import java.util.Scanner;
public class triangleStar {
    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = keyboard.nextInt();
        keyboard.close();

        for (int i = 0; i <= n; i++)
        {
            for (int  j = i; j < n; j++)
            {
                System.out.print(" ");
            }
            for (int j = n-i; j < n; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

}

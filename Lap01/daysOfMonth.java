import java.util.Scanner;
public class daysOfMonth {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        int year = input.nextInt();
        System.out.print("Nhap thang: ");
        String c = input.nextLine();
        String month = input.nextLine();
        String str1 = "January March May July August October December";
        String str2 = "April June September November";
        String str3 = "February";
        input.close();
        if (str1.contains(month))
        {
            System.out.println("31");
        }
        if (str2.contains(month))
        {
            System.out.println("30");
        }
        if (str3.contains(month))
        {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            {
                System.out.println("29");
            }
            else
            {
                System.out.println("28");
            }
        }

        switch(month)
        {
            case "1":
            case "3":
            case "5":
            case "7":
            case "8":
            case "10":
            case "12":
            System.out.println("31");
            break;
            case "4":
            case "6":
            case "9":
            case "11":
            System.out.println("30");
            break;
            case "2":
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            {
                System.out.println("29");
            }
            else
            {
                System.out.println("28");
            }
            break;

        }

    }
}

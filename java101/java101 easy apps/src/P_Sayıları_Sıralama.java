import java.util.Scanner;

public class P_Sayıları_Sıralama {

    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1,num2,num3;

        System.out.println("enter frist number");
        num1=input.nextInt();

        System.out.println("enter second number");
        num2=input.nextInt();

        System.out.println("enter third number");
        num3=input.nextInt();

        if (num1<num2 && num3 <num2)
        {
            if (num1<num3)
            {
                System.out.println("num2+ num3+ num1");
            }
            else
                System.out.println("num2+ num1+ num3");
        }
        else if (num1<num3 && num2 <num3)
            if (num1<num2)
            {
                System.out.println("num3+ num2+ num1");
            }
            else
                System.out.println("num3+ num1+ num2");

        else
            if (num2<num3)
            {
                System.out.println("num1+ num3+ num2");
            }
            else if (num3<num2)
            {
                System.out.println("num1+ num2+ num3");
            }

    }
}

import java.util.Scanner;

public class P_Burçlar {

    public static void main  (String[] args)
    {
        Scanner input = new Scanner(System.in);

        int month, day;

        System.out.println("which month were you born in");
        month=input.nextInt();

        System.out.println("which day were you born in");
        day=input.nextInt();

        if (month==1)
            if (day<=22 || day>22)
            {
                System.out.println("Capricorn");
            }
            else
                System.out.println("False value");

        else if (month==6)
        {
            if (day<=22 || day>22)
            {
                System.out.println("Twins");
            }
            else
                System.out.println("false value");

        }
        else
            System.out.println("false Number");

    }
}

import java.util.Scanner;

public class O_Muk_Number {
    public static void main (String [] args)
    {
        Scanner input =new Scanner(System.in);

        int value,plus=0;

        System.out.println("Enter value please:");
        value=input.nextInt();

        for (int i=1; i<value;i++)
        {
            if (value%i==0)
            {
                plus=plus+i;
            }
        }
        if (plus==value)
            System.out.println("prefect number");
        else if (plus!=value)
            System.out.println("not perfect number");


    }
}

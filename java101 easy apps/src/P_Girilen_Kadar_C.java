import java.util.Scanner;

public class P_Girilen_Kadar_C {

    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);

        int value;
        System.out.println(" Please enter value");
        value=input.nextInt();

        for (int i=0; i<=value;)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }

            
    }
}

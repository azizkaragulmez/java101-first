import java.util.Scanner;

public class O_Harmonik_Number {
    public static void main (String [] args)
    {
        Scanner input =new Scanner(System.in);
        int n;
        double plus=0;
        System.out.print("N enter value:");
        n=input.nextInt();

        for (int i=1; i<=n;i++)
        {
            plus=plus+(1.0/i);
        }
        System.out.println(plus);




    }
}

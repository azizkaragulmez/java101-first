import java.util.Scanner;

public class O_Star {
    public static void main (String[] args)
    {
        Scanner input =new Scanner(System.in);
        int value;
        System.out.println("enter value please: ");
        value=input.nextInt();

        for (int i=value; i>=1;i--)
        {
            System.out.println(" ");
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

        }
    }
}

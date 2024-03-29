import java.util.Scanner;

public class O_Dort_Bes_Katları {

    public  static  void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int value;
        System.out.print("Enter value:");
        value=input.nextInt();
        for (int i=0; i<=value ;i++)
        {
            if (i%4==0 && i%5==0)
            {
                System.out.println(i);
            }

        }


    }
}

import java.util.Scanner;

public class O_Toplam_Bulan
{
    public static void main (String [] args)
    {
        Scanner input =new Scanner(System.in);
        int value,plus=0;
        do {
            System.out.println("Enter value please");
            value=input.nextInt();
            if (value%2==0)
                plus+=value;
            }
        while (value%2==0);
        System.out.println(plus);
    }
}

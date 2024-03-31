import java.util.Scanner;

public class O_Armstrong_Number {
    public static void  main (String [] args)
    {
        Scanner input =new Scanner(System.in);
        int number,basNumber=0;
        System.out.print("Please, enter number:");
        number=input.nextInt();


        while (number>0)
        {
            basNumber+=number%10;
            number=number/10;

        }
        System.out.println(basNumber);





    }
}

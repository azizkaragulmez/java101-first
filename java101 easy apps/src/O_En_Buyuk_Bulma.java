import java.util.Scanner;

public class O_En_Buyuk_Bulma
{
    public  static void main (String[]  args)
    {
        Scanner  input =new Scanner(System.in);

        int value,value2,value3=0,max=0,min=0;
        System.out.println("How many values will you enter?");
        value=input.nextInt();

        for (int i=1; i<=value; i++)
        {
            System.out.print(i+"enter value please:");
            value2=input.nextInt();
            if (value2>max)
            {
                max=value2;

            }
            else if (value2<max)
            {
                min=value2;
            }


        }
        System.out.println(max);
        System.out.println(min);


    }
}

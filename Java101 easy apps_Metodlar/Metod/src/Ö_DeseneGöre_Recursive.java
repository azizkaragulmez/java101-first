import java.util.Scanner;

public class Ö_DeseneGöre_Recursive {

    public static void main (String[] args)
    {
        Scanner input =new Scanner(System.in);
        System.out.print("Number enter:");
        int number=input.nextInt();
        int temp=number;

        senaryo(number,temp);
    }
    static void senaryo(int number,int temp)
    {
        if ( number>0)
        { System.out.println(number);
            senaryo(number-5,temp);
        }
        else if (number<=0)
            senoryo2(number, temp);
        }

    static void senoryo2(int number,int temp)
    {
        if (temp>=number)
        {
            System.out.println(number);
            senoryo2(number+5,temp);
        }
    }
    }


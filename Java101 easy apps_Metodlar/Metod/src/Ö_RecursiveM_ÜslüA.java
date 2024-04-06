import java.util.Scanner;

public class Ö_RecursiveM_ÜslüA
{

    static int pow(int alt,int ust){

        if (ust==0)
            return 1;
        else
            return alt*pow(alt,ust-1);

    }
    public static void main (String[] args)
    {
        Scanner intput=new Scanner(System.in);
        System.out.println("alt degerini gir:");
        int alt=intput.nextInt();
        System.out.println("üst degerini gir:");
        int üst=intput.nextInt();
        System.out.println(pow(alt,üst));


    }
}

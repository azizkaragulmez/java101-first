import java.util.Scanner;

import java.util.Scanner;
public class P_Taksimetre {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Ne kadar gidiceğinizi yazınız :");
        double gidilen = input.nextDouble();
        double km = 2.2;
        double acilis = 10.0;
        double tutar = 10.0 + km * gidilen;
        double deger = tutar < 20.0 ? 20.0 : tutar;
        System.out.println("ödenecek tutar" + deger);


    }
}

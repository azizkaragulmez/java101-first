import java.util.Scanner;

public class P_Sınıf_Geçme {

    public static void main (String []args)
    {
        Scanner input =new Scanner(System.in);
        int mat,fizik,türkçe,kimya,müzik;
        double average;

        System.out.println("Matematik notunuzu giriniz:");
        mat=input.nextInt();

        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();

        System.out.println("Türkçe notunuzu giriniz:");
        türkçe=input.nextInt();

        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();

        System.out.println("Müzik notunuzu giriniz:");
        müzik=input.nextInt();

        average = (mat+fizik+türkçe+kimya+müzik)/5.0;

        if (average <=55)
        {
            System.out.println("Kaldınız, notunuz->"+average);
        }
        else if (average>100)
        {
            System.out.println("Yanlış değerler girdiniz");
        }
        else
            System.out.println("TEBRİKLERRR..."+average);

    }
}

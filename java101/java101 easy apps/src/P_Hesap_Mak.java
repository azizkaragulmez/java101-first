import java.util.Scanner;

public class P_Hesap_Mak {

    public static void main(String[] args) {

        double sayi1,sayi2;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("1. sayıyı giriniz :");
        sayi1=input.nextDouble();
        System.out.println("2. sayıyı giriniz :");
        sayi2=input.nextDouble();

        System.out.println("Yapmak istediğiniz işlem 1/Toplama 2/Çıkarma 3/Bölme 4/Çarpma");
        select=input.nextInt();

        if (select==1)
        {
            System.out.println("Toplam"+(sayi1+sayi2));
        }
        else if (select==2)
        {
            System.out.println("Çıkarma"+(sayi1-sayi2));
        }
        else if (select==3)
        {
            System.out.println("Bölme"+(sayi1/sayi2));
        }
        else if (select==4)
        {
            System.out.println("Çarpma"+(sayi1*sayi2));
        }
        else
        {
            System.out.println("YANLIŞ DEĞER GİRDİNİZ. ");
        }


    }
}

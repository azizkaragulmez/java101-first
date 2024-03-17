import java.util.Scanner;
public class P_not_ort {
    public static void main(String[] args)
    {
        int mat,fizik,kimya,turkce,tarih,muzik;
        float sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunu Gir; ");
        mat=input.nextInt();

        System.out.println("Fizik Notunuzu Gir; ");
        fizik=input.nextInt();

        System.out.println("kimya Notunuzu Gir; ");
        kimya=input.nextInt();

        System.out.println("Türkçe Notunuzu Gir; ");
        turkce=input.nextInt();

        System.out.println("Tarih Notunuzu Gir; ");
        tarih=input.nextInt();

        System.out.println("Muzik Notunuzu Gir; ");
        muzik=input.nextInt();

        sonuc=(mat+fizik+kimya+fizik+tarih+muzik)/6f;
        System.out.println(sonuc);

    }
}
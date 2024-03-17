import java.util.Scanner;

public class O_Vucut_Indeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz :");
        double boy = input.nextDouble();
        System.out.println("Boyunuzu giriniz :");
        double kilo = input.nextDouble();
        double sonuc = boy * boy / kilo;
        System.out.println("Vücut İndeksiniz :" + sonuc);
}}

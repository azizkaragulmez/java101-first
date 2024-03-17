import java.util.Scanner;

public class O_Not_Ortalaması {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz :");
        int vize = input.nextInt();
        System.out.println("Final Notunuzu giriniz :");
        int fınal = input.nextInt();
        float puan = (float)(vize / 100 * 40) + (fınal / 100 * 60);
        String sonuc = puan > 60.0F ? "geçti" : "kaldı";
        System.out.println(sonuc);
}}

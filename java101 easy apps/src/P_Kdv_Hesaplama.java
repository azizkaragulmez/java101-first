import java.util.Scanner;

public class P_Kdv_Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kdv tutarını giriniz :");
        double fiyat = input.nextDouble();
        double kdv;
        if (fiyat < 1000.0 && fiyat > 0.0) {
            kdv = fiyat / 100.0 * 18.0;
            kdv += fiyat;
        } else {
            kdv = fiyat / 100.0 * 8.0;
            kdv += fiyat;
        }

        System.out.println("Kdvsiz  fiyat :" + fiyat);
        System.out.println("Kdvli fiyat :" + kdv);
}}

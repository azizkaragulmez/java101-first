import java.util.Scanner;

public class O_Manav_Kasa_P {
    public static void main(String[] args) {
        float armut = 2.14F;
        float elma = 3.67F;
        float domates = 1.11F;
        float muz = 0.95F;
        float patlıcan = 5.0F;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo alıcağınız giriniz:");
        System.out.println("Armut,Elma,Domates,Muz,Patlıcan =");
        float karmut = input.nextFloat();
        float kelma = input.nextFloat();
        float kdomates = input.nextFloat();
        float kmuz = input.nextFloat();
        float kpatlıcan = input.nextFloat();
        armut *= karmut;
        elma *= kelma;
        domates *= kdomates;
        muz *= kmuz;
        patlıcan *= kpatlıcan;
        float toplam = armut + elma + domates + muz + patlıcan;
        System.out.println("Toplam Tutar :" + toplam);
}}

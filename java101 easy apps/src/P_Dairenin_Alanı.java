import java.util.Scanner;

public class P_Dairenin_Alanı {
    public static void main(String[] args) {
        double pi = 3.14;
        double alfa = 90.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz :");
        double r = input.nextDouble();
        double alan = pi * r * r * alfa / 360.0;
        System.out.println("Alanı :" + alan);
}}

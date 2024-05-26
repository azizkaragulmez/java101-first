import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DigerKonular_Sayi_Tahmin_Oyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean İsWorg = false;

        int [] list= new int[5];

        while (right < 5) {
            System.out.println("Lütfen Bir Değer Giriniz :");
            selected = input.nextInt();
            if (selected < 0 || selected > 99) {
                System.out.println("lütfen 0-100 arası sayı giriniz.");

                if (İsWorg) {
                    right++;
                    System.out.println("Çok hata yaptın reis, kalan hakkın :" + (5 - right));

                } else {
                    İsWorg = true;
                    System.out.println(" Bir daha yanlış girerseniz canınızdan eksilir...");
                }
                continue;
            }

            if (number == selected) {
                System.out.println("TEBRİKLER BİLDİNİZ...");
                break;
            } else {
                System.out.println("Yanlış sayı girdiniz:");
                if (selected < number) {
                    System.out.println("Biraz daha yukarı çık...");
                } else {
                    System.out.println("Biraz aşağı innnn...");
                }
                list[right++]=selected;

                System.out.println("Kalan hakkın :"+(5-right));
            }

        }

        for (int i=0; i<list.length; i++)
        {
            if (list[i]!=0)
            System.out.print("["+list[i]+"]");
        }
        System.out.println("");
        System.out.println(number);

    }

}

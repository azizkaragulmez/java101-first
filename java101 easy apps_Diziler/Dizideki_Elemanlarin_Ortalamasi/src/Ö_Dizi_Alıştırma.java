import java.util.Arrays;
import java.util.Scanner;

public class Ö_Dizi_Alıştırma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Boyut giriniz :");
        int size = input.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print(i+1 + ". Değer:");
            int value = input.nextInt();
            list[i]=value;
        }

        Arrays.sort(list);
        System.out.print(Arrays.toString(list));


    }
}

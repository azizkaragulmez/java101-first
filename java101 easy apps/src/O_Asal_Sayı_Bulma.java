import java.util.Scanner;

public class O_Asal_Sayı_Bulma {
    public static void main(String[] args)
    {


                System.out.println("Asal sayılar 1 ile 100 arasında:");

                for (int num = 2; num <= 100; num++) {
                    if (isPrime(num)) {
                        System.out.print(num + " ");
                    }
                }
            }

            // Bir sayının asal olup olmadığını kontrol eden metod
            public static boolean isPrime(int num) {
                if (num <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }



   

import java.util.Scanner;

public class O_Uçak_Bileti_H {

    public static void main (String [] args )
    {
        Scanner input = new Scanner(System.in);

        int preference, km,age;
        double price=0;

        System.out.println("How many km will you go?");
        km=input.nextInt();

        System.out.println("How old are you?");
        age=input.nextInt();

        System.out.println("Departure and round trip (1/2)");
        preference=input.nextInt();

        if (age<12)
        {
            if (preference == 1) {
                price = (km * 0.10f);
                price = (price / 100) * 50;
            } else {
                price = (km * 0.10f);
                price = +(price / 100) * 50;
                price = +(price / 100) * 20;
            }
        }
        else if (age>=12 && age<=24)
        {
            if (preference == 1) {
                price = (km * 0.10f);
                price = +(price / 100) * 10;
            } else if (preference==2){
                price = (km * 0.10);
                price = -(price / 100) * 10;
                price = -(price / 100) * 20;
                price=price*2;
            }
            else
                System.out.println("false value");
        }
        else if (age>=65)
        {
            if (preference == 1) {
                price = (km * 0.10f);
                price = +(price / 100) * 30;
            } else if (preference==2){
                price = (km * 0.10f);
                price = +(price / 100) * 30;
                price = +(price / 100) * 20;
            }
            else{
            System.out.println("false value");
        }
        }
        else {
            System.out.println("false value");
        }
        System.out.println("Price"+price);
    }
}

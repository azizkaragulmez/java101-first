import java.util.Scanner;

public class O_ATM_Project {
    public static void main (String []args)
    {
        Scanner input =new Scanner(System.in);

        String user,password;
        int vote;
        double plus=0,money;
        System.out.println("enter user");
        user=input.nextLine();
        System.out.println("enter password");
        password=input.nextLine();

        if (user.equals("AzizK") && password.equals("dev123"))
        {
            System.out.print("action you want to take=(1-Deposit 2-Withdrawal 3-Inquire Balance 4-Log Out)");
            vote=input.nextInt();
            switch (vote)
            {
                case 1:
                    System.out.println("Yatırmak istediğiniz miktar=");
                    money=input.nextDouble();
                    plus+=money;
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz Miktar=");
                    money=input.nextDouble();
                    plus-=money;
                    break;
                case 3:
                    System.out.println("Bakiyeniz"+plus);
                    break;
                case 4:
                    break;
                default:
                    System.out.print("Yanlış tuşlama yaptınız");


            }
            System.out.println(plus);
        }
    }
}

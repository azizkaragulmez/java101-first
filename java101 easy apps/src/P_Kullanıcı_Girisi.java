import java.util.Scanner;

public class P_Kullanıcı_Girisi {


    public static void main(String[] args)
    {
        String password,username,decision;


        Scanner input =new Scanner(System.in);

        System.out.println("Kullanıcı adınızı giriniz=");
        username=input.nextLine();

        System.out.println("Şifrenizi giriniz=");
        password=input.nextLine();

        if (username.equals("Aziz") && password.equals("Karagülmez"))
        {
            System.out.println("Giriş Başarılı...");
        }
        else
        {
            System.out.println("Username veya Password yanlış...");
            System.out.println("Şifrenizi değiştirmek istermisiniz? (e/h)");
            decision=input.nextLine();
            if (decision.equals("e"))
            {
                System.out.println("Kullanıcı adınızı giriniz=");
                username=input.nextLine();

                System.out.println("Şifrenizi giriniz=");
                password=input.nextLine();
            }
            else if (decision.equals("h"))
            {
                System.out.println("Değiştirilmedi...");
            }
        }

    }
}

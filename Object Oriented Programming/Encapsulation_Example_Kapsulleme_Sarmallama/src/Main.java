public class Main {
    public static void main(String[] args)
    {

        Kitap kişi1= new Kitap("Nasrettin hoca","Kemalettin Şükrü",-100);
        kişi1.sayfaSayisi=-222;   // doğrudan erişim yapabildiğimiz için tamamen önüne geçmiş olmadık, şimdi private yapıcaz.
        kişi1.print();


    }
}
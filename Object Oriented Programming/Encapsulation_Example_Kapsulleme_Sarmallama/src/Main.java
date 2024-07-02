public class Main {
    public static void main(String[] args)
    {

        Kitap kişi1= new Kitap("Nasrettin hoca","Kemalettin Şükrü",-100);
     // kişi1.sayfaSayisi=-222;   // doğrudan erişim yapabildiğimiz için tamamen önüne geçmiş olmadık, şimdi private yapıcaz.
        // artık doğrudan erişimi kalmadı ama bizde değişim yapamıyoruz.
        System.out.println(kişi1.getSayfaSayisi());  //burda naptık doğrudan ulaşmamızı sağladık.
        kişi1.print();
        kişi1.setSayfaSayisi(-200);
        kişi1.print();

    }
}
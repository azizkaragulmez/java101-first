public class Main {
    public static void main(String[] args)
    {
        int [] list= new int[10];  //bu kod dizinin hafızada yer açmasını sağlıyor şuan hafızada yer açtı.
        list [0]=10;
        list [1]=20; //dizide 0 ve 1 yere 10 ve 20değerini atadım.

        System.out.println(list[0]); //0. indixi yazıdrmamıza yarıyor. //Bura basit tanımlamalar.
        System.out.println(list.length); // length bize dizinin boyutunu söylüyor.

        System.out.println("----------");


        for (int i=0; i< list.length; i++) //dizinin boyutu kadar döndür demek
        {
            list[i]= (i+1)*10;
            System.out.println(list[i]);
        }


        System.out.println("---------DİĞER TANIMLAMA YÖNTEMİ-------");

        int [] list2 ={10,20,30,40,50,60,70,80,90,100};  //Bu da başka tanımlama yöntemi. dizinin boyutu 10 mesela.




    }
}
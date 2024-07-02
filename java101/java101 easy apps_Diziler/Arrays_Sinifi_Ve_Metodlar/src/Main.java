import java.util.Arrays;  //bunu projemize eklediğimizde kullanabileceğimiz kısa yollar kodlar var.
public class Main {
    public static void main(String[] args)
    {
        int [] list={1,2,3,4};
        double[]  list2={1.1,1.2};

       // HelperArray helperArray=new HelperArray();
        HelperArray.print(list);    //direk nasıl eriştik diğer HelperArray de ki metodu static yaptık.
                                    //static yaparsak direk ulaşma imkanı sağlıyor ilerde detaylı görücez.


        System.out.println();
        System.out.println("Direk yazdırma");
        System.out.println(Arrays.toString(list));   //import edersek bunları projemizde kullanabiliriz.
        System.out.println(Arrays.toString(list2));  //double int farketmeden hepsini ekrana yazırmamızı sağlıyor.

        System.out.println("Dizide ki elemanları değiştirme");
        Arrays.fill(list,10);   //dizideki elemanları değiştirmemize yarıyor.
        Arrays.fill(list,1,2,11);   //bu kullanım 1. başla ve 2. kadar indexler arasındakileri 11 yap demek
        System.out.println(Arrays.toString(list));


        System.out.println("Dizideki Elemanları Sıralama");
        int []list3={1,4,5,3,2,52,3,4,5,8};
        Arrays.sort(list3);                              //Dizideki elemanları sıralamamıza yardım eder.
        System.out.println(Arrays.toString(list3));


        System.out.println("Aradığımız değerin kaçıncı indix'te olduğunu bulma");
        System.out.println(Arrays.binarySearch(list3,52));  //dizideki değerin kaçıncı indexe dek geldiğini söyler


        System.out.println("Dizideki değerleri kopyalama");
        int [] list4={1,4,6,3,23,52,31,4,5,8};
        int [] copylist=Arrays.copyOf(list4,3);         //list4 den kaç tane indexi koyalıcamı seçerek copylist dizisine atadık.
                                                                  //Direk list4.length diyip hepsinide kopyalayabilirdik.
        int [] copylist2=Arrays.copyOfRange(list4,1,5);  //1 dahil 5. indexe kadar değerleri kopyala demek

        System.out.println(Arrays.toString(copylist2));


        System.out.println("Dizilerin eşit olup olmadığını sorgulama");
        int [] list5={1,2,3};
        int [] list6={1,2,3};
        int [] list7={4,5,6};

        System.out.println(Arrays.equals(list5,list6));   //list5 ve list6 eşitmi diye sorgu yapıyor. Eşitse True değilse False döndürür.


        System.out.println(HelperArray.karşilaştir(list5,list7));









    }
}
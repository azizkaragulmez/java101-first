public class Dizilerde_Parametre {


    static void printArray (int [] arr){  //parametreler dizilerde farklı burda main kısmındaki dizileri bu  parametreyi çağrarak yazabiliyoruz.
        for (int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    static void printArray (double[] arr){ //Burda aynı isimde ama türleri farklı bu ne demiştik overloading (aşırı yükleme) yaptık
        for (int i=0;i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String [] args)
    {
        int [] list = {10,20,30,40,50};
        printArray(list);

        System.out.println("------------");

        double [] list2={1.1,2.2,3.3};
        printArray(list2);

    }
}

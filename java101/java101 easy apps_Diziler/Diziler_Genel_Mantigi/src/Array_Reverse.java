import java.util.Arrays;

public class Array_Reverse {

    static int[] reverse (int [] list){    //geri dönen değer dizi olcağı için int [] dedik. Ve gönderdiğimiz değer ve reverse atıcamız ismi aynı olmalı.
        int [] reverse= new int[list.length];   //tersine çevirerek yeni bir dizi oluşturcağımız için yeni bir dizi açmış olduk.
        for (int i=0 , j=list.length-1; i<list.length; i++,j--){  //çok fazla kullanılan yöntem değil ama bilelim
            reverse [i]=list[j];  //atama yapıyor.
        }
        return  reverse;
}

    static void printArray(int [] arr){
        for (int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void  main (String[] args){

        int [] list = {1,2,3,4,5,6,7,8,9,10};
        int [] newList= reverse(list);    // reversten ers gelen list i neyi listeye atıyoruz
        printArray(newList);              // yeni oluşan listeyide yazdırııyoruz

            float [] dizi ={1.2F,3.2F};

            for (int i=0;i< dizi.length;i++)
            {
                System.out.println(dizi[i]);
            }
    }
}

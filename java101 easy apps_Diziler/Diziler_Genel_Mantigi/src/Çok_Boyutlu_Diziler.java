public class Çok_Boyutlu_Diziler {

    public static void main(String[] args) {
        int[][] list = new int[3][3];   //Tek boyutlu dizillerdekinden tek farkı sütünde olması diyebiliriz.
        list[0][0] = 10;                 //değer atıcağımızda gene sütünde belirtmemiz gerek.
        System.out.println(list[0][0]);

        System.out.println("------Diğer yöntem-------");

        int[][] list2 = {           //diğer tanımlama yöntemide böyle
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        System.out.println(list2[0][2]);


        System.out.println("-------Matrisi Doldurma----------");

        int[][] matris = new int[3][4];
        System.out.println(matris.length);   //Bu tek boyutluda bizi bouyutu verirdi.Burda ise satırs sayısını veriyor. Gene aynı düşünce
        System.out.println(matris[0].length); //Böyle yaparsak 0. indexteki satır sayının sütün sayısını verir bize.

        int number = 1;
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = number++;

            }
        }

        for (int i=0; i<matris.length;i++){
            for (int j=0; j<matris[i].length;j++)
            {
                System.out.print(matris[i][j]+"   ");
            }
            System.out.println(" ");
        }

    }
}

public class Forech_Kullanımı {

    public static void main(String[] args)
    {
        int [] list={1,2,3,4,5};

        for (int i=0; i<list.length; i++)
        {
            System.out.println(list[i]+" ");
        }

        System.out.println("----Forech kullanımı----");

        int sum=0;
        for (int i: list)      //listadındaki dizileri hepsini taramayı sağlıyor
        {
            //System.out.println(i);      //diziyi ekrana bastırır
            sum=sum+i;
        }
        System.out.println(sum);


        System.out.println("--------Çok boyutlu dizilerde Forech---------");

        int [][] matris= { {1,2,3},
                           {4,5,6}};

                for (int i=0; i<matris.length;i++)
                {
                    for (int j=0; j<matris[i].length;j++)
                    {
                        System.out.print(matris[i][j]+" ");
                    }
                    System.out.println();
                }


                for (int []row: matris)
                {
                    for (int  col: row)
                    {
                        System.out.print(col+" ");
                    }
                    System.out.println();
                }


    }

}

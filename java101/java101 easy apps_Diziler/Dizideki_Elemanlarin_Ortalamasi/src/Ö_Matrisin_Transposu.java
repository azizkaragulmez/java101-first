import java.util.Arrays;

public class Ö_Matrisin_Transposu {
    public  static void main  (String [] args)
    {
        int [][] list= {{1,2,3},
                        {3,4,5}};
        int[][] list2= new int[list[0].length][list.length];   //list[0].length ilk satırın uzunluğunu verir

        for (int i=0; i<list.length; i++)
        {
            for (int j=0; j<list[0].length; j++)
            {
                list2[j][i]=list[i][j];

            }

        }
        for (int i=0; i< list2.length; i++)
        {
            for (int j=0; j<list2[0].length;j++)
            {
                System.out.print(list2[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

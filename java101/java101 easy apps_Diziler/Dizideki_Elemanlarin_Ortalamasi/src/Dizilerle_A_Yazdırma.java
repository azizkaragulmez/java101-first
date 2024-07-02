import java.sql.SQLOutput;

public class Dizilerle_A_Yazdırma {
    public static void main(String[] args)
    {
        String [][] yazdir= new String[6][4];



        for (int i=0; i<yazdir.length;i++)
        {
            for (int j=0; j<yazdir[i].length; j++)
            {
                if (i==0 || i==2 )
                {
                    yazdir[i][j]="*";
                }
                else if (j==0 || j==3){
                    yazdir[i][j]="*";
                }
                else
                {
                    yazdir[i][j]=" ";
                }

            }

        }

        for (String [] i: yazdir)
        {
            for (String j:i)
            {
                System.out.print(j);
            }
            System.out.println();
        }





    }
}

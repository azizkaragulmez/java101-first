public class Ö_Dizide_Frekans_KONTROLET {
    public static void main  (String [] args)
    {
        int [] list= {10,20,20,10,10,20,5,20};

        int toplam=0;

        for (int i=0; i< list.length; i++)
        {
            for (int j=0;j<list.length; j++)
            {
                if (i!=j && list[i]==list[j])
                {
                    toplam++;
                }
            }
            System.out.println(list[i]+" sayısı "+toplam+" kere tekrar edildi.");
            toplam=0;
        }

        //KONTROL ET

    }
}

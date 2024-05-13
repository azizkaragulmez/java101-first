public class Dizideki_En_Büyük_Bulma {
    public static void main (String [] args)
    {
        int [] list={1,2,3,4,5,6,33,23};

        int min=list[0];
        int max=list[0];

        for (int i: list)
        {
            if (i < min)
            {
                min=i;
            }
            if (i>max)
            {
                max=i;
            }
        }
        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }
}

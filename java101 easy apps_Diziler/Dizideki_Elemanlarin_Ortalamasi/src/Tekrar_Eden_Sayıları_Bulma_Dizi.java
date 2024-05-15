public class Tekrar_Eden_Sayıları_Bulma_Dizi {

    static boolean isFind(int [] arr, int value)
    {
        for (int i: arr)
        {
            if (i==value)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 1, 2, 3, 3, 4, 99, 5, 3,6,6};
        int[] duplicate= new int[list.length];
        int starindex=0;

        for (int i = 0; i < list.length; i++)
        {
            for (int j=0; j<list.length; j++)
            {
                if (i!=j && list[i]==list[j])
                {
                    if (list[i]%2==0)
                    {
                        if (isFind(duplicate,list[i]))
                        {
                            duplicate[i]=list[i];
                        }
                    }
                }

            }
        }

        for (int i: duplicate)
        {
            if (i!=0)
            {
                System.out.println(i);
            }
        }


    }
}

public class HelperArray {

   static void print(int [] arr)    //static yazmadanda oluyor biliyorsun.
    {
        System.out.print("[");
        for (int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.print("]");
    }

    static boolean karşilaştir(int [] l1, int [] l2)
    {
        for (int i=0; i<l1.length; i++)
        {
            for (int j=0; j<l2.length; j++)
            {
                if (l1[i]==l2[j])
                {
                    return true;
                }

            }
        }
        return false;
     }

}

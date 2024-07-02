public class Ortalma_Bulma {
    public static void main(String[] args)
    {
       double [] list= {2,3,4,10,5,6};

       double sum=0;
       for (int i=0; i<list.length; i++)
        {
            sum=sum+list[i];

        }
        System.out.println("Ortalaması: "+ sum/ list.length);
    }
}
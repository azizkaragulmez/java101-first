public class Recursive_Özyineli {


    static int  sum(int x)
    {
        if (x==10)
        {
            System.out.println(x);
            return 10;
        }
        System.out.println(x);   // adım adım işlemleri göremize yarıyor.
        return x+sum(x+1);   // sum (x+1) demek sürekli çağrılması demek
    }
    public static void main (String[] args)
    {
       /* int toplam=0;
        for (int i=0; i<=10; i++)
        {
            toplam+=i;
        }
        System.out.println(toplam);
        */
        System.out.println("recursive="+sum(+0));
    }
}

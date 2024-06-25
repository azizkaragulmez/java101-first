public class Overloading {

    static void sum()
    {
        System.out.println("frist parametre");
    }
    static int sum(int a){
        int x=a;
        System.out.println(a);
        return 999;

    }
    static float sum(int  a,int b)
    {
        return 0;
    }
    public static void main(String[] args)
    {
        sum();

        System.out.println(sum(2));
        System.out.println(sum(3,4));

    }
}

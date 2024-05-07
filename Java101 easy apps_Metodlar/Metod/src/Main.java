public class Main {
    //Metodlar sınıflar arasına yazılır
    // power başına o değişkennin tüürünü yazmak şart ve
    // static dememizdeki neden mainin static olması
    static int power (int base,int exp)
    {
       int select=1;
       for (int i=1;  i<=exp;i++)
       {
           select*=base;
       }
       return select;
    }

    static void sum(int a,int b){
        int top=a+b;
        System.out.println(top);

    }
    public static void main(String[] args)
    {

        System.out.println(power(2,3));
        System.out.println(power(3,4));
        sum(2,4);
    }
}
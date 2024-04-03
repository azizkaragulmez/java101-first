public class Main {
    static int power (int base,int exp)
    {
       int select=1;
       for (int i=1;  i<=exp;i++)
       {
           select*=base;
       }
       return select;
    }
    public static void main(String[] args)
    {

        System.out.println(power(2,3));
    }
}
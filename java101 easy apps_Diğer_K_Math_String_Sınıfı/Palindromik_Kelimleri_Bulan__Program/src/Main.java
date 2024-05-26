public class Main {

    static boolean isPolidrom(String str) {   //1. yöntem
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }


    static boolean isPolidrom2(String str)  //2. yöntem
    {
        String reverse="";
        for (int i=str.length()-1; i>=0; i--)
        {
            reverse=reverse+str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println(isPolidrom2("alla"));
    }
}
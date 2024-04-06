public class P_PalidromS {

    static boolean isPalidrom(int number) {
        int temp, reverseNumber = 0, Lastnumber;
        temp = number;
        while (0 != temp) {

            Lastnumber = temp % 10;

            reverseNumber = (reverseNumber * 10) + Lastnumber;

            temp = temp / 10;
        }
        if (reverseNumber == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalidrom(202));
        System.out.println(isPalidrom(301));

    }
}

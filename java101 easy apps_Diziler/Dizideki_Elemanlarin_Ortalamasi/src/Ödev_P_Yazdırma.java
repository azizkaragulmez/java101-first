public class Ödev_P_Yazdırma {
    public static void main(String[] args) {
        String[][] Pletter = new String[5][3];

        for (int i = 0; i < Pletter.length; i++) {
            for (int j = 0; j < Pletter[i].length; j++) {
                if (i == 0 || i == 2)
                {
                    Pletter[i][j] = "*";
                }
                else if (i==3 && j==2)
                {
                    Pletter[i][j] = " ";
                }
                else if (i==4 && j==2)
                {
                    Pletter[i][j] = " ";
                }
                else if (j == 0 || j == 2)
                {
                    Pletter[i][j] = "*";
                }

                else
                    Pletter[i][j] = " ";

            }
        }
        for (String[] i : Pletter) {
            for (String j : i) {
                System.out.print(j);
            }
            System.out.println();

        }

    }
}

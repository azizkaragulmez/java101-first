import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    Scanner sc = new Scanner(System.in);
    Random rm = new Random();
    String[][] mineFiled;
    String[][] revealed;
    int bombnumber;
    int row, col;

    public void star() {
        System.out.println("Satır sayısı giriniz :");
        row = sc.nextInt(); // Değişkenler yerel değil, sınıf değişkenleri olmalı
        System.out.println("Sütun sayısı giriniz :");
        col = sc.nextInt(); // Değişkenler yerel değil, sınıf değişkenleri olmalı

        bombnumber = (row * col) / 4;   // Kaç adet mayın olacağını belirledik.

        mineFiled = new String[row][col];
        revealed = new String[row][col];
        for (int i = 0; i < mineFiled.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {
                mineFiled[i][j] = "-";
                revealed[i][j] = "-";
            }
        }

        // Mayınları yerleştirme
        int bombsPlaced = 0;
        while (bombsPlaced < bombnumber) {
            int i = rm.nextInt(row);
            int j = rm.nextInt(col);

            if (mineFiled[i][j].equals("-")) {
                mineFiled[i][j] = "*";
                bombsPlaced++;
            }
        }
        printRevealed(); // haritayı bastırıyoruz
        play();
    }

    void play() {
        boolean finish = false;
        while (!finish) {
            System.out.println("Satır Sayısı giriniz ->");
            int Erow = sc.nextInt();

            System.out.println("Sütun Sayısı giriniz->");
            int Ecol = sc.nextInt();

            int number = 0;
            if (Erow < row && Ecol < col) {
                if (mineFiled[Erow][Ecol].equals("-") && revealed[Erow][Ecol].equals("-")) {
                    for (int i = Erow - 1; i < Erow + 2; i++) {
                        for (int j = Ecol - 1; j < Ecol + 2; j++) {
                            if (i >= 0 && j >= 0 && i < row && j < col && mineFiled[i][j].equals("*")) {
                                number++;
                            }
                        }
                    }
                    revealed[Erow][Ecol] = Integer.toString(number);
                    printRevealed();

                    if (checkWin()) {
                        System.out.println("Tebrikler kazandınız.");
                        printMine();
                        finish = true;
                    }
                } else if (mineFiled[Erow][Ecol].equals("*")) {
                    System.out.println("Mayına bastınız. Oyun bitti.");
                    printMine();
                    finish = true;
                } else if (!revealed[Erow][Ecol].equals("-")) {
                    System.out.println("Lütfen farklı bir kare seçiniz.\nBu kare daha önce seçildi.");
                }
            } else {
                System.out.println("Lütfen alan dışından seçim yapmayınız.\nHatalı seçim.");
            }
        }
    }

    private boolean checkWin() {
        int count = 0;
        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {
                if (revealed[i][j].equals("-")) {
                    count++;
                }
            }
        }
        return count == bombnumber;
    }

    void printRevealed() {
        System.out.println("---------------------------------");
        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {
                System.out.print(revealed[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    private void printMine() {
        System.out.println("---------------------------------");
        for (int i = 0; i < mineFiled.length; i++) {
            for (int j = 0; j < mineFiled[i].length; j++) {
                System.out.print(mineFiled[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }
}

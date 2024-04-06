public class Local_Degiskenler {

    static void sum(int a, int b) {
        a = 25;
        System.out.println(a);
    }

    static void dif() {int a=2;
        System.out.println(a);
    }

    public static void main(String[] args) {

        int a = 22;
        sum(2, 3);
    }
}
//kod blokları içerisinde tanımlanan değişkenlerdir ve sadece tanımlandıkları kod blokları içerisinde kullanılabilirler.
// Diğer metot ve sınıflar üzerinden erişimleri yoktur. Lokal değişkenler tanımladıkları ({...}) kod blokları arasında kullanılırlar.

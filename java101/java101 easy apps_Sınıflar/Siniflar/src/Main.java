public class Main {
    public static void main(String[] args)
    {   //Car sınıfına ait örnek nesne oluşturma yaptık şimdi bunlara özellik ekliyeceğiz
        //Sınıfa ait davranışlara yani metotlara erişmek için nokta (.) kullanılır. İlgili (devamı alta)
        // nesnenin ismini sonuna nokta koyularak erişilmek istenilen metodun ismi yazılır ve var ise parametreleri girilir.
        //Car sınıfında ki nesnemizde ki bütün özellikleri doldurmk veya girmek zorunda değiliz ama çağrırsak null değeri verir.
        //Bunlar nitelik davranışlar farklı
        Car audi = new Car();
        audi.model= "audi a5";
        audi.speed=200;
        audi.increaseSpeed(100);
        audi.decreaseSpeed(20);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model="bmw 3.20D";
        bmw.speed=150;
        bmw.increaseSpeed(90);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model="Mercede C200";
        mercedes.speed=210;
        mercedes.increaseSpeed(10);
        mercedes.printSpeed();

    }
}
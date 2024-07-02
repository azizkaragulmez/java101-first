public class Main {
    public static void main(String[] args)
    {

            {   //Constructor kurucu metodlar
                //Bir önceki öğrendiğimizle aynı işi yapar pratiklik katması için bu parametre içi kullanılır.
                Car audi = new Car("sport","Audi a5", "Black");
                audi.speed=150;
                audi.increaseSpeed(10);
                audi.printInfo();


                Car bmw = new Car("sport","BMW 3.20D","Dark Blue");
                bmw.printInfo();


                Car mercedes = new Car("sport","Mercedes C200","White");
                mercedes.speed=120;
                mercedes.decreaseSpeed(50);
                mercedes.printInfo();


            }
        }
    }

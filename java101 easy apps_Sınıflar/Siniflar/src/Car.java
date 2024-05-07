public class Car {
    //Nitelikler
    String type;
    String model;
    String color;

    int speed;
    int speedLimit=250;

//Bir kere yazıp hepsinde çalıştırabiliyoruz ve bir yerden depiştirince heryerden değişmiş oluyor.
        //DAVRANIŞLAR
    void increaseSpeed(int increment)
    {
        if ((speed+increment)< speedLimit)
        {
            speed+=increment;
        }
    }

    void decreaseSpeed (int decrease)
    {
        if (speed>0)
        {
            speed -=decrease;
        }
    }

    void printSpeed(){
        System.out.println(model +"Hızınız :" +speed);
    }
}

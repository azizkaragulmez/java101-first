public class Main {
    public static void main(String[] args) {


        fighter f1=new fighter("A",40,100,100,20);
        fighter f2=new fighter("B",20,100,100,50);

        Match match=new Match(f1,f2,80,100);

        match.run();





    }
}
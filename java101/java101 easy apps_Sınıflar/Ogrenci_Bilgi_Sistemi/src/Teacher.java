public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name,String mpno ,String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void print(){
        System.out.println("-----------------");
        System.out.println("Adını :"+this.name);
        System.out.println("Numaranız :"+ this.mpno);
        System.out.println("Bölümü :"+this.branch);

    }
}

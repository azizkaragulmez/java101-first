public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNO;
    int  classes;
    double avarage;
    boolean isPass;

    Student (String name, int classes, String stuNo, Course c1,Course c2,Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNO = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage=0.0;
        this.isPass = false;
    }

    void addBulkExamNote (int note1,int note2, int note3){

        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
 }

        void isPass(){
         this.avarage=(this.c1.note+this.c2.note+this.c3.note)/3.0;
            System.out.println("=========================");
         if (this.avarage>55)
            {
                System.out.println("Ortalama geçti");
                this.isPass=true;
            }
         else
             System.out.println("Ortalamayı geçemedi");
                this.isPass=false;
                printNote();

        }



            void printNote () {

                System.out.println("Öğrenci : " + this.name);
                System.out.println("Matematik Notu : " + this.c1.note);
                System.out.println("Fizik Notu : " + this.c2.note);
                System.out.println("Kimya Notu : " + this.c3.note);
                System.out.println("Ortalama : "+this.avarage);
            }
        }

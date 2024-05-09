public class Employe {
    String name;
    String surename;
    int salary;
    int workHours;
    int hireYear;

    Employe(String name, String surename, int salary, int workHours, int hireYear) {
        this.name = name;
        this.surename = surename;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }



    int tag() {
        int vergi=0;
        if (salary > 1000) {
            vergi = (salary / 100) * 3;

        }
        return vergi;
    }


    int bonus() {
        int ekbonus = 0;
        if (workHours > 40) {

            int extraworkHours = workHours - 40;
            ekbonus = extraworkHours * 30;

        }
        return ekbonus;
    }


    int raiseSalary() {
        int toyear = 2021;
        int eklenti=0;
        if (toyear - hireYear < 10) {
            eklenti = ((salary / 100) * 5);
        }
        if (toyear - hireYear > 9 && toyear - hireYear < 20) {
            eklenti = ((salary / 100) * 10);
        }
        if (toyear - hireYear > 19) {
            eklenti = ((salary / 100) * 15);
        }
        return eklenti;
    }

    void tostring() {
        System.out.println("Adı: " + this.name);
        System.out.println("Soyadı: " + this.surename);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Alınan Vergi :" + tag());
        System.out.println("Bonus:" + bonus());
        System.out.println("Maaş artışı:" + raiseSalary());
        int vergibonus=bonus()-tag()+this.salary;
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" +vergibonus );
        int topsalary=this.salary+bonus()-tag()+raiseSalary();
        System.out.println("Toplam Maaş :"+topsalary);
    }


}

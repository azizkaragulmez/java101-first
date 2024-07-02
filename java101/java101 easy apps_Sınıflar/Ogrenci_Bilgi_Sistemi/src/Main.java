public class Main {
    public static void main(String[] args)
    {
        Teacher t1= new Teacher("Kemal ","1234","MAT");
        Teacher t2=new Teacher("Necmi","5678","GEO");
        Teacher t3=new Teacher("Aslan","0000","FZK");

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");


        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(90,80,70);
        s1.isPass();


        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(90,50,40);
        s2.isPass();


        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(90,80,40);
        s3.isPass();



    }
}
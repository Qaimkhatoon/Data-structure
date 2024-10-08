public class StudentTest {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sumera";
        s1.insti="iba";
        s1.claname=14;
        Student s2=new Student(s1); 
        s2.info();
    }
}

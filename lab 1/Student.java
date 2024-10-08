public class Student {
    String name;
    String insti;
    int claname;
    // PArametries
    // Student(String name,String insti,int claname)
    // {
    //     this.name=name;
    //     this.insti=insti;
    //     this.claname=claname;       
    // }

    // copy cond
    Student()
    {

    }
    Student(Student s3)
    {
        this.name=s3.name;
        this.insti=s3.insti;
        this.claname=s3.claname;
    }

    void info()
    {System.out.println(name+" "+insti+" "+claname);}
}


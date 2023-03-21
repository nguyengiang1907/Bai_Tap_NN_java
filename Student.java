package HDT_Tuan5;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Student (int r , String n){
        this.rollno=r;
        this.name=n;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno +""+name+""+college);
    }
}
class TestStaticMethod {
    public static void main (String[] args){
        Student.change();

        Student s1 = new Student(111 , " Giang ");
        Student s2 = new Student(222," Hiệu ");
        Student s3 = new Student(333," Mai ");


        s1.display();
        s2.display();
        s3.display();
    }
}

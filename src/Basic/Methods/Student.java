package Basic.Methods;

public class Student
{
    //parameterized constructor
    String name;
    int age;
    public Student(String name)
    {
        this.name=name;
    }
    public Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display1()
    {
        System.out.println("Name1: "+name);
    }
    public void display2()
    {
        System.out.println("Name2: "+name);
        System.out.println("Age: "+age);
    }

    static void main() {
        Student s1=new Student("Mohini");
        Student s2=new Student("Mohini",20);
        s1.display1();
        s2.display2();
    }
}

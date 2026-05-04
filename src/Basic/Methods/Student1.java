package Basic.Methods;

public class Student1
{
    //using static field and static method
    static int age=20;
    public static int display()
    {
        return age;
    }
    static void main() {
        System.out.println(Student1.display());
    }
    //this can be called as factory method as well, as it is running without new and any object
}

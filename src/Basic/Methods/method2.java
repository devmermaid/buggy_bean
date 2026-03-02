package Basic.Methods;

public class method2
{
    void add(int a, int b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    static void main() {
        method2 m=new method2();
        m.add(10,20);
        m.add(10,20,30);
    }
}


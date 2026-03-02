package Basic.Methods;

public class method3
{
    int width;
    int height;
    method3()//constructor initialization
    {
        width=10;
        height=20;
    }
    int display()
    {
        System.out.println(width*height);
        return 0;
    }
    static void main() {
        method3 m1=new method3();
        method3 m2=new method3();
        int vol;
        vol=m1.display();
        vol=m2.display();
    }
}

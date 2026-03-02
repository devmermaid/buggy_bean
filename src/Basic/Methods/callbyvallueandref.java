package Basic.Methods;

public class callbyvallueandref
{
    int a=10;
    int b=10;

    public void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
    static void main(String[] args) {
        callbyvallueandref c=new callbyvallueandref();
        c.display();

    }
}

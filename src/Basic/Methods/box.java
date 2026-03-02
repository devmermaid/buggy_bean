package Basic.Methods;

public class box
{
    int width;
    int height;
    box(int w, int h)//parameterised constructor, so we can pass the value to objetc directly in main mehtod
    {
        width=w;
        height=h;
    }
    int display()
    {
        System.out.println(width*height);
        return 0;
    }

    static void main() {
        box b1=new box(10,20);
        box b2=new box(30,20);
        int vol;
        vol=b1.display();
        vol=b2.display();
    }
}

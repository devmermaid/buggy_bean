package Basic.Methods;

public class callbyvalue
{
    void display(int i, int j)
    {
        System.out.println(i);
        System.out.println(j);
    }

    static void main() {
        //passing values to outside methods of main method from inside main method called as call by value
        //this does not change the values for main variables but for outside variable is changes and matters as we will change the value

        callbyvalue c=new callbyvalue();
        int a=10;
        int b=20;
        c.display(a,b);
        System.out.println(a); //here we passed value for i and j from main method by passing values, which is call by value
        System.out.println(b);
    }
}

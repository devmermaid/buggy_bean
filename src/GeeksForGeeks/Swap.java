package GeeksForGeeks;

public class Swap
{
   // Given two numbers a and b,
    // you need to swap their values so a holds the value of b and b holds the value of a.
    // Just write the code to swap values of a and b at the specified place.

    public void swap(int a, int b) {
        // code here
        int temp=a;
        a=b;
        b=temp;

        System.out.println(a + " " + b);
    }

    static void main() {
        Swap s=new Swap();
        s.swap(2,3);
    }
}

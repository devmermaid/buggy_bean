package GeeksForGeeks;

public class EvenOddUsing
{
    // find even odd using O(1)
    //O(1):bcz it has only one operation of rem without any loop
    //O(n): when time gets divided in linear manner in loop
    public static boolean isEven(int n)
    {
        int rem=n%2;
        if(rem==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static void main() {
        int n=15;
        if(isEven(n)==true)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}

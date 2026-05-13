package GeeksForGeeks;

public class sqrtOfNat
{
    //Given a positive integer n
    // we have to find the sum of squares of first n natural numbers.
    /* using loop

    /*static void main() {

        int n=2;
        int sum1=0;
        for(int i=1;i<=n;i++)
        {
            sum1+=(i*i);
        }
        System.out.println(sum1);
    }
    */
//using method
    public static int show(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum+=(i*i);
        }
        return sum;
    }

    static void main() {
        int n=2;
        System.out.println(sqrtOfNat.show(n));
    }
}
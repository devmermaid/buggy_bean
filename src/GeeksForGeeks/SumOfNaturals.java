package GeeksForGeeks;

public class SumOfNaturals
{
   /* static void main() {
        int n=3;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }*/

    //using method
    public static int printNat(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }

    static void main() {
        int n=3;
        System.out.println(SumOfNaturals.printNat(n));
    }
}

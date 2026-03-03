package Basic.numbers;

public class prime
{
    static void main() {
        /* int n=22;
        boolean count=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count=false;
                break;
            }
        }
        if(count)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not");
        }**/
        //above is using boolean
        //below is using other way
        int number=11;
        int prime=0;
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                prime++;
                break;
            }
        }
        if(prime==0)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("not");
        }
    }
}

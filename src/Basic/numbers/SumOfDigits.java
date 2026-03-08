package Basic.numbers;

public class SumOfDigits
{
    static void main() {
        int n=234;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;//found reminder
            sum=sum+rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}

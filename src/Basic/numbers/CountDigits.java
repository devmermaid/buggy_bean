package Basic.numbers;

public class CountDigits
{
    static void main() {
        int n=2234;
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}

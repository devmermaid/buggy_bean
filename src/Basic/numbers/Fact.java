package Basic.numbers;

public class Fact
{
    static void main() {
        int num=3;
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

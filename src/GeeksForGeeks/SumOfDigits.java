package GeeksForGeeks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumOfDigits
{
    public static int show(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        System.out.println(show(num));
    }
}

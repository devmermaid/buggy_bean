package Basic.numbers;

import java.util.Scanner;

public class primenumber
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p: ");
        int p=sc.nextInt();
        for(int n=2;n<=p;n++)
        {
            boolean isPrime=true;
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println(n);
            }
        }
    }
}

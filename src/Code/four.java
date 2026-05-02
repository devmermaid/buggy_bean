package Code;

import java.util.Scanner;

public class four
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(j%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
        {
            System.out.println("It is prime");
        }

    }
}

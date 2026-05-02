package Code;

import java.util.Scanner;

public class one
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.printf("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}

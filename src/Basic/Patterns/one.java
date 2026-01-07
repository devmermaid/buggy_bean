package Basic.Patterns;

import java.util.Scanner;

public class one
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valur for n : ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
}

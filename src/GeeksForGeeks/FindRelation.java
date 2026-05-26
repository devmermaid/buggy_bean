package GeeksForGeeks;

import java.util.Scanner;

//Given two integers, n and m. The task is to check the relation between n and m.
// Print "less" if n < m,  "equal" if n == m, and "greater" if n > m.
public class FindRelation
{
     static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n:");
        int n = sc.nextInt();
        System.out.println("Enter value for m: ");
        int m = sc.nextInt();

        // code here
        if(n<m)
        {
            System.out.println("less");
        }
        else if(n==m)
        {
            System.out.println("equal");
        }
        else if(n>m)
        {
            System.out.println("greater");
        }
        else
        {
            System.out.println("Enter positive number");
        }

    }
}

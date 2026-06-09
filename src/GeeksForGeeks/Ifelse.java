package GeeksForGeeks;

import java.util.Scanner;
//Given a number n, use the if statement to print "Big" (without quotes)
// if the given number is greater than 100. The statement "Number" (without quotes)
// will be printed regardless.

public class Ifelse
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for n: ");
        int n=sc.nextInt();

        if(n>100)
        {
            System.out.println("Big");
        }
        else{}
        System.out.println("Number");
    }

}

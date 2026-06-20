package GeeksForGeeks;

import java.util.Scanner;

public class ifElse2
{
    //Take an interger input a, and then use the if statement to print "Big" (without quotes) if the given number is greater than 100, and use the else statement to print "Small" (without quotes) when the number is smaller than or equal to 100.

    //Note: After printing the output, you should move the cursor to the new line.
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a=sc.nextInt();
        if(a>100)
        {
            System.out.println("Big");
        }
        else
        {
            System.out.println("Small");
        }
    }
}

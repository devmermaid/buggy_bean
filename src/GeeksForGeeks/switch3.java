package GeeksForGeeks;

import java.util.Scanner;

//Given a number n, use a switch statement to return "One" if the given number is equal to 1, "Two" if the number is 2 and so on till 9 ("Nine") else return "Unknown"(without quotes).
//
//Examples:
//
//Input: n = 10
//Output: Unknown
public class switch3
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for number: ");
        int n = sc.nextInt();

        // code here

        switch(n)
        {
            case 1:
                if(n==1)
                {
                    System.out.println("One");
                }
                break;
            case 2:
                if(n==2)
                {
                    System.out.println("Two");
                }
                break;
            case 3:
                if(n==3)
                {
                    System.out.println("Three");
                }
                break;
            case 4:
                if(n==4)
                {
                    System.out.println("Four");
                }
                break;
            case 5:
                if(n==5)
                {
                    System.out.println("Five");
                }
                break;
            case 6:
                if(n==6)
                {
                    System.out.println("Six");
                }
                break;
            case 7:
                if(n==7)
                {
                    System.out.println("Seven");
                }
                break;
            case 8:
                if(n==8)
                {
                    System.out.println("Eight");
                }
                break;
            case 9:
                if(n==9)
                {
                    System.out.println("Nine");
                }
                break;
            default:
            {
                System.out.println("Unknown");
            }
        }
    }
}

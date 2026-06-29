package GeeksForGeeks;

//Given an input String s, you need to take the string at input and print it then move the cursor to the next line.
//
//Examples:
//
//Input: s = "Hello World"
//Output: Hello World
//Explanation: The input is "Hello World", and we just print it.

import java.util.Scanner;

public class string4
{
     void utility(Scanner scn) {
        // code here
         System.out.println("Enter value for string: ");
        String s=scn.nextLine();
        System.out.println(s);
    }

    static void main() {
         Scanner scn=new Scanner(System.in);
         string4 s2=new string4();
         s2.utility(scn);
    }

}

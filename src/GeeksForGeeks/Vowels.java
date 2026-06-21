package GeeksForGeeks;

import java.util.Scanner;

//Given a character ch representing an English alphabet, determine whether it is a vowel or not.
// Return true if ch is a vowel otherwise return false.
//
//Examples:
//
//Input: ch = 'a'
//Output: true
//Explanation: 'a' is a vowel. So output for this test case is true.
public class Vowels
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for char: ");
        char ch = sc.next().charAt(0);

        // code here
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
        {
            System.out.println("true");
        }

        else{
            System.out.println("false");
        }
    }
}

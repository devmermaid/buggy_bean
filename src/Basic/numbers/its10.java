package Basic.numbers;

import java.util.Scanner;

public class its10
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character: ");
        char ch=sc.next().charAt(0);// we are reading character as a string in have with int() so we will insert character in this string with index value ahead
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')// so as we converted character receiving in lower case only so we will check for lower case only to avoid writing code for upper case as well
        {
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }
    }
}

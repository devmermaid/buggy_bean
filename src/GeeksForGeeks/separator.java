package GeeksForGeeks;

import java.util.Scanner;

//You'll be given two strings a and b, a separator symbol, and you need to print a and b such that a and b are separated by the separator symbol followed by a new line.
//
//Example :
//
//Input: a = "Hello", b = "World", separator = "@"
//Output: Hello@World
//Explanation: a and b are printed with the separator symbol in between.
public class separator
{
    static void main() {
        String a="Hello";
        String b="World";
        String separator="@";
        System.out.print(a);
        System.out.print(separator);
        System.out.print(b);
    }
}

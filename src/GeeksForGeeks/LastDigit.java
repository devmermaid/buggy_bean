package GeeksForGeeks;

import java.util.Scanner;

public class LastDigit
{
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastDigit = Math.abs(n) % 10;
        //use of Math.abs() is to convert number in postive if user enters negative number

        System.out.println(lastDigit);
    }
}

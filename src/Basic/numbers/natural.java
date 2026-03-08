package Basic.numbers;

import java.util.Scanner;

public class natural
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num: ");
        double num=sc.nextDouble();
        if(num>0 && num%1==0)
        {
            System.out.println("natural yes");
        }
        else {
            System.out.println("no");
        }
    }
}

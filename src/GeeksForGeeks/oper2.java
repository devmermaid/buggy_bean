package GeeksForGeeks;

import java.util.Scanner;

public class oper2
{
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        return (a&b)+" "+(a|b)+" "+(!a);
    }

    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter values for a and b: false ");
        boolean a=sc.nextBoolean();
        boolean b=sc.hasNextBoolean();

        oper2 o=new oper2();
        System.out.println(o.booleanOperations(false, true));
    }
}

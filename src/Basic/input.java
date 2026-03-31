package Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input
{
    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name with sc: ");
        String s=sc.next();
        System.out.println("Enter age with sc: ");
        int i=sc.nextInt();
        System.out.println("Enter perc with sc: ");
        float f=sc.nextFloat();
        System.out.println("Enter double with sc: ");
        double d=sc.nextDouble();
        System.out.println("Enter long with sc: ");
        long l=sc.nextLong();

        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);

        System.out.println("Enter s with br: ");
        String s2=br.readLine();
        System.out.println("Enter i with br: ");
        int i2=Integer.parseInt(br.readLine());
        System.out.println("Enter f with br: ");
        float f2=Float.parseFloat(br.readLine());
        System.out.println("Enter d with br: ");
        double d2=Double.parseDouble(br.readLine());

        System.out.println(s2);
        System.out.println(i2);
        System.out.println(f2);
        System.out.println(d2);
    }
}

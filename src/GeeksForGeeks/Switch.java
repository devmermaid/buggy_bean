package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Switch
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<Double> arr=new ArrayList<>();
        System.out.println("Enter your choice: ");
        System.out.println("Choice 1: will print area of circle");
        System.out.println("Choice 2: will print area of rect");

        int choice=sc.nextInt();
        System.out.println("Your choice: "+choice);

        switch(choice)
        {
            case 1:
                System.out.println("Enter Radius: ");
                arr.add(sc.nextDouble());
                double r=arr.get(0);
                double areaC=3.14*r*r;
                System.out.println("Area of Circle: "+areaC);
                break;

            case 2:
                System.out.println("Enter Length");
                arr.add(sc.nextDouble());
                System.out.println("Enter Breadth: ");
                arr.add(sc.nextDouble());

                double l=arr.get(0);
                double b=arr.get(0);

                double areaR=l*b;
                System.out.println("Area of REct: "+areaR);
                break;
        }
    }

}

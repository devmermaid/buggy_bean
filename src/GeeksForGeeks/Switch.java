package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Given an integer choice denoting the choice of the user and a list containing the single value R or two values L and B depending on the choice.
//If the user's choice is 1, calculate the area of the circle having the given radius(R).
//Else if the choice is 2, calculate the area of the rectangle with the given length(L) and breadth(B).

//Note : A list arr[], containing the single value R or the two values L and B, as input parameters. Return the area of the desired geometrical figure. Use Math.PI for the value of pi.

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
                System.out.println("Area of React: "+areaR);
                break;
        }
    }

}

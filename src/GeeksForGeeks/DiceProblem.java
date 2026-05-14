package GeeksForGeeks;

import java.util.Scanner;

/* You are given a cubic dice with 6 faces.
All the individual faces have a number printed on them.
The numbers are in the range of 1 to 6, like any ordinary dice.
You will be provided with a face of this cube,
your task is to guess the number on the opposite face of the cube.
 */

//approach using switch
//we can simple if else as well, simplest approach
public class DiceProblem
{
    public static int show(int n)
    {
        int output;
        switch(n)
        {
            case 1:
                output=6;
                break;
            case 2:
                output= 5;
                break;
            case 3:
                output=4;
                break;
            case 4:
                output=3;
                break;
            case 5:
                output= 2;
                break;
            case 6:
                output=1;
                break;

            default:
                output=-1;
                break;
        }
        return output;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n1:");
        int n1=sc.nextInt();
        int result=show(n1);

        if(result!=-1)
        {
            System.out.println("The dice another side value is: "+result);
        }
        else
        {
            System.out.println("invalid dice");
        }
    }
}

package GeeksForGeeks;

import java.util.Scanner;

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

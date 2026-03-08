package Basic.numbers;

import java.util.Scanner;

public class NaturalLoop
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        double num=sc.nextDouble();
            if(num>0 && num%1==0) {
                for(int i=1;i<=10;i++)
                {

                System.out.println(num);}
            }
        }
    }

package Basic.numbers;
import java.util.Scanner;
public class Grade
{
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks=sc.nextInt();
        int total_marks=500;
        // here per is float so all variables needs to be flot before perforning any operation
        // so java will convert this marsk into float marks.f and then will perform multiplication
        //after this java will convert total marks to float first then will perform division
        // this is called type promotion means if one is bigger data type then all will automatically gets coverted into big one
        //process of changing this is type casting
        float per=(marks%100f)/total_marks;
        System.out.println(per);
        if(per>=80 && per<=100)
        {
            System.out.println("Grade A");
        }
        else if(per<=79 && per>=61)
        {
            System.out.printf("Grade B");
        }
        else if(per<=60 && per>=51)
        {
            System.out.println("Grade C");
        }
        else if(per<=50 && per>=35)
        {
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}

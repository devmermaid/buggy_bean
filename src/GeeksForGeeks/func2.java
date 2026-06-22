package GeeksForGeeks;
//Given a number, you have to use if, else if, else conditional statements according to the following:
//if number is greater than 100: Print "Big" (without quotes)
//else if number is smaller than 10: Print "Small" (without quotes)
//else: Print "Number" (without quotes)
//
//Note: Ensure that the output includes a newline after every print statement.
public class func2
{
    public static void utility(int number) {
        // Write the if, else if, else statements below
        if(number>100)
        {
            System.out.println("Big");
        }
        else if(number<10)
        {
            System.out.println("Small");
        }
        else
        {
            System.out.println("Number");
        }
    }
    static void main() {
        func2 f=new func2();
        f.utility(232);
    }
}

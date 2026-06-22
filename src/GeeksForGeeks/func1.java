package GeeksForGeeks;
//Given two integers a and b. The given input and its values are passed as arguments
// to the function argumentFunction. The argumentFunction is responsible to return (a+b). You need to write this function.

//Examples:

//Input: a = 2, b = 3
//Output: 5
//Explanation: 2 + 3 = 5
public class func1
{
    public static int argumentFunction(int a, int b)
    {
        return a+b;
    }
    static void main() {
        System.out.println(func1.argumentFunction(2,3));
    }
}

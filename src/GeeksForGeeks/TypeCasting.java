package GeeksForGeeks;
//Given an input num as a string. You need to typecast into an integer and double it.
//
//Examples:
//
//Input: num = "5"
//Output: 10
//Explanation: Typecast "5" to int and then double it 5 * 2 = 10
public class TypeCasting
{
    static void main() {
        String s="5";
        int n=Integer.parseInt(s)*2;
        System.out.println(n);
    }
}

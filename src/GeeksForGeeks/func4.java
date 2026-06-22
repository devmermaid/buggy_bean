package GeeksForGeeks;

//Given a string s as input. Delete the characters at odd indices of the string. Return the final string after deletion of characters at odd indices.

//Examples :

//Input: s = "Geeks"
//Output: "Ges"
//Explanation: Deleted "e" at index 1 and "k" at index 3.
public class func4 {
    public static String display(String s)
    {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                result+=s.charAt(i);
            }
        }
        return result;
    }
    static void main() {
        System.out.println(func4.display("Mohini"));
    }
}

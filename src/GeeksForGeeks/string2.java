package GeeksForGeeks;
//Given two strings s1 and s2 as input, concatenate two strings and then reverse the joined string.
//
//Examples:
//
//Input: s1 = "Geeks" , s2 = "forGeeks"
//Output: "skeeGrofskeeG"
//Explanation: Concatenating s1 and s2 to get "GeeksforGeeks" then reversing it to "skeeGrofskeeG".
public class string2
{
    static String conRevstr(String s1, String s2) {
        // code here
        return new StringBuilder(s1.concat(s2)).reverse().toString();
    }
    static void main() {

        StringBuilder sb = new StringBuilder();

        sb.append("Geeks ");
        sb.append(" forGeeks");
        sb.reverse();
        System.out.print(sb.toString());
        //another simpler way to return method

        System.out.println(string2.conRevstr("Moh","Ini"));
    }
}

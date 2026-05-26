package GeeksForGeeks;

public class ThisisPostitive
{
    //You are given a String S, you need to print its characters at even indices(index starts at 0).
    static void main() {
        String s="Mohini";
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}

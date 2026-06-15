package GeeksForGeeks;

public class StringToLower
{

    public static String toLower(String s)
    {
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]>='A' && chars[i]<='Z')
            {
                chars[i]=(char)(chars[i]+32);
            }
        }
        return new String(chars);
    }

    static void main() {
        String s1="MOHINI";
        System.out.println(toLower(s1));

    }
}

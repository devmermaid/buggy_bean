package Basic;

public class TypeCasting
{
    public static void main(String[] args) {
        //Implicit casting: converting current data type from narrow range to wider range
        float a=10;//10 is already an integer so float will be converted java automatically
        System.out.println(a);
        int b=(int)4.5;//converting float to int so initially DT will be int, bbut data loss will happen
        System.out.println(b);
    }
}


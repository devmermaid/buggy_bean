package GeeksForGeeks;
//Given two numbers a and b, the task is to swap them using third variable
public class SapNum
{
    static void main() {
        int n1=5;
        int n2=10;
        int temp=n2;
        n2=n1;
        n1=temp;
        System.out.println(n1);
        System.out.println(n2);
    }
}

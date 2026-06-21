package GeeksForGeeks;

//Given two number n1 and n2, n1 > n2.
// Find the differences between mathematical tables of n1 and n2 and print in a single line.
//Note: Don't add a new line in the end.
//
//Example :
//
//Input: n1 = 9, n2 = 4
//Output: 5 10 15 20 25 30 35 40 45 50
//Explanation:
//  9 18 27 36 45 54 63 72 81 90
//- 4  8 12 16 20 24 28 32 36 40
//-----------------------------------------
//= 5 10 15 20 25 30 35 40 45 50
public class twistedTable
{
    static void main() {
        int n1=3;
        int n2=2;

        for(int i=1;i<=10;i++)
        {
            int t1=n1*i;
            int t2=n2*i;
            System.out.print((n1-n2)*i+" ");
        }
    }
}

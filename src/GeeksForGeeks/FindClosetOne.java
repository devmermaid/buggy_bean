package GeeksForGeeks;

// incomplete program as I was unable to find it
//closet to n and divisible by m
//i didnt understood how to get this n-1 and n+1 done
public class FindClosetOne
{
    static void main() {
        int n1=5;
        int n2=2;
        int m=2;
        int a=n1-1;
        int b=n2-1;

        for(int i=n1-1;i<n1;i--)
        {
            if(a%m==0)
            {
                break;
            }
        }
        for(int j=n2+1;j>n2;j++)
        {
            if(b%m==0)
            {
                break;
            }
        }

        if(a>b)
        {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}

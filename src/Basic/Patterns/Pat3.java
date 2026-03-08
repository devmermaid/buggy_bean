package Basic.Patterns;

public class Pat3
{
    static void main() {
        int n=3;
        for(int i=1;i<=n;i++)//rows
        {
            for(int j=1;j<=n-i;j++)//space
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)//* and space
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

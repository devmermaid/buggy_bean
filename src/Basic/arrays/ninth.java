package Basic.arrays;

import java.util.Arrays;

public class ninth
{
    static void main() {
        int[][] n={{0,1},{2,3}};
        System.out.println(Arrays.deepToString(n));

        int[][] m={{3,4},{4,5}};
        for(int[] i:m)
        {
            for(int j:i)
            {
                System.out.println(j);
            }
            System.out.println();
        }

        int[][] p={{3,4},{4,5}};
        for(int k=0;k<p.length;k++)
        {
            for(int s=0;s<p[k].length;s++)
            {
                System.out.println(p[k][s]);
            }
            System.out.println();
        }
    }
}

package Basic.arrays;

import java.util.Arrays;

public class TwoDimen
{
    static void main() {
        //printing manually with for each loop
        int[][] array={{2,3,4},{5,4,6}};
        for(int[] n:array)
        {
            for(int i:n)
            {
                System.out.println("with first loop: "+ i);
            }
        }
        //printing with deeptosrting made for two dimensional arrays only
        System.out.println("with second loop: ");
        System.out.println(Arrays.deepToString(array));
        //maunally with for lop
        System.out.println("with third loop");
        for(int p=0;p<array.length;p++)
        {
            for(int q=0;q<array[p].length;q++) {
                System.out.println(array[p][q] + "\t");
            }
        }
    }
}

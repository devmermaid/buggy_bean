package Basic.arrays;

import java.util.Arrays;

public class eight
{
    static void main() {
        int[] array={2,1,3,8,4,9,0};
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j<array.length-1-i;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int n:array)
        {
            System.out.println(n+" ");
        }
    }
}

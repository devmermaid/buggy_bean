package Basic.arrays;

import java.util.Arrays;

public class BubbleSort
{
    static void main(String[] args) {
        //sorting the array using manual bubble sort
        int[] array={23,21,34,54,34,56};
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
        System.out.println("Sorted array: "+ Arrays.toString(array));
    }
}

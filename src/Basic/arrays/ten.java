package Basic.arrays;

import java.util.Arrays;

public class ten
{
    static void main() {
        //printing elements for aarya using for each loop
        int[] array={34,23,11,45,34};
        for(int i:array)
        {
            System.out.println(i);
        }
        //array copying: giving same value to both array
        //it will assign to same memory location and value same for both arrays
        //below is array sorting
        System.out.println("Before sorting: "+ Arrays.toString(array));
        Arrays.sort(array);//here in back end quick sort has been used for sort method
        System.out.println("After sorting: "+ Arrays.toString(array));

    }
}

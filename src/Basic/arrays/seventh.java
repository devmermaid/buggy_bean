package Basic.arrays;

import java.util.Arrays;

public class seventh
{
    static void main() {
        int[] numbers={3,2,6,1,7};
        System.out.println("Before sorting: "+ Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("After sorting: "+ Arrays.toString(numbers));
    }
}

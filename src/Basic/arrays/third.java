package Basic.arrays;

public class third
{
    static void main() {
        int[] array={1,2,23,44,3,56,76};
        int max=array[0];
        for(int i=0;i< array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println(max);


    }
}


package Basic.arrays;

public class forth
{
    static void main() {
        int[] array={23,1,45,21,56};
        int min=array[0];
        for(int i=0;i< array.length;i++)
        {
            if (array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println(min);
    }
}

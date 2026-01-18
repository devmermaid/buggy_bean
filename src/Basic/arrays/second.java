package Basic.arrays;

public class second
{
    static void main() {
        int[] array={1,23,43,2,55};
        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum=sum+array[i];
            System.out.println(sum);// this qill give the sum one ny one
        }
        System.out.println("when prints outside for : ");
        System.out.println(sum);
    }
}

package Basic.arrays;

public class fifth
{
    static void main() {
        int[] array={1,23,42,2,24};
        boolean found=false;
        int ele=23;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==ele)
            {
                System.out.println("found : " + i);
                found=true;
                break;
            }
        }
        if(!found)
        {
            System.out.printf("not found");
        }
    }
}


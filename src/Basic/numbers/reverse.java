package Basic.numbers;

public class reverse
{
    static void main() {
        int number=123;
        int org=number;// this process is necessary bcz we will destroy the num in next loop so num value become 0 after using it in loop
        int reverse=0;
        while(number!=0)
        {
            int temp=number%10; // to store modulus in rev number
            reverse=reverse*10+temp;
            number=number/10; // to divide and remove reminder so only int will stay like 123 after 123.4
        }
        System.out.println(reverse);
        if(org==reverse)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        }
}

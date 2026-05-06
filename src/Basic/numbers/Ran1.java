package Basic.numbers;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Ran1
{
    //printing random numbers in java
    static void main() {
        //first way: using math.random()
        double randomNumber=Math.random();
        int random=(int)(Math.random()*100)+1; // here is number will get generated in 1 to 100
        System.out.println(random);

        //second way: using built it Random class and its object
        //This allows to create random ints, booleans, floats directly
        Random ran=new Random();
        boolean ran2=ran.nextBoolean();
        int ran3=ran.nextInt(50);
        System.out.println(ran2);
        System.out.println(ran3);

        // this allows to create random numbers for cryptographic security
        SecureRandom sc=new SecureRandom();
        byte[] bytes=new byte[20];
        sc.nextBytes(bytes);

        //print this byte array to see how they look like
        for(int i:bytes)
        {
            System.out.println(i);
        }
        // another way to print this byte array
        System.out.println(Arrays.toString(bytes));
    }
}

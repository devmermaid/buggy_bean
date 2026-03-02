package Basic.Methods;

import java.awt.*;

public class recursion1
{
    void display(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        display(n-1);
    }
    void main(String[] args) {
        System.out.println("hello");}
}

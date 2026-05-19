package CollectionFramework;

import java.util.*;

public class Stacky
{
    static void main() {
        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        System.out.println("First ele: "+stack.peek());
        System.out.println("Stack: "+stack);
        System.out.println("First ele removed : "+stack.pop());
        System.out.println(stack);
    }
}

package CollectionFramework;

import java.util.*;

public class Queen
{
    static void main() {
        Queue<String> queue=new LinkedList<>();//here we can implement queue using arrayDeque or LL
        queue.add("Mohini");
        queue.offer("Rudraksh");
        System.out.println(queue);
        System.out.println(queue. peek());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}

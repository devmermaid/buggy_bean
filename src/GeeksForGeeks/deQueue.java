package GeeksForGeeks;

//Given a deque dq containing integer elements, the task is to traverse the dq and print its elements of it.
//Note: Print a newline at the end.

//Examples:

//Input: dq = [1, 2, 3, 4, 5]
//Output: 1 2 3 4 5
//Explanation: dq will look like [1, 2, 3, 4, 5].

import java.sql.Array;
import java.util.ArrayDeque;

public class deQueue
{
    public static void printDeque(ArrayDeque<Integer> deq)
    {
        for(int n:deq)
        {
            System.out.print(n+" ");
        }
        System.out.println();
    }
    static void main() {
        ArrayDeque<Integer> deq=new ArrayDeque<>();
        deq.add(12);
        deq.add(4);
        deq.add(3);
        printDeque(deq);
    }
}

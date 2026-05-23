package CollectionFramework;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {

    public static boolean canBookConsecutiveForEach(ArrayList<Integer> seats, int k) {
        int emptyCount = 0; // Tracks our current consecutive empty seat "streak" [cite: 11]

        for (int seat : seats) { // Looks directly at each seat element
            if (seat == 0) {
                emptyCount++; // Found an empty seat, increase the streak! [cite: 7]

                if (emptyCount == k) {
                    return true; // Early exit: We found enough consecutive seats! [cite: 16]
                }
            } else {
                // Hit a booked seat (1), the streak is broken. Reset to 0[cite: 8, 9].
                emptyCount = 0; // Hit a booked seat (1), the streak is broken. Reset to 0[cite: 8, 9].
            }
        }

        return false; // Checked the entire row and couldn't find K consecutive seats[cite: 10].
    }

    // Main method to test both approaches
    public static void main(String[] args) {
        int k = 3; // Number of friends looking for seats [cite: 4, 18]

        // Test Case 1: Successful Booking (3 consecutive empty seats exist)
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 0, 0, 0, 1)); // [cite: 18]
        System.out.println("--- Test Case 1 ---");
        System.out.println("Row Layout: " + row1);
        System.out.println("Can book for " + k + " friends? (For-Each): " + canBookConsecutiveForEach(row1, k)); // Expected: true
    }
}
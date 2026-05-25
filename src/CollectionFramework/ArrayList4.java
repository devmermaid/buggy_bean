package CollectionFramework;

import java.util.*;

public class ArrayList4
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Ask user for the total number of drivers
            System.out.print("Enter the number of available drivers (N): ");
            int n = scanner.nextInt();

            // 2. Create an ArrayList to store driver coordinates
            ArrayList<Integer> drivers = new ArrayList<>();

            System.out.println("Enter the coordinates of the drivers:");
            for (int i = 0; i < n; i++) {
                drivers.add(scanner.nextInt());
            }

            // 3. Logic to find the closest driver
            // Start by assuming the first driver in the list is the closest
            int closestDriver = drivers.get(0);
            int minDistance = Math.abs(closestDriver);

            // Loop through the rest of the drivers
            for (int i = 1; i < drivers.size(); i++) {
                int currentDriver = drivers.get(i);
                int currentDistance = Math.abs(currentDriver);

                // Case A: Found a driver who is strictly closer
                if (currentDistance < minDistance) {
                    minDistance = currentDistance;
                    closestDriver = currentDriver;
                }
                // Case B: Tie breaker (Equal distance, prefer the positive coordinate)
                else if (currentDistance == minDistance) {
                    if (currentDriver > closestDriver) {
                        closestDriver = currentDriver;
                    }
                }
            }

            // 4. Output the result
            System.out.println("The closest driver is at coordinate: " + closestDriver);

            scanner.close();
        }
    }


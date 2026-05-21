package CollectionFramework;

//Scenario: You are building a checkout system for an online shopping app.
// The user has added several items to their cart, represented as an ArrayList of item prices.
// If the total bill exceeds $100, the user gets a flat $10 discount.
import java.util.*;

public class ArrayList1
{
    //constructor to send data directly from object to arraylist
    String name;
    double price;
    ArrayList1(String name, double price)
    {
        this.name=name;
        this.price=price;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        //arraylist for cart, as adding items in cart
        ArrayList<ArrayList1> cart = new ArrayList<>();

        //number of items of cart
        System.out.println("Enter number of items for cart: ");
        int totalItems = sc.nextInt();

        // adding items in cart
        for (int i = 1; i <= totalItems; i++) {
            System.out.println("Enter item name: ");
            String name = sc.next();
            System.out.println("Enter item price");
            double price = sc.nextDouble();
            cart.add(new ArrayList1(name, price)); // here directly after accepting value, we will add it to arraylist
        }

        //print cart along with totaling final
        double totalBill = 0;
        for (ArrayList1 item : cart) {
            System.out.println("Name: " + item.name + " Price: " + item.price);
            totalBill += item.price;
        }

        //add discount
        if (totalBill >= 100) {
            double discount = 10.0;
            totalBill -= discount;
            System.out.println("Discount applied: " + discount);
        } else {
            System.out.println("Shop for more than 100 to receive the discount");
        }
        //printing final bill after discount
        System.out.println("Final bill: " + totalBill);
    }
}

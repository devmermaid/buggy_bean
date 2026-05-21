package CollectionFramework;

import java.util.*;

public class ArrayList1
{
    String name;
    double price;
    ArrayList1(String name, double price)
    {
        this.name=name;
        this.price=price;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList1> cart=new ArrayList<>();
        System.out.println("Enter number of items for cart: ");
        int totalItems=sc.nextInt();
        for(int i=1;i<=totalItems;i++)
        {
            System.out.println("Enter item name: ");
            String name=sc.next();
            System.out.println("Enter item price");
            double price=sc.nextDouble();
            cart.add(new ArrayList1(name, price));
        }
        //print cart
        double totalBill=0;
        for(ArrayList1 item:cart)
        {
            System.out.println("Name: "+ item.name+" Price: "+item.price);
            totalBill+=item.price;
        }
        System.out.println("Total Bill: "+ totalBill);
        //add discount
        if(totalBill>=100)
        {
            double discount=10.0;
            totalBill-=discount;
            System.out.println("Discount applied: " + discount);
        }
        else
        {
            System.out.println("Shop for more than 100 to receive the discount");
        }
        System.out.println("Final bill: " + totalBill);
    }
}

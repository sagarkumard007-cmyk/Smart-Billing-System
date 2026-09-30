
import java.util.ArrayList;
import java.util.Scanner;

public class SmartBillingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> amounts = new ArrayList<>();
        System.out.println(" Welcome to Smart Billing System  ");
        System.out.print("Enter Customer Name : ");
        String customerName = sc.nextLine();
        System.out.print("How many product ? :");
        int n = sc.nextInt();
        sc.nextLine();
        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\n Product " + i);

            System.out.print("Enter Product Name :");
            String productName = sc.nextLine();

            System.out.print("Enter Price :");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Quantity : ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double amount = price * quantity;
            total = total + amount;
            productNames.add(productName);
            quantities.add(quantity);
            prices.add(price);
            amounts.add(amount);

        }
        System.out.println("\n=== Sagar Mega Mark Azamgarh ===");
        System.out.println("Customer Name: " + customerName);

        System.out.println("--------------------------------------");
        System.out.println("Item\tQty\tPrice\tAmount");
        System.out.println("--------------------------------------");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println(
                    productNames.get(i) + "\t"
                    + quantities.get(i) + "\t₹"
                    + prices.get(i) + "\t₹"
                    + amounts.get(i)
            );
        }

        System.out.println("--------------------------------------");
        System.out.println("Total Items: " + productNames.size());
        System.out.println("Subtotal: ₹" + String.format("%.2f", total));
        System.out.println("Total Bill: ₹" + String.format("%.2f", total));
        System.out.println("======================================");
        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! What's your name? ");
        String customerName = scanner.nextLine();

        System.out.print("How many coffees do you want? ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per coffee: $");
        double pricePerCoffee = scanner.nextDouble();

        double totalPrice = quantity * pricePerCoffee;

        System.out.println("--- Order Summary ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Quantity: " + quantity + " coffees");
        System.out.println("Total: $" + totalPrice);

        scanner.close();
    }
} 

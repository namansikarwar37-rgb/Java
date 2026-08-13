import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
      Scanner scanner = new Scanner (System.in);

      String item;
      double price;
      int quantity;
      char currency = '$';
      double total;

      System.out.print("what would you like to order? ");
      item = scanner.nextLine();

      System.out.print("what is the price for each? ");
      price = scanner.nextDouble();

      System.out.print("how much would you like to order?");
      quantity = scanner.nextInt();

      total = price * quantity;

      System.out.println("\nYou have bought " + quantity + " " + item + "/s");
      System.out.print("Your Total is : " + currency + total );


      scanner.close();

    }
}

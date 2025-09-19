package thisfinal;

class Product {
   
    private static double discount = 10.0; 

   
    private final int productID;

    private String productName;
    private double price;
    private int quantity;

 
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;       
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }


    public double calculateFinalPrice() {
        double totalPrice = price * quantity;
        double discountAmount = totalPrice * (discount / 100);
        return totalPrice - discountAmount;
    }

 
    public void displayDetails() {
        System.out.println("Product ID   : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Discount     : " + discount + "%");
        System.out.println("Final Price  : ₹" + calculateFinalPrice());
        System.out.println("------------------------------");
    }

   
    public int getProductID() {
        return productID;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
     
        Product p1 = new Product(101, "Laptop", 50000.0, 1);
        Product p2 = new Product(102, "Headphones", 2000.0, 2);

   
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

      
        Product.updateDiscount(15.0);

        System.out.println("\nAfter updating discount:\n");

      
        if (p1 instanceof Product) {
            p1.displayDetails();
        }

        if (p2 instanceof Product) {
            p2.displayDetails();
        }

      
        System.out.println("Unique Product ID of p1: " + p1.getProductID());
    }
}

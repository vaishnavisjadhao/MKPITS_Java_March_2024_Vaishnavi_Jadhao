package arraylists.ims;

import arraylists.sms.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InventaryManagement {
    static ArrayList<Product> products = new ArrayList<>();

    //Add Product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " +product);
    }

    //Update product quantity
    public void updateProduct(int productId, int newQuantity) {
        for (Product product : products) {
            if (product.getProductId()==productId) {
                product.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Product not found!");
    }

    //Remove product by product Id
    public void removeProduct(int productId) {
        products.removeIf(product -> product.getProductId() == productId);
    }

    //display product by sorted by there price
    public void sortedProduct() {
        Collections.sort(products);
        System.out.println(products);
    }

    //display product by price
    public void displayProductByPrice() {
        System.out.println(products);
    }


//    -----------------------------------------------Main---------------------------
     public static void main(String[] args) {
         InventaryManagement ivm = new InventaryManagement();

         String choice;
         Scanner scanner = new Scanner(System.in);

         //Adding product
         do{
             System.out.println("Enter Product Id");
             int productId = scanner.nextInt();
             System.out.println("Enter Product Name: ");
             String name = scanner.next();
             System.out.println("Enter Product Quantity:");
             int quantity = scanner.nextInt();
             System.out.println("Enter Price of Product");
             int price = scanner.nextInt();

             ivm.addProduct(new Product(productId, name, quantity, price));
             System.out.println("Do You Want To stoore another student info(Y/N)");

             choice = scanner.next();
         }
         while (choice.equalsIgnoreCase("Y"));

         //Sorted by price
         System.out.println("\nDisplaying all students sorted by prise:");
         ivm.sortedProduct();

         //Update Product
         ivm.updateProduct(2, 45);
         System.out.println("\nAfter updating quantity:");

         //Removing Student with ID
         System.out.println("Enter Student Id to Remove Student");
         int productId = scanner.nextInt();
         ivm.removeProduct(productId);

         //Display All Student
         System.out.println("\nDisplaying all students:");
         ivm.displayProductByPrice();
     }

}

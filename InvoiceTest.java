/**
 * Create a class called Invoice that a hardware store might use to
 * represent an invoice for an item sold at the store. An Invoice
 * should include four pieces of information as instance
 * variables – a part number (type string), a part description (type
 * string), a quantity of the item being purchased (type int), and a
 * price per item (type double). Your class should have a
 * constructor that initializes the four instance variables. 
 *
 * @Nichalia Wilson
 */
import java.util.Scanner;

public class InvoiceTest
{
   public static void main( String args[] ) 
   {
      Scanner input = new Scanner( System.in );
      //Object creating
      Invoice invoice1 = new Invoice("","", 0, 0.0); // Invoice object
      
      //Variables
      String partNumInput;
      String partDescriptInput;
      int itemQuantInput = 0;
      double itemPriceInput = 0.0;
      double total;
      
      //Display Initial 
      System.out.printf("\nInvoice:\n\nPart number: %s",invoice1.getPartNum());
      System.out.printf("\nPart Descritpion: %s", invoice1.getPartDescript());
      System.out.printf("\nItem Quantity: %d", invoice1.getItemQuant());
      System.out.printf("\nPrice per item: $%.2f", invoice1.getItemPrice());
      
      //INPUT
      System.out.printf("\nEnter the part number: ");
      partNumInput = input.nextLine();
      System.out.printf("\nEnter the part description: ");
      partDescriptInput = input.nextLine();
      System.out.printf("\nEnter the quantity of the items being purchased: ");
      itemQuantInput = input.nextInt();
      while(itemQuantInput < 0)
      {
          System.out.printf("\nQuantity cannot be negative\n");
          System.out.printf("\nEnter the quantity of the items being purchased: ");
          itemQuantInput = input.nextInt();
      }
      System.out.printf("\nEnter the price per item: $");
      itemPriceInput = input.nextDouble();
      while(itemPriceInput < 0)
      {
          System.out.printf("\nPrice cannot be negative\n");
          System.out.printf("\nEnter the price per item: $");
          itemPriceInput = input.nextDouble();
      }
      
      //PROCESSING
      total = invoice1.getInvoiceAmount(itemPriceInput, itemQuantInput);
      invoice1.setPartNum(partNumInput);
      invoice1.setPartDescript(partDescriptInput);
      invoice1.setItemQuant(itemQuantInput);
      invoice1.setItemPrice(itemPriceInput);
      
      //OUTPUT
      System.out.printf("\nInvoice Results:\n\nPart number: %s",invoice1.getPartNum());
      System.out.printf("\nPart Descritpion: %s", invoice1.getPartDescript());
      System.out.printf("\nItem Quantity: %d", invoice1.getItemQuant());
      System.out.printf("\nPrice per item: $%.2f", invoice1.getItemPrice());
      System.out.printf("\nTotal Cost: $%.2f", total);
  
   }
} 
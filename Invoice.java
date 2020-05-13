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
public class Invoice
{   
   //Instance Variables
   private String partNum;
   private String partDescript;
   private int itemQuant;
   private double itemPrice;
   private double amount; //total

   //Constructor
   public Invoice(String num, String description, int quantity, double price)
   {
      //Initialization
      this.partNum = num;
      this.partDescript = description;
      if(itemQuant < 0)
            this.itemQuant = 0;
      else
            this.itemQuant = quantity;
      if(itemPrice < 0)
            this.itemPrice = 0;
      else
            this.itemPrice = price;
   } 

   public double getInvoiceAmount(double price, int quantity)//adds user input
   {      
      amount = price * quantity;  
      return amount;
   } 
   //Setter and Getters
   public String getPartNum()
   {
      return partNum;
   }
   public String getPartDescript()
   {
      return partDescript;
   }
   public int getItemQuant()
   {
      return itemQuant;
   }
   public double getItemPrice()
   {
      return itemPrice;
   }
   public void setPartNum(String num)
   {
      this.partNum = num;
   }
   public void setPartDescript(String description)
   {
      this.partDescript = description;
   }
   public void setItemPrice(double price)
   {
      this.itemPrice = price;
   }
   public void setItemQuant(int quantity)
   {
      this.itemQuant = quantity;
   }
} 

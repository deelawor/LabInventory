import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 */

/**
 * @author DELL
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = true;
		String code = "DitProg123";
		int i =0;
		String itemID, name, itemcat, description, supplier, supplierInfo;
	    int quantity;
	    double price;
	    
		
       Scanner myKey = new Scanner(System.in);
       System.out.println("*_Welcome to Lab Inventory System_*");
       
       while(a==true) {
    	  
          System.out.println("How many items the store can contain? ");
          int n = myKey.nextInt();
	        if (n > 10) {
	        	 Item[] itemDatabase = new Item[n];
	        	 
	        System.out.println(" Ok, Inventory ready.  ");
	       while (b ==true) {
	    	   System.out.println(" ");
		       System.out.println("What do you want to do? "+ "\n" + "       1.Enter a new item to the inventory(Password required)"
		       + "\n" + "       2.Change information of an existing item(Password required)" + "\n" +
		    		   "       3.Display all the items with the specified category" + "\n" +
		       "       4.Display all the items to be re-ordered" + "\n" + "       5.Number of items currently in store" +"\n"
		    		   + "       6.Quit" +"\n" + "Choose between 1-6");
	          int op = myKey.nextInt();
	          
	          while (op == 1) {
	    	     System.out.println("Password: ");
	    	     String c = myKey.next();
	    	     
	    	   if (c.equals(code)){
	    		  System.out.println("How many items will you add? ");
	    		  int x = myKey.nextInt();
	    		  
	    		  if (x < n) {
	    			  System.out.println("You can add them." +"\n"+ "*Please, type in the items details* ");
	    			  
	    			  for (i=0; i<x; i++)
	    			  {
	    				  System.out.println("Enter item ID: ");
	    			      itemID = myKey.next();
	    			      
	    			      System.out.println("Enter item name: ");
	    			      name = myKey.next();
	    			      
	    			      System.out.println("Enter item category: " + "\n" + "*For category we have 'M'-measuring instrument,"
	    			      		+ " 'C'-capacitors, 'D'-diodes, 'T'-transistors, 'R'-resistors, 'S-source(battery,cell,ect), 'B'-boards,"
	    			      		+ " 'DB-development boards, 'I'-input devices, 'O'-output devices.");
	    			      itemcat = myKey.next();
	    			     
	    			      System.out.println("Description: ");
	    			      description = myKey.next();
	    			      
	    			      System.out.println("Enter price: ");
	    			      price = myKey.nextDouble();
	    			     
	    			      System.out.println("Enter quantity: ");
	    			      quantity = myKey.nextInt();
	    			      
	    			      System.out.println("Enter supplier name: ");
	    			      supplier = myKey.next();
	    			      
	    			      System.out.println("Enter supplier's Info: ");    
	    			      supplierInfo = myKey.next();
	    			      
	    			      itemDatabase[i]= new Item(itemID, name, itemcat,description,price,quantity,supplier,supplierInfo);
	    			      itemDatabase[i].setItemID(itemID);
	    			      itemDatabase[i].setName(name);
	    			      itemDatabase[i].setItemcat(itemcat);
	    			      itemDatabase[i].setDescription(description);
	    			      itemDatabase[i].setPrice(price);
	    			      itemDatabase[i].setQuantity(quantity);
	    			      itemDatabase[i].setSupplier(supplier);
	    			      itemDatabase[i].setSupplierInfo(supplierInfo);
	    			  }
	    			  //for (i=0; i<x; i++) {
	    			      System.out.println("Do you want to see what items you added?");
	    			      String ans = myKey.next();
	    			      if (ans.equalsIgnoreCase("yes")) { 
	    			    	  for (i=0; i<x; i++) {
	    			      
	    			    		  System.out.println(itemDatabase[i].toString());}
	    	
	    			      }
	    			      else {
	    			    	  break;
	    			      }	     
	    			      
	    			  	   
	    		  }
	    		  else if (x >= n) {
	    			  System.out.println("You can only add the number of remaining places left in the store.");
	    		  }
	    		  else {
	    			  break;
	    		  }
	    	   }
	    	break; 
	          
	       }
	          
	          while (op == 2) {
	        	  System.out.println("Password: ");
	     	     String c = myKey.next();
	     	     
	     	   if (c.equals(code)){
	     		   System.out.println("Which item you wish to update? " + "\n" + "Please input the item ID: ");
	     		   String id = myKey.next();
	     		  for (i=0; i<n; i++) {
	     		   if (itemDatabase[i].getItemID().equals(id)) {
	     			  
	     			   System.out.println("            ***********************************************            ");
	     			   System.out.println("Name: " + itemDatabase[i].getName() + "\n" + "Description: " + itemDatabase[i].getDescription()
	     					   + "\n" + "Category: " + itemDatabase[i].getItemcat() + "\n" + "Supplier name: " + itemDatabase[i].getSupplier()
	     					   + "\n" + "Supplier contacts: " + itemDatabase[i].getSupplierInfo() +"\n" + "Price: " + itemDatabase[i].getPrice()
	     					   + "\n" + "Available Quantity: " + itemDatabase[i].getQuantity());
	     			  System.out.println("            ***********************************************            ");
	     			   System.out.println("What information of this Item would you like to change? " + "\n"
	     			   + "       1. Name" + "\n" + "       2. Description" + "\n" + "       3. Category" + "\n" 
	     					   + "       4. Supplier name" + "\n" + "       5. Supplier Contacts" + "\n" + "       6. Price" 
	     			   + "\n" + "       7. Available quantity" + "\n" + "       8. Quit" );
	     			  
	     		   }
	     		   } 
	     	   }
	         
	        	  
	          }
	          
	          while (op == 3) {
	        	  
	          }
	          
	          while (op == 4) {
	        	  
	          }
	          
	          while (op == 5) {
	        	  Item.totalItem();
	        	  System.out.println(" ");
	        	  break;  
	          }
	          
	          if (op == 6) {
	        	  System.out.println(" *****Quiting Lab Inventory.***** " + "\n" + "Thank you...");
	        	  break;
	          }
	        
		        }  
       }
       else {
    	   System.out.println("A store can contain a large number of items."+ "\n" +
       "Please give a value above or equal to 10");
    	   continue;
    	  
       }
	        
	  break;      
     }
	myKey.close();
       
	}
	     
}

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
		
		//Declaring variables
		boolean a = true; // to use in while loop
		boolean b = true; // to use in while loop
		String code = "DitProg123"; //Password for op1 and op2
		int i =0;//array index
		String itemID, name, itemcat, description, supplier, supplierInfo,ans;
	    int quantity, leftPlaces;
	    double price;
	    // to accept the user's input
       Scanner myKey = new Scanner(System.in);
       
       System.out.println("*_Welcome to Lab Inventory System_*");
      
       //first loop -  will keep running until user inputs op6: quit inventory 
       while(a == true) {
    	   System.out.println("How many items the store can contain? ");
           int n = myKey.nextInt();
          /**
           * n- number of items the store can contain, thus array size
           */
	        if (n >= 5) {
	        	 Item[] itemDatabase = new Item[n]; //array of items
	        	 
	        System.out.println(" Ok, Inventory ready.  ");
	        
	        //second loop - keep prompting user what he wants to do.
	       while (b ==true) {
	    	   System.out.println(" ");
		       System.out.println("What do you want to do? "+ "\n" + "       1.Enter a new item to the inventory(Password required)"
		       + "\n" + "       2.Change information of an existing item(Password required)" + "\n" +
		    		   "       3.Display all the items with the specified category" + "\n" +
		       "       4.Display all the items to be re-ordered" + "\n" + "       5.Number of items currently in store" +"\n"
		    		   + "       6.Quit" +"\n" + "Choose between 1-6");
	          int op = myKey.nextInt();//op- option  chosen by user
	          
	          while (op == 1) {
	        	 leftPlaces = (n - Item.totalItem());
	    	     System.out.println("Password: ");
	    	     String c = myKey.next();
	    	     
	    	     if (leftPlaces == 0) {
	    			 System.out.println("Store is full");
	    			 break;
	    			  } 
	    	     
	    	   if (c.equals(code)){
	    		  System.out.println("How many items will you add? ");
	    		  int x = myKey.nextInt(); // x - number of items the user wants to input
	    		  
	    		  if (x <= leftPlaces) {
	    			  System.out.println("You can add them." +"\n"+ "*Please, type in the items details* ");
	    			  
	    			  for (i=0; i<x; i++) {
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
	    			 
	    			      System.out.println("Do you want to see what items you added?");
	    			       ans = myKey.next();
	    			      if (ans.equalsIgnoreCase("yes")) { 
	    			    	  for (i=0; i<x; i++) {
	    			      
	    			    		  System.out.println("       ***Item" +(i+1)+" you just added details*** " + "\n" + itemDatabase[i].toString());
	    			    	  }
	    			      }
	    			      else {
	    			    	  break;
	    			      }	     
	    			         
	    			  	   
	    		  }
	    		  else if (x > leftPlaces) {
	    			  System.out.println("You can only add the number of remaining places left in the store." + "\n" + 
	    		  "Do you want to know available places? ");
	    			   ans = myKey.next();
	    			  if(ans.equalsIgnoreCase("yes")) 
	    				  System.out.println("Available places = " + leftPlaces);
	    			  }
	    		  
	    		  
	    			  }	 
	    	   else {
	    		   System.out.println("Wrong password!");
	    		   continue;
	    	   }
	    	break;   
	       }
	          //for (i=0; i<n;) { 
	          while (op == 2) { 
	        	  System.out.println("Password: ");
	     	     String c = myKey.next();
	     	    if (c.equals(code)){
	     	    	for (i=0; i<n; i++) { 
	     		   System.out.println("Which item you wish to update? " + "\n" + "Please input the item ID: ");
	     		   String id = myKey.next();
	     		  
	     		   if (itemDatabase[i].getItemID().equals(id)) {
	     			
	     			   System.out.println("            ***********************************************            ");
	     			   System.out.println("   -Item requested-   ");
	     			   System.out.println("Name: " + itemDatabase[i].getName() + "\n" + "Description: " + itemDatabase[i].getDescription()
	     					   + "\n" + "Category: " + itemDatabase[i].getItemcat() + "\n" + "Supplier name: " + itemDatabase[i].getSupplier()
	     					   + "\n" + "Supplier contacts: " + itemDatabase[i].getSupplierInfo() +"\n" + "Price: " + itemDatabase[i].getPrice()
	     					   + "\n" + "Available Quantity: " + itemDatabase[i].getQuantity());
	     			  System.out.println("            ***********************************************            ");
	     			 
	     			 for (i=0; i<n; i++){
	     			   System.out.println("What information of this Item would you like to change? " + "\n"
	     			   + "       1. Name" + "\n" + "       2. Description" + "\n" + "       3. Category" + "\n" 
	     					   + "       4. Supplier name" + "\n" + "       5. Supplier Contacts" + "\n" + "       6. Price" 
	     			   + "\n" + "       7. Available quantity" + "\n" + " If you do not want to change anything, 8. Quit" );
	     			   int num = myKey.nextInt();
	     			 
	     			  
	     			   if (num == 1){
	     				   System.out.println("Enter the new name: ");
	     				   String newName = myKey.next();
	     				   itemDatabase[i].setName(newName);
	     				   System.out.println(itemDatabase[i]);
	     				   
	     			   }
	     			   else if (num == 2){
	     				   System.out.println("Enter a new description: ");
	     				   String newDescription = myKey.next();
	     				   itemDatabase[i].setDescription(newDescription);
	     				   System.out.println(itemDatabase[i]);
	     			   }
	     			   else if (num == 3){
	     				   System.out.println("Enter the new category: ");
	     				   String newCat = myKey.next();
	     				   itemDatabase[i].setItemcat(newCat);
	     				   System.out.println(itemDatabase[i]);
	     			   }
	     			   else if (num == 4){
	     				   System.out.println("Enter the new supplier's name: ");
	     				   String newSup = myKey.next();
	     				   itemDatabase[i].setSupplier(newSup);
	     				   System.out.println(itemDatabase[i]);
	     			   }
	     			   else if (num == 5){
	     				   System.out.println("Enter supplier's contacts: ");
	     				   String newSupInfo = myKey.next();
	     				   itemDatabase[i].setSupplierInfo(newSupInfo);
	     				   System.out.println(itemDatabase[i]);
	     			   }
	     			   else if (num == 6){
	     				   System.out.println("Enter the new price ");
	     				   double newPrix = myKey.nextDouble();
	     				   itemDatabase[i].setPrice(newPrix);
	     				   System.out.println(itemDatabase[i]);
	     			   }
	     			   else if (num == 7){
	     				   System.out.println("Enter the new quantity: ");
	     				   int newQuan = myKey.nextInt();
	     				   itemDatabase[i].setQuantity(newQuan);
	     				   System.out.println(itemDatabase[i]);
	     			   }
	     			   else if (num ==8) {
	     				   break;
	     			   }
	     			 }
	     		   }
	     		   
	     		   else {
	     			   System.out.println("No such ID was found. Would you like to enter another ID? ");
	     			    ans = myKey.next();
	     			   if (ans.equalsIgnoreCase("yes"))
	     				   continue;
	     			   else {
	     				   break;
	     			   }  
	     		   }
	          break;
	     		  }
	     	    }
	     	   break;
	          }
	          
	          //}
	          
	          while (op == 3) {
	        	  
	          }
	          
	          while (op == 4) {
	        	  
	          }
	          
	          while (op == 5) {
	        	  System.out.println(" ");
	        	  System.out.println("***************************************************************************");
	        	  System.out.println("Number of items currently in store is, " + Item.totalItem() +".");
	        	  System.out.println("***************************************************************************");
	        	  System.out.println(" ");
	        	  break;  
	          }
	          
	          if (op == 6) {
	        	  System.out.println(" *****Quitting Lab Inventory.***** " + "\n" + "Thank you...");
	        	  break;
	          }
	        
		        }  
       }
       else {
    	   System.out.println("A store can contain a large variety of items."+ "\n" +
       "Please give a value of at least 5");
    	   continue;
    	  
       }
	        
	  break;      
     }
	myKey.close();
       
	}

	
	     
}

	

import java.util.Scanner;

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
		String code = "DitProg123";
		
       Scanner myKey = new Scanner(System.in);
       System.out.println("Welcome to Lab Inventory. Let's get started.");
       while(a==true) {
       System.out.println("How many items the store can contain? ");
       int n = myKey.nextInt();
	       
	        if (n > 10) {
	        System.out.println("Ok.");
	      
	       
	       System.out.println("Preparing Items record.");
	       Item[] itemDatabase = new Item[n];
	       
	       Item item1 = new Item("00A355", "Ammeter", "M", "To measure current.", 376.00, 2,
	    		   "Gopy Electronics", "57876905");
	       Item item2 = new Item("0987V10", "Voltmeter", "M", "To measure voltage.", 376.00, 5,
	    		   "Gopy Electronics", "57876905" );
	       Item item3 = new Item("01236789D", "Diode", "EC", "Keep uni-directional flow of current in a circuit", 56.99, 12,
	    		   "A-Elect", "4172345");
	       itemDatabase[0] = item1;
	       itemDatabase[1] = item2;
	       itemDatabase[2] = item3;
	       System.out.println("Currently in store: ");
	       for(int i=0; i<3; i++)
	    	   System.out.println(itemDatabase[i]);
	       
	       System.out.println("What do you want to do? "+ "\n" + "       1.Enter a new item to the inventory(Password required)"
	       + "\n" + "       2.Change information of an existing item(Password required)" + "\n" +
	    		   "       3.Display all the items with the specified category" + "\n" +
	       "       4.Display all the items to be re-ordered" + "\n" + "       5.Number of items currently in store" +"\n"
	    		   + "       6.Quit" +"\n" + "Choose between 1-6");
       int op = myKey.nextInt();
       
       
       
	        }   
       else {
    	   System.out.println("A store can contain a large number of items."+"\n" +
       "Please give a value above or equal to 10");
    	   continue;
    	  
       }
     }
	myKey.close();
	}

}

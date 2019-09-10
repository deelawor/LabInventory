/**
 * 
 */

/**
 * @author Sadiyah.D
 * Parent class Item
 */
public class Item {
//Defining attributes
	private String itemID, name, itemcat, description, supplier, supplierInfo;
	private int quantity;
	private double price;
	static int count; //Keeping count of the number of items created
	
	//Defining constructors
	/**
	 * Default constructor
	 */
	public Item() {
		
	}
	
	/**
	 * 8 Overloaded constructor
	 * @param itemID
	 * @param name
	 * @param itemcat
	 * @param description
	 * @param price
	 * @param quantity
	 * @param supplier
	 * @param supplierInfo
	 * increment count when an item is instantiated using this constructor
	 */
	public Item(String itemID, String name, String itemcat, String description,
			double price, int quantity, String supplier, String supplierInfo) {
		this.itemID = itemID;
		this.name = name;
		this.itemcat = itemcat;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.supplier = supplier;
		this.supplierInfo = supplierInfo;
		count++;
		
	}
	
//Getter and Setter pairs
//Getter to fetch a required information of an item	
//Setter to set a value of an item ,i.e can be use to change any value of the attributes of an item	
	/**
	 * @return the itemID
	 */
	public String getItemID() {
		return itemID;
	}

	/**
	 * @param itemID the itemID to set
	 */
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the itemcat
	 */
	public String getItemcat() {
		return itemcat;
	}

	/**
	 * @param itemcat the itemcat to set
	 */
	public void setItemcat(String itemcat) {
		this.itemcat = itemcat;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the supplier
	 */
	public String getSupplier() {
		return supplier;
	}

	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	/**
	 * @return the supplierInfo
	 */
	public String getSupplierInfo() {
		return supplierInfo;
	}

	/**
	 * @param supplierInfo the supplierInfo to set
	 */
	public void setSupplierInfo(String supplierInfo) {
		this.supplierInfo = supplierInfo;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Checking if we have identical items by their item ID
	 * @param d is referring to the item ID the user will input
	 * @return true if d matches an item ID in the array
	 */
	public boolean equals(Item d) {
		if(this.itemID.equalsIgnoreCase(d.itemID)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * totalItem will display count of number of items created when call
	 */
	public static int totalItem() {
		  return count;
		}
	
	/**
	 * Gives all details of an item when called
	 */
	public  String toString() {
		return ( "Item ID: " + this.getItemID() + "\n" + "Item: " + this.getName() +
				"\n" + "Category: " + this.getItemcat() + "\n" + "Description: " + this.getDescription() + "\n" +
				"Price: " + this.getPrice() + "\n" + "Quantity: " + this.getQuantity() + "\n" +
				"From Supplier: " + this.getSupplier() + "\n" + "Supplier Information: " + this.getSupplierInfo());
	}
	
}

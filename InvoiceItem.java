/**
 *  Adam Ely
 *  Project 2
 *  02/25/2015
 */
 public class InvoiceItem {
	
	//Declare instance variables
	private int itemID;
	private int itemQuantity;
	private double itemPrice;
	private String itemDescription;
	
	//Create get/set methods for the instance variables
	public int getItemID() {
		return itemID;
	}
	
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public String getItemDescription() {
		return itemDescription;
	}
	
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	//This method will calculate the total price for each item
	public double calculateItemTotal() {
		double totalPrice = itemQuantity * itemPrice;
		return totalPrice;
	}
	
	//This method will return a string that will have all the instance variables
	public String display() {
		String returnVariables = "Item ID: " + itemID + "\n"
			+ "Item Quantity: " + itemQuantity + "\n"
			+ "Item Price: " + itemPrice + "\n" 
			+ "Item Description: " + itemDescription + "\n";
		return returnVariables;
	}
 }
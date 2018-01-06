/**
 *  Adam Ely
 *  Project 2
 *  02/25/2015
 */
 public class ProcessInvoice {
 
	//Declare instance variable
	private Invoice invoices;
	
	private void createInvoiceItems() {
		
		// Instantiate three invoices into local array
		InvoiceItem[] someInvoices = new InvoiceItem[3];
		
		someInvoices[0] = new InvoiceItem();
		someInvoices[1] = new InvoiceItem();
		someInvoices[2] = new InvoiceItem();
		
		//Set the objects instance variables with the objects set methods
		someInvoices[0].setItemID(250);
		someInvoices[0].setItemQuantity(8);
		someInvoices[0].setItemPrice(16.45);
		someInvoices[0].setItemDescription("cookies");

		someInvoices[1].setItemID(350);
		someInvoices[1].setItemQuantity(15);
		someInvoices[1].setItemPrice(9.99);
		someInvoices[1].setItemDescription("soda");	

		someInvoices[2].setItemID(450);
		someInvoices[2].setItemQuantity(6);
		someInvoices[2].setItemPrice(2.65);
		someInvoices[2].setItemDescription("chips");

		//Set the array
		invoices.setInvoices(someInvoices);
	}
	
	public void runProcess() {
		
		//Instantiate a new Invoice object and assign it to the instance variable
		invoices = new Invoice();
		
		//Call methods
		createInvoiceItems();
		invoices.calculateInvoice();
		invoices.displayInvoice();
	}
 }
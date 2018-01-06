/**
 *  Adam Ely
 *  Project 2
 *  02/25/2015
 */
 public class Invoice {
	
	//Create instance variables
	private InvoiceItem[] invoices;
	private double invoiceTotal;
	
	//Create a get method for the invoice total variable
	public double getInvoiceTotal() {
		return invoiceTotal;
	}
	
	public void setInvoices(InvoiceItem[] invoices) {
		this.invoices = invoices;
	}
	
	public void calculateInvoice() {
		
		//Create a loop that will calculate the total price for the invoice
		for(InvoiceItem currentInvoice : invoices) {
			invoiceTotal += currentInvoice.calculateItemTotal();
		}
	}	
	public void displayInvoice() {
		
		//Create a loop that calls the display method and displays the invoiceTotal
		for(InvoiceItem currentInvoice : invoices) {
			System.out.println(currentInvoice.display());
		}
			System.out.println("Invoice Total: " + invoiceTotal);		
	}
 }
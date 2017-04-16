package simester2.practive.HW1_SefiAzoulay;

public class PreferredCustomer extends Customer{
	
	private int discount;
	
	public PreferredCustomer (int amountPurchases, int id, String name, int discount){
		super(amountPurchases, id, name);
		this.discount = discount;
	}
	
	public void setDiscount(int discount){
		this.discount = discount;
	}
	
	public int getDiscount (){
		return discount;
	}
	
	//public toString
}

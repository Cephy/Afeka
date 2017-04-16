package simester2.practive.HW1_SefiAzoulay;

public class Customer {
	
	private int amountPurchases;
	private int id;
	private String name;
	
	public Customer (int amountPurchases, int id, String name){
		this.amountPurchases = amountPurchases;
		this.id = id;
		this.name = name;
	}
	
	public void setAmountPurchases (int amountPurchases){
		this.amountPurchases = amountPurchases;
	}
	
	public int getAmountPurchases (){
		return amountPurchases;
	}
	
	//Don't think there should be a set command for I.D - cause it is a unique number that should not be changed
	/*public void setId (int id){
		this.id = id;
	}*/
	
	public int getId (){
		return id;
	}
	
	public void setName (String name){
		this.name = name;
	}
	
	public String getName (){
		return name;
	}
	
	//public toString 
}

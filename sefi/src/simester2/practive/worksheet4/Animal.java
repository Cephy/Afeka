package simester2.practive.worksheet4;

public abstract class Animal {
	
	private String name;
	private boolean sleep;
	private String type;
	
	public Animal (String name, boolean sleep, String type){
		this.name = name;
		this.sleep = sleep;
		this.type = type;
	}
	
	public String getName(){
		return name;
	}
	
	public boolean getSleep(){
		return sleep;
	}
	
	public String getType(){
		return type;
	}
	
	public abstract void say();
	
	@Override
	public String toString(){
		System.out.println();
		return name + " the " + this.getClass().getSimpleName() + " " + "is" + (sleep ? " sleeping... shh ": " awake");
	}
			
}

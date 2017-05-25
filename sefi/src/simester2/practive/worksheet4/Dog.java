package simester2.practive.worksheet4;

public class Dog extends Animal{
	
	public Dog (String name, boolean sleep, String type){
		super(name, sleep, type);
		
	}
	
	@Override
	public void say(){
		if(getSleep()){
			System.out.println("Shhhh, he is sleeping");
		}
		else{
			System.out.println("Houv Houv");
		}
	}
}

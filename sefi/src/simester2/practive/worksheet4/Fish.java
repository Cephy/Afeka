package simester2.practive.worksheet4;

public class Fish extends Animal{
	public Fish (String name, boolean sleep, String type){
		super(name, sleep, type);
		
	}
	
	@Override
	public void say(){
		if(getSleep()){
			System.out.println("Shhhh, he is sleeping");
		}
		else{
			System.out.println("mmmmmm");
		}
	}
}

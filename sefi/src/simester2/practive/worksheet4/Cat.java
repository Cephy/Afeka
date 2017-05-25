package simester2.practive.worksheet4;

import Dangerous.Dangerous;

public class Cat extends Animal implements Dangerous{
	
	public Cat (String name, boolean sleep, String type){
		super(name, sleep, type);
		
	}
	
	@Override
	public void say(){
		if(getSleep()){
			System.out.println("Shhhh, she is sleeping");
		}
		else{
			System.out.println("mieu");
		}
	}
	
	@Override 
	public boolean isDangerous(){
		return false;
	}
}

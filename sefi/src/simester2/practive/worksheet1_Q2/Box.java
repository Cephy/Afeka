package simester2.practive.worksheet1_Q2;

public class Box extends Rect{
	
	private int heigth;
	
	public Box (int width,  int length, int heigth){
		setLength(length);
		setWidth(width);
		this.heigth = heigth;
	}
	
	public void setHeigth (int heigth){
		this.heigth = heigth;
	}
	
	public int getHeigth (int heigth){
		return heigth;
	}
	
	public String toString (){
		return "heigth: " + heigth + super.toString();
	}
	
	public int boxSurface (){
		int tempLength = super.area()/getWidth(); 
		return 2*(area() + getWidth()*heigth + heigth*tempLength);
	}

}

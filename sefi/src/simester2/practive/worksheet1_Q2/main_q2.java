package simester2.practive.worksheet1_Q2;

import java.util.*;

public class main_q2 {
	
	public static void main (System[] args){
		Scanner s = new Scanner(System.in);
		int length, width, heigth;
		
		System.out.println("Please enter the length of the box: ");
		length = s.nextInt();
		System.out.println("Please enter the width of the box: ");
		width = s.nextInt();
		System.out.println("Please enter the heigth of the box: ");
		heigth = s.nextInt();
		
		Box box = new Box(width, length, heigth);
		
		System.out.println("The box details: ");
		System.out.println(box);
		
		System.out.println("The Rectange area: ");
		System.out.println(box.area());
		
		System.out.println("The box surface: ");
		System.out.println();
		
		s.close();
	}
}

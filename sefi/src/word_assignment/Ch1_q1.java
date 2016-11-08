package word_assignment;

import java.util.*;

public class Ch1_q1 {

		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			double radius;
			final double PAI = 3.14159;
			final int FACTOR = 2;		
			System.out.println("what is the radius of the circle? \n");
			radius = s.nextDouble();
			System.out.println("the circumference of the circle is: \n" + (radius*FACTOR*PAI) + "\nand it's surface is: \n" + (radius*radius*PAI));
		
		}

}

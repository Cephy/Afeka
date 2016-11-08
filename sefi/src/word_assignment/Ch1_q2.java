package word_assignment;

import java.util.*;

public class Ch1_q2 {
		
		
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
			final int BASIC_PRICE = 12;
			final int CHEAP_TOPPINGS = 2, EXPENSIVE_TOPPINGS = 3;
			int CheapToppingsNum;
			int ExpensiveToppingsNum;
			
			System.out.println("hello sir, how many deluxe, delicious toppings whould you like in your tost? ");
			ExpensiveToppingsNum = s.nextInt();
			System.out.println("how many cheap distastful toppinng whould you like to have on your Tost?");
			CheapToppingsNum = s.nextInt();
			System.out.println("the total price of your amazing Tost is: "
							  + (BASIC_PRICE+(CHEAP_TOPPINGS*CheapToppingsNum)+(EXPENSIVE_TOPPINGS*ExpensiveToppingsNum)));
		  
			

		}

}

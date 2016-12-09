package word_assignment3;

import java.util.*;

public class Ch5_q19 {

	public static int[] multiplyNumbers(int[] num1, int[] num2){
		
	}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num1 = new int[4];
		int[] num2 = new int[2];
		int sumOfNumbers=0, digitlocationPower=1;
		
		System.out.printf("please a number with %d letters \n", num1.length);
		for (int i=0 ; i<num1.length ; i++){
			num1[i] = s.nextInt();
		}
		System.out.printf("please a number with %d letters \n", num2.length);
		for (int i=0 ; i<num2.length ; i++){
			num2[i] = s.nextInt();
		}
		for (int lowerNum=num2.length-1 ; lowerNum>=0 ; lowerNum-- ){
			int numPower=1;
			for (int upperNum=num1.length-1 ; upperNum>=0 ; upperNum--){
				sumOfNumbers+=((num1[upperNum]*numPower)*(num2[lowerNum]*digitlocationPower));
				System.out.println(sumOfNumbers);
				numPower*=10;
			}
			digitlocationPower*=10;
		System.out.println();
		}
		System.out.println(sumOfNumbers);
	}
}
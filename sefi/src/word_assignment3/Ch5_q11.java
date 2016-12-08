package word_assignment3;

import java.util.*;

public class Ch5_q11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] numbers = new int[5][5];
		int testNumber, ColumnsComparisonCounter=0, rowComparisonCounter=0, maxcolum=0;
		boolean noEqualsFlag = false;
		
		for (int rows=0 ; rows<numbers.length ; rows++){
			for (int Columns=0 ; Columns<numbers.length ; Columns++){
				numbers[rows][Columns] = (int)(Math.random()*10);
			}				
		}
		System.out.println("Please enter a number for comparison ");
			testNumber = s.nextInt();
		for (int Columns=0 ; Columns<numbers.length ; Columns++){
			ColumnsComparisonCounter=0;
			for (int rows=0 ; rows<numbers.length ; rows++){
				if(testNumber==numbers[rows][Columns]){
					ColumnsComparisonCounter++;
				}	
			}
			if(ColumnsComparisonCounter>rowComparisonCounter){
				maxcolum=Columns;
				noEqualsFlag=true;
			}
		}
		if (noEqualsFlag = true){
			System.out.printf("the colum with the most equal numbers to the number you typed in is: %d \n" ,maxcolum);
		}
		else{
			System.out.printf("The number you have entered was no match with any of the colums \n");
		}
		
		for (int rows=0 ; rows<numbers.length ; rows++){
			for (int Columns=0 ; Columns<numbers.length ; Columns++){
				System.out.print(numbers[rows][Columns] + " ");
			}
		System.out.println(" ");
		}
	}
}

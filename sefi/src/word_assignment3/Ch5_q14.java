package word_assignment3;

public class Ch5_q14 {

	public static void main(String[] args) {
		int[][] numbers = new int[6][8]; 
		int counter=0;
		
		for (int rows=numbers[0].length-1 ; rows>=0 ; rows--){
			int operatorSign,columnsFlag, columns;
			
			if (rows%2==1){
				columns=0;
				operatorSign=1;
				columnsFlag=numbers.length;
			}
			else{
				columns=numbers.length-1;
				operatorSign=-1;
				columnsFlag=-1;
			}
			for( ; columns!=columnsFlag ; columns+=operatorSign){
				counter++;
				numbers[columns][rows] = counter;  
			}
		}
		for (int rows=0 ; rows<numbers.length ; rows++){
			for (int columns=0 ; columns<numbers[0].length ; columns++){
				System.out.print(numbers[rows][columns]+"\t");	
			}
		System.out.println();
		}
	}
}
package word_assignment;

import java.util.*;

public class Ch3_q6 {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in); 
	
	final int LOW_SHAPE_FACTOR = 60,  	INTER_SHAPE_FACTOR = 70,
			  BEG_TIME = 2,      	  	INTER_TIME = 4, 				ADV_TIME = 5, 
			  BEG_DIS = 3,            	INTER_DIS_HIGH_SHAPE = 5, 		INTER_DIS_LOW_SHAPE = 3,
			  ADV_DIS_HIGH_SHAPE = 10, 	ADV_DIS_MID_SHAPE = 8, 	  		ADV_DIS_LOW_SHAPE = 3;
			  //BEG = BEGINNER, INTER = INTERMEDIATE, ADV = ADVANCED, DIS = DISTANCE 
	
	double TimeTraining; 
	int ReposePulse; 
	
	System.out.println("how many weeks have you been training? ");
	TimeTraining = s.nextDouble();
	System.out.println("what is your resting heart rate? ");
	ReposePulse = s.nextInt(); 
	
	if (ReposePulse < LOW_SHAPE_FACTOR)
	
	}

}

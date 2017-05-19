//LoopControl by Jessica Wailes

public class LoopControl {

	public static void main(String[] args) {
	
		System.out.println("LoopControl Program by Jessica Wailes"); 
		
		/*Name your Java project  LoopControl and the Class name as LoopControl
		First line of program    // LoopControl by  your name
		First line of output to console  System.out.println(“LoopControl by  your name”); 
		 Use <for > loop  and  <if..else>   branch  to do your program */

		 /*Output to console all the elements  of <numbers> array, one element per line
		  1.Fill an Integer array with random numbers (0-10)
			NOTE: Math.random() is a double but   <numbers> is an integer
		
		Sum the values of all the elements of the <numbers> array and output this value to the console   
		System.out.println(“Sum=  “+ sum);
		Find the average (double variable) of the array elements in <numbers> and output to console to nearest hundredth.
		Find the Maximum value of element  in this array  and output value to the console, nearest tenth
		Use <for> loop  and   <if…else> for your processing.   Remember about casting.
		
   		You may use more than one <for> loop (one to set array[i] values, one to find the  Max  and average values  of  <numbers[i]> , 
   		however it can be accomplished with one loop*/
			
		double sum = 0; //declare sum for later
		int count = 0; //declare count for counting in array
		double average = 0;//declare average for later
		int max = 0;
		
		int [] numbers= new int [10]; //define an array <numbers>
		
		for (int i = 0; i<10; i++) {
			
			numbers[i] = (int)(Math.random()*10) +1; //Fill an array with random numbers 
			sum = sum+numbers[i];
			count++;
			System.out.println("[" + count + "]" + numbers [i]);
			

			if (max < numbers[i]) {
				max = numbers[i];
				}
			else {}
			
			}

		System.out.println("Sum = " + sum);
		
		average = sum/count;
		
		System.out.printf("Average = " + "%1.2f", average);
		System.out.println();
		System.out.println("Maximum value = " + max);
	}
}

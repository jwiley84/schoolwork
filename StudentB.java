
// set up the Class <Student>
public class StudentB {
// Variables	
public String name;  //student name
//public double[] testArray ={3,3,4};
//Student grates
double average=0; //return local variable
//A method inside of this class
//

public double[] setGrades(){
double[] grades = [4];
for (int i=0; i<grades.length; i++)
grades[i]=math.random*10;
//use Math.random to set new array

return grades;

}

public double getAverage(){
	average=0;
	  for(int i=0;i< testArray.length;i++)
	  average=testArray[i]+average;
	return average/(testArray.length) ;
}
} //end class
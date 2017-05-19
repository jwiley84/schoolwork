
// Class <Student> example from book on Object locations -Comping objects (addresses)
   public class DemoB {
   public static void main(String[] args) {
	double average;   
   StudentB std1, std2, std3, std4;  //Declare objects of type  Class <Student>
 // Build student objects using "default" constructor
    std1= new StudentB();     //Create new object belonging to Class <Student>
    std2= new StudentB();   //create second object belonging to Class <Student>
    std3= new StudentB();
    std4=null;    
    //
    // add data in to object <std1> and <std2>
    std1.name="Jessica_Wailes";
    std2.name="Matthew";
    std3.name="Nick";
    System.out.println("std1 name    "  +   std1.name);  
    System.out.println("std2 name    "  +   std2.name);        
    System.out.println("std3 name    "  +   std3.name);   
    std4 = std1;
    System.out.println("std4 matches std1: " + std4.name);
    
    //set grades
    
   
    average= std1.getAverage(); // "call" method in class Student
    System.out.println(std1.name +"  average    "  +  average);    
      }// End Main
}//End Class


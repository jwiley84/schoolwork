
// Class <Student> example from book on Object locations -Comping objects (addresses)
   public class DemoB {
   public static void main(String[] args) {
	double average;   
   StudentA std1, std2, std3, std4;  //Declare objects of type  Class <Student>
 // Build student objects using "default" constructor
     std1= new StudentB();     //Create new object belonging to Class <Student>
    std2= new StudentB();   //create second object belonging to Class <Student>
                       // stores reference to that object in <std2> which is different for <std1 >
    std3=null;
    std3= std1;      
    System.out.println("std3 memory address in hex  "  +  std3);  // outputs the Hex the point of std1
            //
    // add data in to object <std1> and <std2>
    std1.name="Joe";
    std2.name="Bill";
    System.out.println("std1 name    "  +   std1.name);   // Joe
    System.out.println("std2 name    "  +   std2.name);   // Bill               
    System.out.println("std3 name    "  +   std3.name);   // Joe again
    // Arrays in Student class
   
    System.out.println("array in class student std1 "+std1.testArray ); 
    System.out.println("array in class student std2 "+std2.testArray ); 
    System.out.println("array in class student std3 "+std3.testArray );
    average= std1.getAverage(); // "call" method in class Student
    System.out.println(std1.name +"  average    "  +  average);    
      }// End Main
}//End Class


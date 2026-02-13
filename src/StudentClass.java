import java.util.Scanner;

class Student {
   
   String name;
   int rollNo;
    // TODO: Create a parameterized constructor Student(String name, int rollNo)
   Student(String name, int rollNo){
      this.name=name;
      this.rollNo=rollNo;
   }
    
    // TODO: Create a method or use direct access to print details in the required format
    void display(){

      System.out.print("name:"+name+" rollno:"+rollNo);
   }
}

public class StudentClass {
   public static void main{ 
        
        // TODO: Read name1
         Scanner sc=new Scanner(System.in);
         String name1=sc.nextLine();
         int rollNo1=sc.nextInt();
         sc.nextLine();
        // TODO: Read rollNo1
        
        // Hint: Handle the newline consumption if using nextLine() after nextInt()
        
        // TODO: Read name2
         String name2=sc.nextLine();
         int rollNo2=sc.nextInt();
        // TODO: Read rollNo2
        
        // TODO: Create two Student objects
         Student s1=new Student(name1,rollNo1);
         Student s2=new Student(name2,rollNo2);
        
        // TODO: Print details for both students
         s1.display();
         s2.display();
   }  
}

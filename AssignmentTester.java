import java.time.LocalDate;
public class AssignmentTester {
    public static void main(String[] args) {
    

    //1st assignment 
    Assignment myAssignment = new Assignment("project", "3/4/24");
    myAssignment.displayDetails();

    System.out.println("My Assignment: "+myAssignment);

    System.out.println("Assignment 1: "+ myAssignment.getName());
    System.out.println("Assignment 1 due date: "+ myAssignment.getDueDate());
    myAssignment.setName("Lab09");
    myAssignment.setDueDate("6/4/24");
    System.out.println("------------------");
    System.out.println("Updated assignment name is: "+ myAssignment.getName());
    System.out.println("Updated assignment due date is: " + myAssignment.getDueDate()); 
    System.out.println(" ");


    //2nd assignment
    Assignment myAssignment2 = new Assignment("CS501", "10/3/24");
    myAssignment2.displayDetails();

    System.out.println("My Assignment: "+myAssignment2);

    System.out.println("Assignment 2: "+ myAssignment2.getName());
    System.out.println("Assignment 2 due date: "+ myAssignment2.getDueDate());
    myAssignment2.setName("Final project");
    myAssignment2.setDueDate("17/3/24");
    System.out.println("------------------");
    System.out.println("Updated assignment 2 name is: "+ myAssignment2.getName());
    System.out.println("Updated assignment 2 due date is: " + myAssignment2.getDueDate()); 
    
    
    }
}

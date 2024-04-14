import java.util.ArrayList;
public class AssignmentTrackerTester {
    public static void main(String[] args) {
       ArrayList<Assignment> assignments = new ArrayList<>();
       
        Assignment assignment1 = new Assignment("LAB07", "1/26/24"); //1st assignment
        Assignment assignment2 = new Assignment("LAB08", "2/19/24"); //2nd assignment
        Assignment assignment3 = new Assignment("LAB09", "3/12/24"); //3rd assignment
        assignments.add(assignment1);
        assignments.add(assignment2);
        assignments.add(assignment3);
        System.out.println();

        System.out.print("Display Assignments:\n");
        if(assignments.isEmpty())
        {
            System.out.println("No assignments found."); 
        }
        else{
            System.out.print("Assignments: ");
            for (Assignable assignment : assignments) {
                assignment.displayDetails();
                System.out.println("---------------");
            }
    
        }   
    
    } 
}

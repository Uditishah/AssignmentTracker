import java.util.*;

public class AssignmentManager {
    
    public static void main(String[] args) {
        AssignmentTracker assignmentTracker = new AssignmentTracker();
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("1. Add Assignment");
                System.out.println("2. Display Assignments");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = myScanner.nextInt();
                myScanner.nextLine(); 

                switch (choice) {
                    case 1:
                        try {
                            System.out.print("Enter assignment name: ");
                            String name = myScanner.nextLine();
                            System.out.print("Enter due date: ");
                            String dueDate = myScanner.nextLine();
                            Assignment newAssignment = new Assignment(name, dueDate);
                            assignmentTracker.addAssignment(newAssignment);
                            System.out.println("Assignment added successfully.");
                        } catch (Exception e) {
                            System.out.println("Error adding assignment. Please check your input.");
                        }
                        break;

                    case 2:
                        assignmentTracker.displayAssignments();
                        break;

                    case 3:
                        System.out.println("Exiting program. Goodbye!");
                        myScanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid number. Please try again. Select from 1-3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number from 1-3.");
                myScanner.nextLine(); 
            }
        }
    }
}

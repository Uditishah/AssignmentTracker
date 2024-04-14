import java.util.ArrayList;

class AssignmentTracker {
    private ArrayList<Assignable> assignments;

    public AssignmentTracker() {
        this.assignments = new ArrayList<>();
    }

    public void addAssignment(Assignable assignment) {
        assignments.add(assignment);
    }

    public void displayAssignments() {
        if (assignments.isEmpty()) {
            System.out.println("No assignments found.");
        } else {
            System.out.println("Assignments:");
            for (Assignable assignment : assignments) {
                assignment.displayDetails();
                System.out.println("---------------");
            }
        }
    }
}

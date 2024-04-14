import java.time.LocalDate;
class Assignment implements Assignable {
    private String name;
    private String dueDate;
    private LocalDate createdDate;

    public Assignment(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.createdDate = LocalDate.now();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

 
    @Override
    public void displayDetails() {
        System.out.println("Assignment: " + name);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Created On: " + createdDate);

    }
}
class AssignableAssignment extends Assignment {

    public AssignableAssignment(String name, String dueDate) {
        super(name, dueDate);
    }
}
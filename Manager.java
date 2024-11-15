public class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, int employeeID, String department) {
        super(firstName, lastName, employeeID);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void employeeSummary() {
        System.out.println("Manager Summary:");
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("ID: " + getEmployeeID());
        System.out.println("Department: " + department);
        System.out.printf("Salary: $%.2f\n", getSalary());
    }
}
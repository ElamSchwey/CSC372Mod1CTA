public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Bill", "Williams", 1001);
        employee.setSalary(30000);
        employee.employeeSummary();

        System.out.println();
        Manager manager = new Manager("Will", "Billiams", 1002, "Sales");
        manager.setSalary(50000);
        manager.employeeSummary();
    }
}

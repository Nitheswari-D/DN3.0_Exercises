package employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement(5);

        Employee employee1 = new Employee(1, "Alice", "Manager", 75000);
        Employee employee2 = new Employee(2, "Bob", "Developer", 55000);
        Employee employee3 = new Employee(3, "Charlie", "Analyst", 60000);
        Employee employee4 = new Employee(4, "David", "Designer", 50000);
        Employee employee5 = new Employee(5, "Eve", "Tester", 45000);

        employeeManagement.addEmployee(employee1);
        employeeManagement.addEmployee(employee2);
        employeeManagement.addEmployee(employee3);
        employeeManagement.addEmployee(employee4);
        employeeManagement.addEmployee(employee5);

        System.out.println("All Employees:");
        employeeManagement.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 3:");
        Employee searchResult = employeeManagement.searchEmployee(3);
        System.out.println(searchResult != null ? searchResult : "Employee not found");

        System.out.println("\nDeleting Employee with ID 2:");
        employeeManagement.deleteEmployee(2);
        employeeManagement.traverseEmployees();
    }
}


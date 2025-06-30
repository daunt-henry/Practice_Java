/* Write a Java class named Employee with the following:
🔹 Properties:
salary (an int)
name (a String)
🔹 Methods:
1. getSalary() – returns the salary as an int
2. getName() – returns the name as a String
3. setName(String newName) – sets or changes the name
*/

public class Employee {

    // Properties
    private int salary;
    private String name;

    // Method to set the name
    public void setName(String newName) {
        name = newName;
    }

    // Method to get the name
    public String getName() {
        return name;
    }

    // Method to set the salary
    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    // Method to get the salary
    public int getSalary() {
        return salary;
    }
}

// main method to test

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Set name and salary
        emp.setName("Henry");
        emp.setSalary(50000);

        // Get and print name and salary
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: ₹" + emp.getSalary());
    }
}

/*
output 
Employee Name: Henry
Employee Salary: ₹50000
*/

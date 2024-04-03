import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Sandhya", "Teacher", 30000));
        employees.add(new Employee(2, "Bobby", "Painter", 40000));
        employees.add(new Employee(3, "Atlas", "Engineer", 60000));
        employees.add(new Employee(4, "Allysa", "Pianist", 35000));
        
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Sorted Employees by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println(" Sorted Employees by Salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
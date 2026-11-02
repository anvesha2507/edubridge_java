package P17;
class Person {

    String name;
    int age;

    Person(String name, int age) {
        System.out.println("Person constructor");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {

    int employeeId;
    double basicSalary;

    Employee(String name, int age, int employeeId, double basicSalary) {
        super(name, age);
        System.out.println("Employee constructor");
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

public class Manager extends Employee {

    String department;
    double bonus;

    Manager(String name, int age, int employeeId, double basicSalary,
            String department, double bonus) {
        super(name, age, employeeId, basicSalary);
        System.out.println("Manager constructor");
        this.department = department;
        this.bonus = bonus;
    }

    double totalSalary() {
        return basicSalary + bonus;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary());
    }

    public static void main(String[] args) {

        Manager manager = new Manager(
                "Rahul", 30, 101, 50000,
                "Finance", 10000
        );

        System.out.println();

        manager.display();
    }
}
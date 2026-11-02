package P11;
class Person {

    private String name;
    private int age;

    static int peopleCount = 0;
    final String COLLEGE_NAME = "ABC College";

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        peopleCount++;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayDetails(boolean showCollege) {
        displayDetails();

        if (showCollege)
            System.out.println("College: " + COLLEGE_NAME);
    }

    static class Department {

        String departmentName;

        Department(String departmentName) {
            this.departmentName = departmentName;
        }

        void displayDepartment() {
            System.out.println("Department: " + departmentName);
        }
    }
}

class Student extends Person {

    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person {

    String subject;

    Faculty(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Person {

    String role;

    Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    void displayDetails() {
        System.out.println("Administrator Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Role: " + role);
    }
}

public class CollegeManagement {

    public static void main(String[] args) {

        Person[] people = {
                new Student("Rahul", 20, "Computer Science"),
                new Faculty("Dr. Sharma", 40, "Java"),
                new Administrator("Anita", 35, "Office Administrator")
        };

        for (Person person : people) {
            person.displayDetails();
            System.out.println();
        }

        Person person = new Student("Priya", 19, "Economics");

        System.out.println("Using overloaded method:");
        person.displayDetails(true);

        System.out.println();

        Person.Department department =
                new Person.Department("Computer Science");

        department.displayDepartment();

        System.out.println();
        System.out.println("Total people created: " + Person.peopleCount);
    }
}
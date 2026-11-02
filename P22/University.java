package P22;
public class University {

    String universityName;

    University(String universityName) {
        this.universityName = universityName;
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
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

    class Faculty {

        String facultyName;
        String designation;

        Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        void displayFaculty() {
            System.out.println("Faculty: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {

        University university = new University("ABC University");

        Department department = new Department("Computer Science");

        University.Faculty faculty =
                university.new Faculty("Dr. Sharma", "Professor");

        university.displayUniversity();
        department.displayDepartment();
        faculty.displayFaculty();
    }
}
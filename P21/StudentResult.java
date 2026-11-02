package P21;
class ResultSummary {

    String name;
    int total;
    double average;

    ResultSummary(String name, int total, double average) {
        this.name = name;
        this.total = total;
        this.average = average;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

public class StudentResult {

    private String usn;
    private String name;
    private int mark1;
    private int mark2;
    private int mark3;

    static int studentCount = 0;
    final int MAX_MARKS = 100;

    StudentResult(String usn, String name, int mark1, int mark2, int mark3) {
        this.usn = usn;
        this.name = name;
        this.mark1 = validateMarks(mark1);
        this.mark2 = validateMarks(mark2);
        this.mark3 = validateMarks(mark3);
        studentCount++;
    }

    private int validateMarks(int marks) {
        if (marks >= 0 && marks <= MAX_MARKS)
            return marks;
        return 0;
    }

    String getUsn() {
        return usn;
    }

    String getName() {
        return name;
    }

    int getMark1() {
        return mark1;
    }

    int getMark2() {
        return mark2;
    }

    int getMark3() {
        return mark3;
    }

    int calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean result) {
        display();
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    ResultSummary getResultSummary() {
        return new ResultSummary(name, calculateTotal(), calculateAverage());
    }

    public static void main(String[] args) {

        StudentResult s1 = new StudentResult(
                "1AJ1", "Rahul", 85, 90, 80
        );

        StudentResult s2 = new StudentResult(
                "1AJ2", "Ananya", 75, 88, 92
        );

        s1.display();

        System.out.println();

        s1.display(true);

        System.out.println();

        ResultSummary result = s1.getResultSummary();
        result.display();

        System.out.println();
        System.out.println("Students created: " + studentCount);
    }
}
package P1;
class Students{
    String name;
    int age;
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        s1.name="XYZ";
        s1.age=19;
        s2.name="ABC";
        s2.age=18;
        s1.display();
        s2.display();
    }
}

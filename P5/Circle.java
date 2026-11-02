package P5;
class Circle{
    double pi,r,area;
    void input(){
        pi=22/7;
        r=7;
    }
    void calculate(){
        area=pi*r*r;
    }
    void display_area(){
        System.out.println("The area of the circle is : "+area);
    }
    public static void main(String[] args)
    {
        Circle obj=new Circle();
        obj.input();
        obj.calculate();
        obj.display_area();
    }
}

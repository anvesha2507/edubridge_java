package P8;
class Rectangle
{
    double b,l,area;
    void input(){
        b=12;
        l=3;
    }
    void calculate(){
        area=l*b;
    }
    void display_area(){
        System.out.println("The area of the rectangle is : "+area);
    }
    public static void main(String[] args)
    {
        Rectangle obj=new Rectangle();
        obj.input();
        obj.calculate();
        obj.display_area();
    }
}

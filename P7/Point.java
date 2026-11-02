package P7;
public class Point{
    int a,b;
    Point(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("Point:("+a+","+b+")");
    }
    public static void main(String[] args){
        Point p1 = new Point(10,20);
        p1.display();
    }
}

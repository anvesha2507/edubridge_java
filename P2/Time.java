package P2;
public class Time {
    int sec,hr,min;
    Time(){
        sec=0;
        min=0;
        hr=0;
    }
    Time(int h,int m){
        hr=h;
        min=m;
        sec=0;
    }
    Time(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    void display(){
        System.out.println(hr+":"+min+":"+sec);
    }
    public static void main(String[] args){
        Time t1 = new Time();
        Time t2 = new Time(2,30);
        Time t3 = new Time(3,40,50);
        t1.display();
        t2.display();
        t3.display();
    }
}

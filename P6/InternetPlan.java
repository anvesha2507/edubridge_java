package P6;
public class InternetPlan {
    String plan;
    int price;
    InternetPlan() {
        this("Basic", 199);
    }
    InternetPlan(String plan) {
        this(plan, 299);
    }
    InternetPlan(String plan, int price) {
        this.plan = plan;
        this.price = price;
    }
    void display() {
        System.out.println("Plan: " + plan);
        System.out.println("Price: Rs." + price);
    }
    public static void main(String[] args) {
        InternetPlan p1 = new InternetPlan();
        p1.display();

        InternetPlan p2 = new InternetPlan("Premium");
        p2.display();
    }
}

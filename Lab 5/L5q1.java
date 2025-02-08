class SuperClass {
    private int Num = 42; 
    public int getNum() {
        return Num;
    }
}

class SubClass extends SuperClass {
    public void display() {
        // System.out.println("Private variable: " + Num); Can't Access directly from Private variable 
        
        System.out.println("Private variable accessed using getter is: " + getNum());
    }
}

public class L5q1 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}

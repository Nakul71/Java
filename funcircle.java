
import java.util.Scanner;

class funcircle{
    public static void circle(double  radius){
        double circumference = 2 * 3.14 * radius;
        System.out.println(circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of Radius :");
        int radius = sc.nextInt();
        System.out.println("The circumference is : " );
        circle(radius);
    }
}


import java.util.Scanner;

class fungreater{
    public static void greater(int a, int b){
        if(a>b) {
          System.out.println("a is greater than b that is : "+a); 
        } 
        else if(a==b){
            System.out.println("a and b are equal");
        }
        else {
            System.out.println("a is greater than a that is : "+b);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        System.out.println("grater value is : " );
        greater(a,b);
    }
}

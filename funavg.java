
import java.util.Scanner;

class funavg{
    public static void avg(int a, int b, int c){
       double average= (double)(a+b+c)/3;
       System.out.println(average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a = sc.nextInt();
        System.out.println("Enter value of b :");
        int b = sc.nextInt();
        System.out.println("Enter value of c :");
        int c = sc.nextInt();
        System.out.println("the average is : " );
        avg(a,b,c);
        

    }
}
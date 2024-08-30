
import java.util.Scanner;

class funage{
    public static void vote(int age){
        if(age >= 18){
        System.out.println("Is eligible to vote");
        } else if(age >= 0 && age <= 18) {
            System.out.println("Is not eligible to vote");
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        vote(age);
    }
}

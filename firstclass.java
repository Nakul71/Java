import java.util.*;

class firstclass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur age :");
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not Adult");
        }
    }
}
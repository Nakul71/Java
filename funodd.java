
import java.util.Scanner;

class funodd{
    public static void sum(int n){
        int sum = 0;
       for (int i = 1; i <=n; i++) {
        if(i%2!=0){
        sum = sum + i;
        System.out.println(sum);
       }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n = sc.nextInt();
        System.out.println("Sum of all odd no till N :");
        sum(n);
    }
}

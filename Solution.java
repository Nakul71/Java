import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a no. : ");
        int N = scanner.nextInt();
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N%2==0 && N>=2 && N<=5){
            System.out.print("Not Weird");
        }
        else if(N%2==0 && N>=6 && N<=20){
            System.out.print("Weird");
        }
        else if(N%2==0 && N>20){
            System.out.print("Not Weird");
        }
        else{
            System.out.print("Error");
        }
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}  

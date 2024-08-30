import java.util.*;

class TableLoops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n = sc.nextInt();
        int table = 0;
        for (int i = 1; i <=10; i++) {
            table  = table+n;
            System.out.println(table);
        }
        
    }
}
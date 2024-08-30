import java.util.*;

class menudriven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value either 1 or 0 ");
        int n = sc.nextInt();
        switch (n){
            case 1 : 
            do { 
              System.out.println("Enter marks :");  
              int marks = sc.nextInt();
              if(marks>=90){
                System.out.println("This is good");
              }
              else if(marks>=60 && marks <= 89){
                System.out.println("This also good");
              }
              else{
                if(marks<=59 && marks>=0)
                System.out.println("this is good as well");
              }
            } while (n==1);
        case 0 : 
        break;

        
    }
}    
}
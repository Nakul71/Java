class butterfly{
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++){
            System.out.println(" ");
            for (int j = 1; j <=i; j++) {
                System.out.print("*"); 
            }
        for (int j = 1; j <=2*(4-i); j++) {
            System.out.print(" ");
        }
         for (int j = 1; j <=i; j++) {
                System.out.print("*"); 
        }
    }   
    for (int i = 4; i>=1; i--){
            System.out.println(" ");
            for (int j = 1; j <=i; j++) {
                System.out.print("*"); 
            }
        for (int j = 1; j <=2*(4-i); j++) {
            System.out.print(" ");
        }
         for (int j = 1; j <=i; j++) {
                System.out.print("*"); 
        }
}
}
}
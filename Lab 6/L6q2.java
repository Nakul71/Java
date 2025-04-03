import security.SecuritySystem;  
public class L6q2 {
    public static void main(String[] args) {
        SecuritySystem security = new SecuritySystem();
        security.authenticateUser("Nakul", "password123");
        security.authenticateUser("user", "wrongpass"); 
    }
}

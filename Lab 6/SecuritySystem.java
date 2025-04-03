package security;

public final class SecuritySystem {
    public void authenticateUser(String username, String password) {
        if ("Nakul".equals(username) && "password123".equals(password)) {
            System.out.println("Authentication successful!");
        } else {
            System.out.println("Authentication failed!");
        }
    }
}

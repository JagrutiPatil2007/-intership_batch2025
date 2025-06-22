package day10.java;
class User {
    String username;
    String email;

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    void displayUser() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}

public class Admin extends User{
	int adminLevel;

    Admin(String username, String email, int adminLevel) {
        super(username, email);  
        this.adminLevel = adminLevel;
    }

    void displayAdmin() {
        displayUser(); 
        System.out.println("Admin Level: " + adminLevel);
    }


	public static void main(String[] args) {
        Admin admin = new Admin("admin123", "admin@example.com", 5);
        admin.displayAdmin();



	}

}

import java.util.ArrayList;
import java.util.List;

// Responsibility 1: Hold user data
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Responsibility 2: Persistence
class UserRepository {
    private List<User> users = new ArrayList<>();

    public void save(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }
}

// Responsibility 3: Email abstraction
interface EmailService {
    void sendEmail(User user, String message);
}

// Gmail implementation
class GmailService implements EmailService {
    public void sendEmail(User user, String message) {
        System.out.println("To: " + user.getEmail() + " via Gmail");
        System.out.println("Hi " + user.getName());
        System.out.println(message);
    }
}

// Outlook implementation
class OutlookService implements EmailService {
    public void sendEmail(User user, String message) {
        System.out.println("To: " + user.getEmail() + " via Outlook");
        System.out.println("Hi " + user.getName());
        System.out.println(message);
    }
}

// Yahoo implementation
class YahooService implements EmailService {
    public void sendEmail(User user, String message) {
        System.out.println("To: " + user.getEmail() + " via Yahoo");
        System.out.println("Hi " + user.getName());
        System.out.println(message);
    }
}

// Responsibility 4: Factory only creates objects
class EmailFactory {
    public static EmailService getEmailService(String type) {
        if (type.equalsIgnoreCase("gmail")) {
            return new GmailService();
        }
        if (type.equalsIgnoreCase("outlook")) {
            return new OutlookService();
        }
        return new YahooService();
    }
}

// Responsibility 5: User workflow
class UserService {
    private UserRepository repository;
    private EmailService emailService;

    public UserService(UserRepository repository, EmailService emailService) {
        this.repository = repository;
        this.emailService = emailService;
    }

    public void createUser(String name, String email) {
        User user = new User(name, email);
        repository.save(user);
        emailService.sendEmail(user, "Account created successfully");
    }

    public void printUsers() {
        for (User user : repository.getUsers()) {
            System.out.println(user.getName());
        }
    }
}

// Main class
public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        EmailService emailService = EmailFactory.getEmailService("gmail");

        UserService userService = new UserService(repo, emailService);
        userService.createUser("Ankit", "ankit@gmail.com");

        System.out.println("-------------");
        userService.printUsers();
    }
}

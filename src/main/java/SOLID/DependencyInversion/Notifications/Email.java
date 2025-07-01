package SOLID.DependencyInversion.Notifications;

public class Email implements Notifier {

    private User user;

    public Email(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending this message: " + message + " to this user: " + this.user.username + " by email.");
    }
}

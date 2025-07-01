package SOLID.DependencyInversion.Notifications;

public class SMS implements Notifier {

    private User user;

    public SMS(User user) {
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
        System.out.println("Sending this message: " + message + " to this user: " + this.user.username + " by SMS.");
    }
}

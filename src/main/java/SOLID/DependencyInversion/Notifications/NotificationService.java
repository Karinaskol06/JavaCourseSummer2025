package SOLID.DependencyInversion.Notifications;

//notification service doesn't care how the notification is sent
//it just calls the notifier's method "notify"
//handling business logic
public class NotificationService {

    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    //what should the method from the repo so
    public void sendNotification(String message) {
        notifier.notify(message);
    }
}

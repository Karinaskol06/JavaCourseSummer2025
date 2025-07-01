package SOLID.DependencyInversion.Notifications;

public class Main {
    public static void main(String[] args) {

        Notifier notifier = new Email(new User("karinaskol", "11111"));
        NotificationService service = new NotificationService(notifier);
        service.sendNotification("Bombardiro Crocodilo");

        Notifier notifier2 = new SMS(new User("artemtan", "22222"));
        NotificationService service2 = new NotificationService(notifier2);
        service2.sendNotification("Tralalero Tralala");

        System.out.println("Some new text for learning git!");
    }
}

package SOLID.LiskovSubstitution;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "Doe");
        User user2 = new GuestUser("Jane", "Doe");
        User user3 = new AdminUser("Koc", "Doe");
        User user4 = new ManagerUser("Jane", "Doe");

        EditProfileService editProfileService = new EditProfileService(user1);
        EditProfileService editProfileService2 = new EditProfileService(user2);
        EditProfileService editProfileService3 = new EditProfileService(user3);
        EditProfileService editProfileService4 = new EditProfileService(user4);
    }
}

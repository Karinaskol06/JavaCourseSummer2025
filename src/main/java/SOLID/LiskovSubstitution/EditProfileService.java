package SOLID.LiskovSubstitution;

public class EditProfileService {

    public EditProfileService(User user) {

        if (user.canDeleteUsers()) {
            System.out.println("User is Administrator");
        } else if (user.canAddApartments()) {
            System.out.println("User is Moderator");
        } else if (user.canEditProfile()) {
            System.out.println("User is not Guest");
        } else {
            System.out.println("User is Guest");
        }
    }

}

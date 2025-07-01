package SOLID.LiskovSubstitution;

public class GuestUser extends User {

    public GuestUser(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean canEditProfile(){
        return false;
    }
}

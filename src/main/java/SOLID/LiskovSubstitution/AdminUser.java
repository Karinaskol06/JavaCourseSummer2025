package SOLID.LiskovSubstitution;

public class AdminUser extends User{

    public AdminUser(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean canDeleteUsers() {
        return true;
    }

}

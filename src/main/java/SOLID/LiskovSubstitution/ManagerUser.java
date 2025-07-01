package SOLID.LiskovSubstitution;

public class ManagerUser extends User {

    public ManagerUser(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean canAddApartments() {
        return true;
    }
}

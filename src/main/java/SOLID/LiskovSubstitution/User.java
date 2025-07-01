package SOLID.LiskovSubstitution;

public class User {

    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean canEditProfile(){
        return true;
    }

    public boolean canDeleteUsers() {
        return false;
    }

    public boolean canAddApartments() {
        return false;
    }
}

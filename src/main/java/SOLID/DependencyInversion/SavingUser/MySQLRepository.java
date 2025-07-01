package SOLID.DependencyInversion.SavingUser;

public class MySQLRepository implements UserRepository {
    @Override
    public void save(String username) {
        System.out.println("Saving user: " + username + " to MySQL");
    }
}

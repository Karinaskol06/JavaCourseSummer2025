package SOLID.DependencyInversion.SavingUser;

public class Main {
    public static void main(String[] args) {
        UserRepository repo = new MySQLRepository();
        UserService service = new UserService(repo);

        service.registerUser("karinaskol");
    }
}

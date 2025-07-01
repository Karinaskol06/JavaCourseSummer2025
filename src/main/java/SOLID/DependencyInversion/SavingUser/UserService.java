package SOLID.DependencyInversion.SavingUser;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username) {
        userRepository.save(username);
    }
}

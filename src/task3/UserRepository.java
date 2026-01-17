package task3;

public class UserRepository extends Repository<User>{


    @Override
    public void save(User data) {
        System.out.println("User saved: " + data.getName());
    }

    @Override
    public User findById(int id) {
        return new User("Gunel");
    }
}

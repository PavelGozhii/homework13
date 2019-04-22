import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserStorage implements Serializable {
    private final static List<User> users = new ArrayList();

    public static void add(User user) {
        users.add(user);
    }

    public static List<User> getUsers() {
        return users;
    }
}

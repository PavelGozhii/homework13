import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/registration")
public class Registration extends HttpServlet {
    private List<User> userStorage;

    @Override
    public void init() throws ServletException {
        userStorage = UserStorage.getUsers();
        super.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        if (userStorage != null && userStorage.contains(new User(login, password))) {
            out.print("You already registered: " + login);
        } else {
            out.print("You registered, " + login);
            userStorage.add(new User(login, password));
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

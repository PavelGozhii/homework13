public class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String toString() {
        return userName + " " + password;
    }

    @Override
    public boolean equals(Object obj) {
        User user = (User) obj;
        return user.password.equals(this.password) && user.userName.equals(this.userName);
    }
}

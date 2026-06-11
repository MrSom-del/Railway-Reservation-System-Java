package model;

public class User extends Person {

    private int userId;
    private String email;
    private String password;

    public User(int userId, String name,
                String email, String password) {

        super(name);

        this.userId = userId;
        this.email = email;
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User ID: " + userId +
                ", Name: " + name +
                ", Email: " + email;
    }
}
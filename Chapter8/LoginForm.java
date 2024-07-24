
/*
Implement a class LoginForm that simulates a login form that you find on many web 
pages. Supply methods

public void input(String text)
public void click(String button)
public boolean loggedIn()

The first input is the user name, the second input is the password. The click method 
can be called with arguments "Submit" and "Reset". Once a user has been successfully 
logged in, by supplying the user name, password, and clicking on the submit button, 
the loggedIn method returns true and further input has no effect. When a user tries to 
log in with an invalid user name and password, the form is reset.
 */
public class LoginForm {

    private static final String SUBMIT = "Submit";
    private static final String RESET = "Reset";

    private static final String USERNAME = "user";
    private static final String PASSWORD = "pass";

    private static final int LOGGED_IN = -1;
    private static final int USERNAME_TRACK_NUM = 0;
    private static final int PASSWORD_TRACK_NUM = 1;

    private boolean loggedIn;
    private int inputTrack;
    private String username;
    private String password;

    public LoginForm() {
        loggedIn = false;
        inputTrack = 0;
        username = "";
        password = "";
    }

    public void input(String text) {
        if (inputTrack == LOGGED_IN)
            return;

        if (inputTrack == USERNAME_TRACK_NUM) {
            username = text;
            inputTrack++;
        } else if (inputTrack == PASSWORD_TRACK_NUM) {
            password = text;
            inputTrack++;
        }

    }

    public void click(String button) {
        if (button.equalsIgnoreCase(RESET) || button.equalsIgnoreCase(SUBMIT)) {
            if (button.equalsIgnoreCase(RESET)) {
                username = "";
                password = "";
                inputTrack = 0;
                System.out.println("RESET");
            } else {
                if (username.equalsIgnoreCase(USERNAME) && password.equalsIgnoreCase(PASSWORD)) {
                    loggedIn = true;
                    inputTrack = LOGGED_IN;
                }
            }
        }
    }

    public boolean loggedIn() {
        return loggedIn;
    }

    public void getInfo() {
        System.out.println("Username: " + username + ", Password: " + password);
    }

}

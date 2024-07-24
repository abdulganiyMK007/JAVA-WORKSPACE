public class LoginFormSimulator {

    public static void main(String[] args) {
        LoginForm lg = new LoginForm();

        lg.input("textuser");

        lg.input("textpass");
        lg.getInfo();

        lg.input("rrrrrr");
        lg.input("drwwus");
        lg.getInfo();
        lg.click("submit");
        System.out.println("Logged in: " + lg.loggedIn());
        lg.click("reset");
        lg.getInfo();
        lg.click("reset");
        lg.input("user");
        lg.input("pass");
        lg.getInfo();
        lg.click("submit");
        System.out.println("Logged in: " + lg.loggedIn());
        lg.getInfo();

    }

}

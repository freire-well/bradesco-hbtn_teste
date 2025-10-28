import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    String username;
    String password;

    public Person(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Person(String username) {
        this.username = username;
    }

    public Person() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    boolean checkUser(){
        var pattern = "^[a-zA-z0-9]+$";
        if(username.length() < 8){
            return false;
        } else return username.matches(pattern);
    }


    boolean checkPassword() {

        if (password.length() < 8) {
            return false;
        } else if (!runTest("[0-9]", password) || !runTest("[A-Z]", password) || !runTest("[^a-zA-Z0-9]", password)) {
            return false;
        }
        return true;
    }

    boolean runTest(String pattern, String matcher){
        Pattern pat = Pattern.compile(pattern);
        Matcher mat = pat.matcher(matcher);

        return mat.find();
    }

}

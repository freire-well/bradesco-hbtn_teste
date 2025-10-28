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
        } else if (password.matches("^[A-Z]+[0-9]+$") || password.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        return true;
    }

}

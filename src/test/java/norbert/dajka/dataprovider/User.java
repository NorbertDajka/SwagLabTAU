package norbert.dajka.dataprovider;

public class User {
  private final String username;
  private final String password;
  private  String errormessage;


    public User(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }
    public String getUsername() {
        return this.username;
    }
    public String getPassword () {
        return this.password;
    }
    @Override
    public String toString() {
        return "Test run with: " + username;
    }
}

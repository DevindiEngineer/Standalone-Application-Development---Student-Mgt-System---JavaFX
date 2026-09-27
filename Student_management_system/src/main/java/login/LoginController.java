package login;

public class LoginController {
    public boolean checkUserNameAndPassword(String userName, String password) {
        if(userName.equals("Devindi") && password.equals("123")){
            return true;
        }

        return false;
    }
}

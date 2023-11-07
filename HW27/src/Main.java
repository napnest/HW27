import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class Main {
    public static final String LOGIN_PASSWORD_REGEX = "[A-z0-9_]+";
    public static void main(String[] args){
        try {
            logIn("qwersada", "asds", "asd");
        }
        catch (WrongLoginException e){
            System.out.println(e.getMessage());
        }
        catch (WrongPasswordException e){
            System.out.println(e.getMessage());
        }

    }

    public static void logIn(String login,String password,String confirmPassword) throws WrongPasswordException,WrongLoginException {
        if(!validateLogin(login))
            throw new WrongLoginException("Неправильный логин");

        if(!validatePassword(password,confirmPassword))
            throw new WrongPasswordException("Неправильный пароль");

        System.out.println("Welcome!");
    }
    public static boolean validateLogin (String login){
        return login.matches(LOGIN_PASSWORD_REGEX) && login.length() < 20;
    }
    public static boolean validatePassword (String password, String confirmPassword){
        return password.matches(LOGIN_PASSWORD_REGEX) && password.length()<20 && password.equals(confirmPassword);
    }
}
public class UserValidation {
    public boolean validateUsername(String username) {
        return username.length() >= 6
                && username.length() <= 20
                && username.matches("^[a-zA-Z0-9]+$");
    }
    
    public boolean validateEmail(String email) {
        return email.length() >= 6
                && email.length() <= 50
                && email.contains("@");
    }
}

/*
public class UserValidation {
    public boolean validateUsername(String username) {
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }

        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }

        return true;
    }

    public boolean validateEmail(String email) {
        if (email.length() < 6 || email.length() > 50) {
            return false;
        }

        if (!email.contains("@")) {
            return false;
        }

        return true;
    }
}
 */
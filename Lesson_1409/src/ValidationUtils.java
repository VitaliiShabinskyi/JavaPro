import java.util.regex.Pattern;

public class ValidationUtils {
    public boolean isEmailValid(String email) {
        String emailRegex = "^[\\w+.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);

        return pattern.matcher(email).matches();
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[\\D]", "");

        return digitsOnly.length() == 10 && digitsOnly.startsWith("+1");
    }

    public boolean isPasswordValid(String password) {
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[!@#$%].*")
                && !password.contains(" ");
    }
}

/*
public class ValidationUtils {
//    public boolean isEmailValid(String email) {
//        String emailRegex = "^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
//        boolean b = checker(emailRegex);
//        return b;
//    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        if (digitsOnly.length() != 10) {
            return false;
        }

        if (!digitsOnly.startsWith("+1")) {
            return false;
        }

        return true;
    }

    public boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        if (!password.matches(".*\\d.*")) {
            return false;
        }

        if (!password.matches(".*[!@#$%].*")) {
            return false;
        }

        if (password.contains(" ")) {
            return false;
        }
        return true;
    }
}
*/
public class EmailValidator {
    private static final String EMAIL_REGEX = "^[\\w+_.-]+@[\\w.-]+[a-zA-Z]{2,}$";

    public static boolean validateEmail(String email) {
        return email.matches(EMAIL_REGEX);
    }
}

/*
public class EmailValidator {
    //public static boolean validateEmail(String email) {
        // String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        // boolean c = checkEmail(emailRegex);
        //return c;
    //}
}
*/
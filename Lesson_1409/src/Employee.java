public class Employee {
    private final String DOMAIN = "company.com";
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return String.format("%s %s", firstName, lastName);
    }
    
    public String getInitials() {
        return String.format("%c.%c.", firstName.charAt(0), lastName.charAt(0)).toUpperCase();
    }

    public String getEmail() {
        return String.format("%s.%s@%s", firstName, lastName.toLowerCase(), DOMAIN).toLowerCase();
    }
}

/*
public class Employee {
    private String firstName;
    private String lastName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getInitials() {
        return firstName.charAt(0) + "." + lastName.charAt(0) + ".";
    }

    public String getEmail() {
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@company.com";
    }
}
 */
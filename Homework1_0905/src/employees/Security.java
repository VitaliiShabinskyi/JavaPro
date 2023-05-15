package employees;

public class Security {
    private String name;
    private int age;
    private boolean onDuty;

    public Security(String name, int age) {
        this.name = name;
        this.age = age;
        this.onDuty = false;
    }

    public void guard() {
        if (onDuty) {
            System.out.println("Охранник " + name + " на службе и охраняет автосалон.");
        } else {
            System.out.println("Охранник " + name + " выходной.");
        }
    }

    public void toggleDuty() {
        onDuty = !onDuty;
        if (onDuty) {
            System.out.println("Охранник " + name + " на службе.");
        } else {
            System.out.println("Охранник " + name + " не на службе.");
        }
    }

    // Геттеры и сеттеры для свойств охранника
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

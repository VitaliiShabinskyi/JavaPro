public enum Currency {
    UAH ("₴", 38.5),
    USD ("$", 1),
    EUR ("\u20AC", 40.5);

    private final String title;
    private final double kurs;

    Currency(String title, double kurs) {
        this.title = title;
        this.kurs = kurs;
    }

    public String getTitle() {
        return title;
    }

    public double getKurs() {
        return kurs;
    }
}

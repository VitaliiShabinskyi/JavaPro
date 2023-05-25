public enum Days {
    SUNDAY ("Воскресенье"),
    MONDAY ("Понедельник"),
    TUESDAY ("Вторник"),
    WEDNESDAY ("Среда"),
    THURSDAY ("Четверг"),
    FRIDAY ("Пятница"),
    SATURDAY ("Суббота");

    private String title;

    Days(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;

    }

    public static Days fromString(String str) {
        for (Days day : Days.values()) {
            if (day.title.equals(str)) {
                return day;
            }
        }

        return null;
    }
}
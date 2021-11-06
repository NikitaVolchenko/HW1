public enum MonthOfYear {

    JANUARY("January", 31),
    FEBRUARY("February", 28),
    MARCH("March", 31),
    APRIL("April", 30),
    MAY("May", 31),
    JUNE("June", 30),
    JULY("July", 31),
    AUGUST("August", 31),
    SEPTEMBER("September", 30),
    OCTOBER("October", 31),
    NOVEMBER("November", 30),
    DECEMBER("December", 31);

    private String value;
    private int numberOfDays;

    MonthOfYear(String value, int numberOfDays) {
        this.value = value;
        this.numberOfDays = numberOfDays;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public MonthOfYear next() {
        MonthOfYear[] values = values();
        int ordinal = this.ordinal() + 1;
        if (ordinal >= values.length) {
            ordinal = 0;
        }
        return values[ordinal];
    }
}

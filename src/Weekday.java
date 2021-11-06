public enum Weekday {

    WEEKEND {
        @Override
        public String StatusOfTheDay() {
            return "Today you can rest";
        }
    },
    WORKDAY {
        @Override
        public String StatusOfTheDay() {
            return "You're working today";
        }
    };

    public abstract String StatusOfTheDay();

}

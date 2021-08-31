public enum MonthOfYear {

    JANUARY {
        @Override
        public int numberOfDays() {
            return 31;
        }

    },
    FEBRUARY {
        @Override
        public int numberOfDays() {
            return 28;
        }

    },
    MARCH {
        @Override
        public int numberOfDays() {
            return 31;
        }

    },
    APRIL {
        @Override
        public int numberOfDays() {
            return 30;
        }

    },
    MAY {
        @Override
        public int numberOfDays() {
            return 31;
        }

    },
    JUNE {
        @Override
        public int numberOfDays() {
            return 30;
        }

    },
    JULY {
        @Override
        public int numberOfDays() {
            return 31;
        }

    },
    AUGUST {
        @Override
        public int numberOfDays() {
            return 31;
        }

    },
    SEPTEMBER {
        @Override
        public int numberOfDays() {
            return 30;
        }

    },
    OCTOBER {
        @Override
        public int numberOfDays() {
            return 31;
        }

    },
    NOVEMBER {
        @Override
        public int numberOfDays() {
            return 30;
        }

    },
    DECEMBER {
        @Override
        public int numberOfDays() {
            return 31;
        }

    };

    public abstract int numberOfDays();

    public MonthOfYear next() {
        MonthOfYear[] values = values();
        int ordinal = this.ordinal() + 1;
        if (ordinal >= values.length) {
            ordinal = 0;
        }
        return values[ordinal];
    }
}

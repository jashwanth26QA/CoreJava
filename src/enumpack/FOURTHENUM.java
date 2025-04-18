package enumpack;

public enum FOURTHENUM {

    MONDAY {
        @Override
        public String getValue() {
            return "This is MONDAY";
        }
    },
    TUESDAY {
        @Override
        public String getValue() {
            return "This is Tuesday";
        }
    },
    WEDNESDAY {
        @Override
        public String getValue() {
            return "This is Wedenesday";
        }
    },
    THURSDAY {
        @Override
        public String getValue() {
            return "This is Thursday";
        }
    },
    AlertStartDate {
        @Override
        public String getValue() {
            return "This is FRIDAY";
        }
    }
    ;
    public abstract String getValue();
};


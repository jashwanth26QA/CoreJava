package myprograms;

public enum DaysOfWeek {

    SUNDAY{
        @Override
        public String getValue() {
            return "This is Sunday shoes";
        }
    },
    MONDAY{
        @Override
        public String getValue() {
            return "This is Monday Blues";
        }
    };
    public abstract String getValue();
}

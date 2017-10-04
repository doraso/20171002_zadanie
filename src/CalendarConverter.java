public class CalendarConverter {
    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;



    public static String convertDayToString(int dayNumber) {

        String print = "";

        switch (dayNumber) {
            case MONDAY:
                print = "Poniedziałek";
            break;
            case TUESDAY:
                print = "Wtorek";
            break;
            case WEDNESDAY:
                print = "środa";
            break;
            case THURSDAY:
                print = "Czwartek";
            break;
            case FRIDAY:
                print = "Piątek";
            break;
            case SATURDAY:
                print = "Sobota";
            break;
            case SUNDAY:
                print = "Niedziela";
            break;
            default:
                System.out.println("Podano błędną wartość");

        }
        return print;
    }
}



public class ConverterTest {
    public static void main(String[] args) {
        for (int i=1; i<=7; i++){
            String result = CalendarConverter.convertDayToString(i);
            System.out.println(i + " " + "dzień tygodnia to" + " " + result);
        }
    }
}


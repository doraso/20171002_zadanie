public class School {
    public static void main(String[] args) {
        People student1 = new Student("Adam", "Nowak",3);
        People teacher1 = new Teacher("Stefan", "Nowakowski", "Nauki polityczne");

        student1.show();
        teacher1.show();

    }
}

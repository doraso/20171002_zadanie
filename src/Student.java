public class Student extends People{
    private int classYear;

    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public Student(String firstName, String lastName, int classYear) {
        super(firstName, lastName);
        this.classYear = classYear;
    }

    @Override
    public void show(){
        System.out.print("Student: ");
        super.show();
        System.out.println(", " + "rok studiów: " + classYear);
    }


}

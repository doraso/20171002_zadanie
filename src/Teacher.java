public class Teacher extends People {
    private String studiesSubject;

    public String getStudiesSubject() {
        return studiesSubject;
    }

    public void setStudiesSubject(String studiesSubject) {
        this.studiesSubject = studiesSubject;
    }

    public Teacher(String firstName, String lastName, String studiesSubject) {
        super(firstName, lastName);
        this.studiesSubject = studiesSubject;
    }

    @Override
    public void show(){
        System.out.print("Wykładowca: ");
        super.show();
        System.out.println(", " + " wykładany przedmiot:" + " " + studiesSubject);
    }
}

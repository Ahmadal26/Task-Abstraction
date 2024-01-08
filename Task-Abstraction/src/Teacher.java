public class Teacher extends Person {

    private String subject;
    private String school;
    private String major;

    public Teacher(String name, String subject, String school, String major) {
        super(name);
        this.subject = subject;
        this.school = school;
        this.major = major;
    }

    @Override
    void describeRole() {

        System.out.println("Name: " + getName() + "\nSubject: " + subject + "\nSchool: " + school);
    }

    void describeMajor() {

        System.out.println("Major: " + major);
    }
}

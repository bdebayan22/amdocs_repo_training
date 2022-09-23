package Day6;

public class Course {
    public String cName;
    public String trainer;

    public Course(String cName, String trainer) {
        this.cName = cName;
        this.trainer = trainer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                ", trainer='" + trainer + '\'' +
                '}';
    }
}

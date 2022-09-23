package Day6;

import java.util.Arrays;

public class Student {
    public String sName;
    public int regNo;
    public Course[] course;

    public Student(String sName, int regNo, Course[] course) {
        this.sName = sName;
        this.regNo = regNo;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", regNo=" + regNo +
                ", course=" + Arrays.toString(course) +
                '}';
    }
}

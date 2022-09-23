package Day6;

import java.util.ArrayList;


 public class  Util {
    static ArrayList<Course> courseList=new ArrayList<>();

    public static ArrayList<Course> getCourseSet() {
        courseList.add(new Course("Java","Mahendra"));
        courseList.add(new Course("C#","Seema"));
        courseList.add(new Course("C++","Peter"));
        courseList.add(new Course("Spring Boot","Sandeep"));
        return courseList;
    }
}

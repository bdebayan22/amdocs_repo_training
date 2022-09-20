public class Student {
    public String name;
    public int regNo;
    public String dept;

    public Student() {
    }

    public Student(String name, int regNo, String dept) {
        this.name = name;
        this.regNo = regNo;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}

public class DayScholars extends Student{
    public int busNo;

    public DayScholars() {

    }

    public DayScholars(String name, int regNo, String dept, int busNo) {
        super(name, regNo, dept);
        this.busNo = busNo;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    @Override
    public String toString() {
        return "DayScholar{" +
                "busNo='" + busNo + '\'' +
                ", name='" + name + '\'' +
                ", regNo=" + regNo +
                ", dept='" + dept + '\'' +
                '}';
    }
}

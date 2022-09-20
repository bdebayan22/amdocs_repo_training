public class DayScholars extends Student{


    public DayScholars() {

    }

    @Override
    public String getDetails() {
        return "Day Scholars details{" +
                ", name='" + name + '\'' +
                ", regNo=" + regNo +
                ", dept='" + dept + '\'' +
                '}';
    }


}

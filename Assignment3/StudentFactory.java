public class StudentFactory {

    public Student getStudent(int type)
    {
        if(type==1)
        {
            return new DayScholars();
        } else if (type==2) {
            return new Hostellers();
        }
        else
        {
            return null;
        }
    }
}

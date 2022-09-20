import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Type--1.Day Scholar 2.Hosteller");
        StudentFactory sf=new StudentFactory();
        Student s=sf.getStudent(sc.nextInt());
        if(s instanceof DayScholars)
        {
            System.out.println("Enter name,regNo,dept");
            s.setName(sc.next());
            s.setRegNo(sc.nextInt());
            s.setDept(sc.next());
            System.out.println(s.getDetails());
        } else if (s instanceof  Hostellers) {
            System.out.println("Enter name,regNo,dept,hostelNo,roomNo");
            s.setName(sc.next());
            s.setRegNo(sc.nextInt());
            s.setDept(sc.next());
            ((Hostellers) s).setHostelNo(sc.nextInt());
            ((Hostellers) s).setRoomNo(sc.nextInt());
            System.out.println(s.getDetails());
        }
        else {
            System.out.println("Wrong option selected");
        }

    }
}

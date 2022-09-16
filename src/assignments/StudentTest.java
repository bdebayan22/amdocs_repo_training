package assignments;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Details-(Name,Age,Rollno,Mark");
		String nm=sc.next();
		int age=sc.nextInt();
		int roll=sc.nextInt();
		int mark=sc.nextInt();
		if(mark<30)
		{
			System.out.println("Mark less than 30 can not be accepted");
		}
		else
		{
			Student s=new Student(nm,age,roll,mark);
			System.out.println("Student added successfully");
		}
		sc.close();

	}

}

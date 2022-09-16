package assignments;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee[] sArr=new Employee[3];
		for(int i=0;i<sArr.length;i++)
		{
			System.out.println("Enter employee details");
			sArr[i]=new Employee(sc.next(),sc.nextInt(),sc.nextInt());
		}
		
		for(int i=0;i<sArr.length;i++)
		{
			for(int j=i+1;j<sArr.length;j++)
			{
				if(sArr[i].getExp()<sArr[j].getExp())
				{
					Employee e=sArr[j];
					sArr[j]=sArr[i];
					sArr[i]=e;
					
				}
			}
		}
		for(int i=0;i<sArr.length;i++)
		{
			System.out.println(sArr[i]);
		}
      sc.close();
	}

}

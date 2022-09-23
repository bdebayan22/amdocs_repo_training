package Day6;

import java.util.*;

import static Day6.Util.getCourseSet;

public class TestELearning {
    public static void main(String[] args) throws ElearningException{
        Scanner sc=new Scanner(System.in);
       int i=0;
        ArrayList<Course> cList=getCourseSet();
        HashMap<Integer,Student> studentHashMap=new HashMap<>();

       while(i!=1)
       {
           System.out.println("Enter your choice\n1.Add course 2.Add Student 3.View all courses 4.View Registered Student" +
                   " 5.Exit");
           int choice=sc.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("Enter course details-(course name,trainer name)");
                   cList.add(new Course(sc.next(), sc.next()));
                   break;
               case 2:
                   System.out.println("Enter Student details-(regNo,Student name)");
                   int id = sc.nextInt();
                   String nm = sc.next();
                   System.out.println("How many courses you want to select");
                   Course[] cArray = new Course[sc.nextInt()];
                   System.out.println("Select courses from this list");
                   Iterator<Course> itr = cList.iterator();
                   while (itr.hasNext())
                       System.out.println(itr.next());
                   int courseOption;
                   for (int j = 0; j < cArray.length; j++) {
                       System.out.println("Enter course no-");
                       courseOption=sc.nextInt()-1;
                       if(courseOption>cArray.length)
                           throw new ElearningException("Wrong course number selected");
                       else
                         cArray[j] = cList.get(courseOption);
                   }
                   if(studentHashMap.containsKey(id))
                       throw new ElearningException("Student already registered");
                   else
                      studentHashMap.put(id, new Student(nm, id, cArray));
                   break;
               case 3:
                   System.out.println("Available courses--");
                   Iterator<Course> itr1 = cList.iterator();
                   while (itr1.hasNext())
                       System.out.println(itr1.next());
                   break;
               case 4:
                   System.out.println("Registered Students--");
                   for (Student stud : studentHashMap.values())
                       System.out.println(stud);
                   break;
               case 5:
                   i = 1;
                   break;
               default:
                   throw new ElearningException("Wrong option selected");
           }
           }

       }
    }


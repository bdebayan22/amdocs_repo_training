package Assignment6;

import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,Student> studentMap=new TreeMap<Integer,Student>();

        studentMap.put(101,new Student(101,"Ravi",11));
        studentMap.put(103,new Student(103,"Seema",12));
        studentMap.put(104,new Student(104,"sagar",14));
        studentMap.put(102,new Student(102,"aman",13));

        for(int n :studentMap.keySet())
        {
            Student stud=studentMap.get(n);
            if(stud.getName().startsWith("S") || stud.getName().startsWith("s"))
                System.out.println(stud);
        }




    }
}

package assignments;

public class StringConversion {

	public static void main(String[] args) {
		String s="i love java";
		String fString=s.substring(0, 1);
		String remaining=s.substring(1, s.length());
		 s=fString.toUpperCase()+remaining;
		 System.out.println(s);
		

	}

}

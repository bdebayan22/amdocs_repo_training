package assignment1;

public class StringFreqency {

	public static void main(String[] args) {
		String s="aaabbbbccdddd";
		int i=0,count=1;
		for(int j=1;j<s.length();j++)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				s=s.substring(0,i+1)+count+s.substring(j, s.length());
				count=1;
				i+=2;
				j=i;
			}
			else
			{
				count++;
			}
		}
		s=s.substring(0, i+1)+count;
		System.out.println(s);
		

	}

}

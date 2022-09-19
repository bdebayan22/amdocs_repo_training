package assignments;

public class FreqencyCount {

	public static void main(String[] args) {
		String str="aabbbbeeeeffggg";
		char cArr[]=str.toCharArray();
		for(int i=0;i<cArr.length;i++)
		{
			for(int j=0;j<cArr.length;j++)
			{
			if(cArr[i]==cArr[j])
			{
				//count++;
			}
			}
		}

	}

}

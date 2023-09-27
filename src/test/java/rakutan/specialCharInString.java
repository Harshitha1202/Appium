package rakutan;

import org.testng.annotations.Test;

public class specialCharInString 
{
	@Test
	public void test()
	{
		String s="harshh1887@$&";
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				System.out.print(s.charAt(i));
				//s1=s1+s.charAt(i);
			}
		}
		
		System.out.print(",");
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(!(s.charAt(i)>='0' && s.charAt(i)<='9') && !(s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				System.out.print(s.charAt(i));
				//s2=s2+s.charAt(i);
			}	
		}
	}
}

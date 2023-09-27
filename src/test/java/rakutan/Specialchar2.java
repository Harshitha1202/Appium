package rakutan;

import org.testng.annotations.Test;

public class Specialchar2 {

	@Test
	public void test()
	{
		String s="harshh1887@$&";
		String s1 = "";
		String s2= "";
		for (int i = 0; i < s.length(); i++) 
		{
			if(!(s.charAt(i)>='A' && s.charAt(i)<='Z') && !(s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				if(s.charAt(i)>='0' && s.charAt(i)<='9')
					s1=s1+s.charAt(i);
				else
					s2=s2+s.charAt(i);
			}
		} 
		System.out.println(s1+","+s2 );
	}
}

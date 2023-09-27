package rakutan;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CountChar 
{
	@Test
	public void test()
	{
		String st="My name is harsh";
		String s = st.replace(" ", "");
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		{
			for (int i = 0; i < s.length(); i++) 
			{
				set.add(s.charAt(i));		
			}
			for (Character ch : set) 
			{
				int count=0;
				for (int i = 0; i < s.length(); i++)
				{
					if(ch==s.charAt(i))
						count++;
				}
				System.out.print(ch+":"+count+" ");
			}
		}	
	}
}

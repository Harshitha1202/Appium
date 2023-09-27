package rakutan;

import org.testng.annotations.Test;

public class stringReverse 
{
	public static void main(String[] args) {
		String s="My name is harsh";
		String[] st = s.split(" ");
		for (int i = st.length-1; i >= 0; i--) 
		{
			System.out.print(st[i]+" ");
		}
	}
	
	@Test
	public void test()
	{
		String s="My name is harsh";
		String[] st = s.split(" ");
		for (String s1 : st) {
			for (int j = s1.length()-1; j >=0; j--) 
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}

}

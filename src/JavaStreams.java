import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaStreams {

	@Test
	public void test()
	{
		ArrayList<String> name = new ArrayList<String>();
		name.add("Ajeet");
		name.add("Abhishake");
		name.add("Bsdf");
		name.add("Csdfg");
		name.add("Dfgh");
		
		int count=0;
		for(int i=1;i<name.size();i++)
		{
			String actualNmae = name.get(i);
			if(actualNmae.startsWith("A"))
			{
				count++;
			}
		}
		
		System.out.println(count);
	} 

}

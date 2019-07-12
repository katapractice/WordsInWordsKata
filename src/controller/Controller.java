package controller;

import java.util.ArrayList;

public class Controller
{
	
	
	public void start()
	{
		String a[] = new String[]{ "arp", "live", "strong" };
    	String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
 		inArray(a,b);
	}
	
	
	private String[] inArray(String[] array1, String[] array2)
	{
		ArrayList<String> returnMeList = new ArrayList<String>();
		
		for(String word1:array1)
		{
			for(String word2:array2)
			{
				if(word1.length() < word2.length())
				{
					if(word2.contains(word1))
					{
						returnMeList.add(word1);
					}
				}
				else
				{
					if(word2.contains(word1))
					{
						returnMeList.add(word2);
					}
				}
			}
		}
		
		
		String returnArr[] = new String[returnMeList.size()];
		for(int i = 0; i < returnArr.length; i++)
		{
			
		}
	}
}

package controller;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller
{
	
	
	public void start()
	{
		String a[] = new String[]{ "tarp", "mice", "bull"};
    	String b[] = new String[] {"lively", "alive", "harp", "sharp", "armstrong"};
 		inArray(a,b).toString();
	}
	
	
	private String[] inArray(String[] array1, String[] array2)
	{
		ArrayList<String> returnMeList = new ArrayList<String>();
		
		for(String word1:array1)
		{
			for(String word2:array2)
			{
				if(word1.length() <= word2.length())
				{
					if(word2.contains(word1) && returnMeList.indexOf(word1) == -1)
					{
						returnMeList.add(word1);
					}
				}
				
			}
		}
		
		java.util.Collections.sort(returnMeList);
		String returnArr[] = new String[returnMeList.size()];
		for(int i = 0; i < returnArr.length; i++)
		{
			returnArr[i] = returnMeList.get(i);
			System.out.println(Arrays.deepToString(returnArr));
		}
		
		return returnArr;
	}
}

package MinMaxSum;

import java.util.Collections;
import java.util.List;

public class Result {
	
	public static void miniMaxSum(List<Integer> arr) 
	{
	    Collections.sort(arr);
	    int arrSize=arr.size()-1;
	    long sumMin=0;
	    long sumMax=0;
	    
	    for(int i=0;i<4;i++)
	    {
	    	sumMin+=arr.get(i);
	    }
	    
	    for(int j=0;j<4;j++) // 
	    {
	    	sumMax+=arr.get(arrSize);
	    	arrSize--;	
	    }
	   System.out.print(sumMin+" "+sumMax);
	
	}

}

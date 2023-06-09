package PlusMinus;

import java.util.List;

public class Solution {

	public static void plusMinus(List<Integer> arr) {
	    
		double pozitiveNumberCount=0;
		double negativeNumberCount=0;
		double zeroNumberCount=0;
		double resultPozitiveDivide;
		double resultNegativeDivide;
		double resultZeroDivide;
		
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i)>0)
			{
				pozitiveNumberCount++;
			}
			else if(arr.get(i)<0)
			{
				negativeNumberCount++;
			}
			else if(arr.get(i)==0)
			{
				zeroNumberCount++;
			}
		}
		resultPozitiveDivide=pozitiveNumberCount/(arr.size());
		resultNegativeDivide=negativeNumberCount/(arr.size());
		resultZeroDivide=zeroNumberCount/(arr.size());
		
		System.out.println(resultPozitiveDivide);
		System.out.println(resultNegativeDivide);
		System.out.println(resultZeroDivide);

	    }
}

package CompareTheTriplet;

import java.util.ArrayList;
import java.util.List;

public class Compare {

	  //SOLUTİON WİTH ARRAYLİST
	    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {    
         List<Integer>allPoints=new ArrayList<>(2);
         int alicePoints=0;
 		 int bobPoints=0;
 		 for(int i=0;i<a.size();i++)
		  {
			if(a.get(i)>b.get(i))
			{
				alicePoints++;	
			}
			else if(b.get(i)>a.get(i))
			{
				bobPoints++;
			}	
		  }
 		allPoints.add(alicePoints);
 		allPoints.add(bobPoints);
 		
 		return allPoints;
	    }
	 //SOLUTİON WİTH ARRAYS
	/*
	public int [] compareTriplets(int[]a,int[]b)
	{
		int []allPoints=new int[2];
		int alicePoints=0;
		int bobPoints=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b[i])
			{
				alicePoints++;	
			}
			else if(b[i]>a[i])
			{
				bobPoints++;
			}
		}
		allPoints[0]=alicePoints;
		allPoints[1]=bobPoints;
		return allPoints;
	}
	*/
}

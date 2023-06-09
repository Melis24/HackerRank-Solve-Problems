package DiagonalDifference;

import java.util.List;

public class Result {
	
	private static  int rightDiagonalSum=0;
    private static  int leftDiagonalSum=0;
 
	//SOLUTİON WİTH LİST
	public static int diagonalDifference(List<List<Integer>> arr)
	{ 
	     int rightDiagonalSum=0;
	     int leftDiagonalSum=0;
		for(int i=0;i<arr.size();i++)                 
		{
			leftDiagonalSum += arr.get(i).get(i); // 0-0  1-1  2-2 
	        rightDiagonalSum += arr.get(i).get(arr.size() - 1 - i);	// 0-2 1-1 2-0
		}
        return Math.abs(leftDiagonalSum-rightDiagonalSum);
	}
	//SHOW THE RİGHT AND LEFT DİAGONAL SUM
  	public static void showSum()
  	{
  		 System.out.println("right sum: "+rightDiagonalSum);
  	     System.out.println("left sum: "+leftDiagonalSum);
  	}
  	
    /*
  //SOLUTİON WİTH ARRAYS
  	public static int diagonalDifference(int[][]arr)
  	{
  	     for(int i=0;i<arr.length;i++)
  	     {
  	    	 leftDiagonalSum+=arr[i][i];
  	     }
  	     for(int i=0;i<arr.length;i++)
  	     {
  	    	 rightDiagonalSum+=arr[i][arr.length - 1 - i];
  	     }
  	     return Math.abs(leftDiagonalSum-rightDiagonalSum);
  	}
  	*/
}

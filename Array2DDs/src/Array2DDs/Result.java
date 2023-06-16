package Array2DDs;

import java.util.List;

public class Result {
	
	public static int hourglassSum(List<List<Integer>> arr) {
	    int maxSum = Integer.MIN_VALUE;

	    for (int i = 0; i < arr.size() - 2; i++) {
	        for (int j = 0; j < arr.get(i).size() - 2; j++) {
	            int sum = calculateHourglassSum(arr, i, j);
	            maxSum = Math.max(maxSum, sum);
	        }
	    }
	    return maxSum;
	}

	private static int calculateHourglassSum(List<List<Integer>> arr, int row, int col) {
	    int sum = 0;

	    sum += arr.get(row).get(col);
	    sum += arr.get(row).get(col + 1);
	    sum += arr.get(row).get(col + 2);

	    sum += arr.get(row + 1).get(col + 1);

	    sum += arr.get(row + 2).get(col);
	    sum += arr.get(row + 2).get(col + 1);
	    sum += arr.get(row + 2).get(col + 2);

	    return sum;
	}

}

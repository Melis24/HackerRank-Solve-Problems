package DiagonalDifference;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args)
	{
		//MAİN FOR LİST
		Scanner sc=new Scanner(System.in);
		List<List<Integer>>arr=new ArrayList<>();
		System.out.println("enter the arrays numbers: ");
		
		for(int i=0;i<3;i++)
		{
			List<Integer>row=new ArrayList<>();
			for(int j=0;j<3;j++)
			{
				row.add(sc.nextInt());
			}
			arr.add(row);
		}
		System.out.println(Result.diagonalDifference(arr));
		
		/*
		 * MAİN FOR ARRAYS
		 Scanner sc=new Scanner(System.in);
		int[][]arr=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println(Result.diagonalDifference(arr));
		Result.showSum();
		*/
		
		
	}

}

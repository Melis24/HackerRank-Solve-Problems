package Array2DDs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int row,column;
		List<List<Integer>>array=new ArrayList<>();
		System.out.println("Enter arrays row and column: ");
		row=sc.nextInt();
		column=sc.nextInt();
		
		System.out.println("Enter the arrays members");
		for(int i=0;i<row;i++)
		{
			List<Integer>rowList=new ArrayList<>();
			for(int j=0;j<column;j++)
			{	
				rowList.add(sc.nextInt());
			}
			array.add(rowList);
		}
		
	}
}

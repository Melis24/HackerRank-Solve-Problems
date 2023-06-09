package PlusMinus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.print("enter the array is size: ");
		size=sc.nextInt();
		List<Integer>arr=new ArrayList<>(size);
		
		System.out.print("Enter " + size + " numbers:");
		
		for(int i=0;i<size;i++)
		{
			arr.add(sc.nextInt());
		}
		Solution.plusMinus(arr);
	}
}

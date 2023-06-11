package MinMaxSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>arr=new ArrayList<>();
		int size;
		System.out.println("enter the size of list: ");
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			arr.add(sc.nextInt());
			
		}
		Result.miniMaxSum(arr);
	}

}

package CompareTheTriplet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		List<Integer>a=new ArrayList<>();
		List<Integer>b=new ArrayList<>();
	 
	   
	   System.out.println("Enter the a arrays numbers:");
	   for(int i=0;i<3;i++)
	   {
		   a.add(sc.nextInt());
	   }
	   System.out.println("Enter the b arrays numbers:");
	   for(int i=0;i<3;i++)
	   {
		  b.add(sc.nextInt());
	   }
	   
	   Compare compare=new Compare();
	   ArrayList<Integer>result=(ArrayList<Integer>) compare.compareTriplets(a, b);;
	  
	   System.out.println((result));
	   

	}

}

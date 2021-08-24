/*import java.util.*;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number to Check Armstrong or Not ");
		int n=sc.nextInt();
		int c=0,a;
		int temp=n;
		while(n>=0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println(temp+" Number is Armstrong");
		}
		else
		{
			System.out.println(temp+" Number is Not Armstrong");
		}
		
	}

}

*/

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check Whether its Armstrong or Not :  ");
		int num=sc.nextInt();
		int c=0,a;
		int temp=num;
		while(num>=0)
		{
			a=num%10;
			num=num/10;
			c=c+(a*a*a);
		}
		if(temp==c)
		{
			System.out.println("Number Is Not Armstrong");
		}
		else 
		{
			System.out.println("Number Is Not Armstrong");
		}

	}

}

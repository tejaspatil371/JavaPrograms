import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) 
	{
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Integer or String  ");
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println(str+"  Its Palindrom");
		}
		else
		{
			System.out.println(str+"  Its Not Palindrom");
		}

	}

}

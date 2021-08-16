import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String  ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		System.out.println("Reverse String Is  ");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
	}
	
}

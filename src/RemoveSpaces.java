import java.util.Scanner;
public class RemoveSpaces {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to Remove Spaces  ");
		String str=sc.nextLine();
		String str2=str.replaceAll("\\s","");
		System.out.println("String without Spaces:  "+str2);
	}

}

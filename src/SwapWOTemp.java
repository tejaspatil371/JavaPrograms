import java.util.Scanner;

public class SwapWOTemp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Integer to Swap without Third Veriable  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping Integer a = "+a+", b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping Integer a = "+a+", b = "+b);

	}

}

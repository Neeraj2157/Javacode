package testing;


import java.util.Scanner;

public class Table
{
	int a;
	public Table() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number = ");
		a= s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			int c= a*i;
			
			System.out.println(a+"*"+i+"=" +c);
		}
	}
	public static void main(String[] args)
	{
		
		Table obj = new Table();

	}

}


import java.util.*;
import java.lang.*;

class prac40
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter any string: ");
		String str=in.nextLine();
		int i,r=0,sum=0;
		if(str.charAt(0)=='-')
		{
			for(i=1;i<=str.length()-1;i++)
			{
				r=(int)str.charAt(i);
				r=r-48;
				sum=sum*10+r;
			}
			sum=-sum;
		}
		else
		{
			for(i=0;i<=str.length()-1;i++)
			{
				r=(int)str.charAt(i);
				r=r-48;
				sum=sum*10+r;
			}
		}
		System.out.print("The number = "+sum);
	}
}
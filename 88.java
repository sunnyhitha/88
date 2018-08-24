/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,c=0;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=1;i<=a&&i<=b;i++)
		{
			if(a%i==0&&b%i==0)
			{
				c=i;
			}
		}
		int lcm=(a*b)/c;
		System.out.print(lcm);// your code goes here
	}
}

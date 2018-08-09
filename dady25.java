/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int number,temp,total=0;
        number=num;
        while(number!=0)
        {
          temp=number%10;
          total=total+temp*temp*temp;
          number/=10;
        }
      if(total==num)
      {
        System.out.println("yes it is a amstrong number");
      }
      else
      {
        System.out.println("no it is not a amstrong number");
      }
	}
}

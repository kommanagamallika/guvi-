/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	             while(n>2){
			if(n%2!=0){
				c++;
				
			}
			n=n/2;
		}
		if(c>0){
			System.out.print("no");
		}
		else{
			System.out.print("yes");
		}
	}
}

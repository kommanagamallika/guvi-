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
				int n,k,j=0;
		int[] a=new int[10];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<n;i++){
			if(a[i]==k){
				j++;
			}
		}
		if(j>=1){
			System.out.print("yes");
		}
		else{
			System.out.print("no");
		}
	}
}

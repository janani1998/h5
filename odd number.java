
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=2143;
		int t=n;
             	int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		int a[]=new int[c];
                        int i=c-1;	
		while(t!=0){
			a[i]=t%10;
			t=t/10;
			i--;
		}
			for(int j=0;j<c;j++){
			if(a[j]%2!=0){
			System.out.print(a[j]+" ");
			}
			}
		
	}
}

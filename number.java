
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 String s="5GUVI12";
	 int i=0;
	 int l=s.length();
	 String b[]=new String[l];
	 for( i=0;i<l;i++){
	 	b[i]=s.substring(i,i+1);
	 if(b[i].equals("0")||b[i].equals("1")||b[i].equals("2")||b[i].equals("3")||b[i].equals("4")||b[i].equals("5")||
	 b[i].equals("6")||b[i].equals("7")||b[i].equals("8")||b[i].equals("9"))
	 System.out.print(Integer.parseInt(b[i]));
	}
	}
}

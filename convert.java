import java.util.*;
class convert
{
	public static void main(String[] args) 
	{
		String s1,s2;
		Scanner q=new Scanner(System.in);
		s1=q.next();
		s2=q.next();
		int i=Integer.parseInt(s1);
		int j=Integer.parseInt(s2);
		if(i>j)
		{
			System.out.println(i + " Is bigger!");
		}
		else
		{
			System.out.println(j  + " Is bigger!");
		}
		
	}
}
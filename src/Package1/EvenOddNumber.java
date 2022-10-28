package Package1;

public class EvenOddNumber 
{
	public static void main(String[] args)
	 {
	   int a=10;
	   int count = 0;
	   
	   for(int i=a;i<=100;i++)
	   {
	    if(i%2==0)
	     {
	       System.out.println(i+" is even number");
	      }
	     else
	     {
	        System.out.println(i+" is Odd number");
	        count++;
	      }
	    
	   }
	   System.out.println(count);
	 }

}

//HERE WE ARE MAKING THE SYNCHRONIZED METHOD
//when we don't made a method synchronized then the object count is not synchronized 
package com.example;

class Counter
{
	int count;
	public synchronized void increment()
	{
		count++;
	}
}
public class Demo8 
{

	public static void main(String args[])throws Exception
	{
		Counter c=new Counter();
	Thread t1=new Thread(new Runnable()
	  {
			public void run()
			{
				for(int i=1;i<=1000;i++)
				{
					c.increment();
				}
				
				
			}
			
	  });
		
		      t1.start();
		      t1.join();
		
		System.out.println("count"+ c.count);
		
		Thread t2=new Thread(new Runnable()
		{
	         public void run()
	         {
	        	for(int i=1;i<=1000;i++)
		        {
			       c.increment();
		        }
		
	          }
	
		});
		
		t2.start();
	    t2.join();
	
	    System.out.println("count"+ c.count);

	}

}

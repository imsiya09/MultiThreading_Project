package com.example;

public class Demo3
{

	public static void main(String[] args)
	{

		Runnable obj1 = ()-> //here we are using lemda expression for reducing the code
		{
			
				for(int i=0;i<=5;i++)
				{
				System.out.println("hi");

				try 
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
				
				
			}

		};
		Runnable obj2 = ()->
		{
			
				for(int i=0;i<=5;i++)
				{
				System.out.println("hello");
				
				try 
				{
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
				
				}
			
			
		};
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
	
		t1.start();
		try
		{
			Thread.sleep(10);  //for delaying sum seconds we are doing this.
		}
		catch(Exception e)
		{}
		
		t2.start();
		
		

	}

}

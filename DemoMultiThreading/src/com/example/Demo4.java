package com.example;


public class Demo4 
{
	public static void main(String args[])
	{
		Thread t1=new Thread(() ->
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
			
		});
		

		Thread t2=new Thread(() -> //we are reducing the code here only
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
		});
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

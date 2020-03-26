//here we are giving the name of the thread in two types
package com.example;

public class Demo6 
{
	public static void main(String args[]) throws Exception
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
			
		},"me hoon 1st thread");
		

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
		},"me hoon 2nd thread");
		
//		t1.setName("me hoon 1st thread");
//		t2.setName("me hoon 2nd thread");
//		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		t1.start();
		try
		{
			Thread.sleep(10);  //for delaying sum seconds we are doing this.
		}
		catch(Exception e)
		{}
		
		t2.start();
		System.out.println(t1.isAlive());//it is giving true bcz thread chl ra hain abhi
		
		
		t1.join();     //joint exception throw krta hain for that we are adding throws
		t2.join();
		
		System.out.println(t1.isAlive());//it is giving false bcz thread dead ho gya hain
		
		System.out.println("bye enjoy vacations saloni :-)....");
	}
	
	


}

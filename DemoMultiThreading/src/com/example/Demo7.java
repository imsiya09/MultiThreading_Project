//here we will see the priority of thread
package com.example;

import java.io.ObjectInputStream.GetField;

public class Demo7 
{
	public static void main(String args[]) throws Exception
	{
		Thread t1=new Thread(() ->
		{
			for(int i=0;i<=5;i++)
			{
			System.out.println("hi" + " "+Thread.currentThread().getPriority());

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
			System.out.println("hello" +" "+ Thread.currentThread().getPriority());
			
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
		
//		t1.setPriority(Thread.MIN_PRIORITY);
//		t2.setPriority(Thread.MAX_PRIORITY);
		
		
//		t1.setPriority(1);
//		t2.setPriority(10);
	    System.out.println("the range of priority goes from 1 to 10 1 means less 10 means most");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
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

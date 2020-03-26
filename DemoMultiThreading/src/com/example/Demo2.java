//****************HERE WE ARE DOING THE SAME CODE BY IMPLEMENTING THE INTERFACE*************//
package com.example;

class Saloni implements Runnable

{
	public void run() 
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
	}

}
class Goyal implements Runnable
{
	public void run() 
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
	}
	
}
public class Demo2 
{
	public static void main(String[] args)
	{

		Runnable obj1=new Saloni();
		Runnable obj2=new Goyal();
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

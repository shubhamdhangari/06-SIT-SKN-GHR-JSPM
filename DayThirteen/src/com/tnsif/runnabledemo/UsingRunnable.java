package com.tnsif.runnabledemo;

public class UsingRunnable implements Runnable{

	
	Thread t;
	int end,start;
	String msg;
	
	
	
	
	
	
	
	
	public UsingRunnable( int end, int start, String msg) {
		super();
		this.t = t;
		this.end = end;
		this.start = start;
		this.msg = msg;
		
		t=new Thread(this, "Child Thread");
		t.start();
	}


	@Override
	public void run() {

		for(int i=end;i>start;i--)
		{
		try {
			Thread.sleep(500);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
			System.out.println(i +msg);

		}
	}
	
	public static void main(String[] args) {
		//lambda expression 
		
		Runnable r2=()->System.out.println("runnable with lambda expression ");
		new Thread(r2).start();
	}

}

package com.MphasisTraining;

public class MulThreads extends Thread {
	
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	  		MulThreads mt = new  MulThreads();
	  		mt.start();
	 	}
	}




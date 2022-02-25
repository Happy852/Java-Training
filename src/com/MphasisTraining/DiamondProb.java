package com.MphasisTraining;

public interface DiamondProb {
	interface First 
	{  
	    default void show() 
	    { 
	        System.out.println("Default DiamondProb"); 
	    } 
	} 
	interface  DiamondProb2
	{  
	    default void show() 
	    { 
	        System.out.println("Default  DiamondProb2"); 
	    } 
	}  
	public class TestClass implements DiamondProb,  DiamondProb2
	{  
	    public void show() 
	    {  
	    	DiamondProb.super.show(); 
	    	 DiamondProb2.super.show(); 
	    } 
	    public static void main(String args[]) 
	    { 
	        TestClass ob = new TestClass(); 
	        ob.show(); 
	    } 
	}

}


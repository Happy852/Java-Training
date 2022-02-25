package com.MphasisTraining;

public class ExpHandling extends Exception {
	String str1;
	ExpHandling (String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			
			throw new ExpHandling ("This is My error Message");
		}
		catch(ExpHandling  exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}


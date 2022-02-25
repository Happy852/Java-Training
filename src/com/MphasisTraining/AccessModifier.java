package com.MphasisTraining;

		public class AccessModifier {

			public static void main(String[] args) {
				System.out.println("Using default access modifier");
				
			}

		}
		 class AccessSpecifier1{
			 public static void main(String[]args) {
				 System.out.println("Default access specifier");
				 AccessModifier ass = new AccessModifier();
				// obj.display();
			 }
			
		}
		 class PriAccessSpecifier
		 {
			 private void display() {
				 System.out.println("using private access modifier");
			 }
		 }
		 

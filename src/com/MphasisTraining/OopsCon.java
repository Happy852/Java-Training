package com.MphasisTraining;

public class OopsCon {
    String name; 
    String breed; 
    int age; 
    String color; 
    public OopsCon(String name, String breed, int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy Breed, Age and Color are " + this.getBreed()+", " + this.getAge()+ ", and "+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	OopsCon scott = new OopsCon("Blacky","BullDog", 4, "black"); 
        System.out.println(scott.toString()); 
    } 
}



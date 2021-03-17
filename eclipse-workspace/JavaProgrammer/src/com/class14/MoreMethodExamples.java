package com.class14;

public class MoreMethodExamples {
	/*
	 * Create a method that does not take any values
	 * and always return String "Hi"
	 */
      
	String print() {
		return "Hi";
	}
	
	/*
	 * create a method that takes a number and return the double
	 * of that number
	 */
	
	double doubleTheValue(double input) {
		return input*2;
	}
	
	/*
	 * create a method that takes boolean as input
	 * if the value is true, I want to print take the umbrella
	 * if the value is false, I want to print please go for a walk
	 */
	
	void isRain(boolean rain) {
		if(rain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
		}
	}
    void method1() {
			for(int i=0; i<5; i++) {
				System.out.println("Batch 9 is great");
			}
    }
    
    double greaterNumber(double num1, double num2) {
    	if(num1>num2) {
    		return num1;
    	}else {
    	   return num2;
    	}
    }
    
    void checkNumber(int num) {
    	if(num%2==0) {
    		System.out.println("Number is even");
    	}else {
    		System.out.println("Number is odd");
    	}
    }
    
    /*
     * write a method that takes an array and returns the sum of the
     * elements that are present in the array 
     */
      
    double returnArraySum(double[] arr) {
    	double sum=0;
    	for(double element:arr) {
    		sum=sum+element;
    	}
    	return sum;
    }
	
    /*
     * write a method that returns true if a string is a mirror of itself
     * otherwise it returns false
     * aba yes
     * bbb yes
     * bba no
     */
    
    boolean isMirror(String str) {
    	String newStr="";
    	for (int i=str.length()-1; i>=0; i--) {
    		System.out.println(i+" "+str.charAt(i));
    		newStr+=str.charAt(i);
    	}
    	System.out.println(newStr);
    	if(str.equals(newStr)) {
    		return true;
    	}else {
    	    return false;
    }
	
	
	
	
	
    }	
	
	
}

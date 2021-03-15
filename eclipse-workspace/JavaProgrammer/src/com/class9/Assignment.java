package com.class9;

public class Assignment {

	public static void main(String[] args) {
		
		String[] cars= {"Tesla","BMW","Audi","Ford","Toyota","Honda"};
		   
		for(int i=0; i<cars.length; i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println();
		System.out.println("---------Another way-----------------");
		
		for (String c:cars) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("-------------------Second Task-------------------------");
		
		String[] animals= {"dog","cat","bird","elephant","snake","lion"};
		
		for(int j=0; j<animals.length; j++) {
			System.out.print(animals[j]+" ");
		}
		System.out.println();
		System.out.println("----------------------Another way------------------------");
		
		for (String an:animals) {
			System.out.print(an+" ");
		}
		System.out.println();
		System.out.println("-------------------Third Task----------------------------");
		
		int[] numbers= {6,7,9,4};
		int sum=2;
	     for(int n:numbers) {
	    	sum+=n; 
	     }
		
		System.out.println(sum);
		

	}

}

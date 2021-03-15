package com.class9;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int r=1; r<=4; r++) {
    	  
    	  for(int c=1; c<=5; c++) {
    		  
    		  System.out.print("* ");
    	  }
    	  
    	  System.out.println();
      }
      
      System.out.println("----------**********-----------------");
      
      for(int s=1; s<=6; s++) {
    	  for(int t=1; t<=10; t++) {
    		  System.out.print("* ");
    	  }
    	  System.out.println();
      }
      
      System.out.println("---------------------654321-----------------------");
      
      for(int col=1; col<=5; col++) {
    	  for(int ra=6; ra>=1; ra--) {
    		  System.out.print(ra+" ");
    	  }
    	  System.out.println();
      }
      System.out.println("--------------111112222------------------");
      
      for(int a=1; a<=5; a++) {
    	  for(int b=1; b<=5; b++) {
    		  System.out.print(a+" ");
    	  }
    	  System.out.println();
      }
      
      System.out.println("---------------Triangle---------------------");
      
      for(int k=1; k<=5; k++) {
    	 for(int e=1; e<=k; e++) {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
      }
	}

}

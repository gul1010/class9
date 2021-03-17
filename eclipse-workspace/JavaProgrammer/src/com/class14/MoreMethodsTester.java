package com.class14;

public class MoreMethodsTester {

	public static void main(String[] args) {
		
  MoreMethodExamples mME= new MoreMethodExamples();
  System.out.println(mME.print());
  
  System.out.println(mME.doubleTheValue(10));
  //System.out.println(mME.isRain(true)); error because
  //it is not returning anything
  mME.isRain(true);
  
  mME.method1();
  System.out.println(mME.greaterNumber(16, 17));
  
  mME.checkNumber(78);
  
  double[] arr = {10, 90, 24, 37};
  System.out.println(mME.returnArraySum(arr));
  
System.out.println(mME.isMirror("aba"));
 System.out.println(mME.isMirror("abcdef")); 
	}

}

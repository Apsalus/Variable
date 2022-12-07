package edu.kh.variable.practice;

public class CastingParctice1 {
	public static void main(String[] agrs) {
		int iNum1 = 10;
	    int iNum2 = 4;
	    
	    float fNum = 3.0f;
	    
	    double dNum = 2.5;
	    
	    char ch = 'A';
	    	
	    System.out.println(iNum1 / iNum2);
	    System.out.println((int)dNum);
	    
	    System.out.println( iNum2 * dNum);
	    System.out.println((double)iNum1);
	    
	    System.out.println((float)iNum1 /iNum2);
	    System.out.println( dNum );
	    
	    System.out.println((int)fNum);
	    System.out.println(iNum1 / (int)fNum);
	    
	    System.out.println(iNum1 / fNum);
	    System.out.println(iNum1 / (double)fNum);
	    
	    System.out.println( "'" + ch + "'"); // 'A'
	    System.out.println( (int)ch ); // 65
	    System.out.println( ch + iNum1 ); // 75
	    System.out.println("'" + (char)(ch + iNum1) + "'") ; // 'K'
	}
}

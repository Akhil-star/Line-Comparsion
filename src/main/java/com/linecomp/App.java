package com.linecomp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	    System.out.println("Welcome to Line Comparsion program");

    	int x1,x2,y1,y2,x3,y3;
		int  l1,l2;
		x1=1; y1=1;
		x2=4;y2=4;
		x3=5;y3=1;
		l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2=(int)Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		System.out.println(l1);
		System.out.println(l2);
		if(l1==l2) {
			System.out.println("Lengths are equal");
		}
		else {
			System.out.println("Lengths are not equal");
		}
    }
}

package org.test;

import java.util.Arrays;

public class Practices {
	
	//duplicate remove
	public static void main(String[] args) {
		int a[]= {1,2,3,5,4,2,4,6,8,7,5};
		Arrays.sort(a);
		int b=a.length;
		int c=0;
		
		for(int i=0;i<b-1;i++) {
			if(a[i]!=a[i+1]) {
				a[c++]=a[i];
			}
		}
		
		a[c++]=a[b-1];
		b=c;
		for(int i=0;i<b;i++) {
			System.out.println(i);
		}
		System.out.println("hello");
	}

}

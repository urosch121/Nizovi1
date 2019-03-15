package kurs;

import java.util.Scanner;

public class MainNiz1 
{

	public static void main(String[] args) 
	{
	//	Scanner in = new Scanner (System.in);
		
		int a [] = new int [100];
		
		a [0] = 2;
		a [1] = 5;
		a [2] = 10;
		a [3] = 54;
		a [4] = 3;
		
		System.out.println(a.length);
		System.out.println(a);
		
//		System.out.print("a : ");
//		for(int i =0; i < 5; i++)
//			System.out.print(a[i] + " ");
//		System.out.println();
		
		int b[];
		b = a;	
		
		b [0] = 666;
		System.out.print("a : ");
		for(int i =0; i < 5; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.print("b : ");
		for(int i =0; i < 5; i++)
			System.out.print(b[i] + " ");
		System.out.println();
		
		System.out.println("************* uvodimo niz C ************");
		int c [] = new int [a.length];
		
		for(int i = 0; i < a.length; i++)
			c[i] = a[i];
		
		c [5] = 999;
		System.out.print("a : ");
		for(int i =0; i < 5; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.print("c : ");
		for(int i =0; i < 6; i++)
			System.out.print(c[i] + " ");
		System.out.println();
		
		System.out.println("************* uvodimo niz D ************");
		
		int d [] = new int [a.length];
		
		d = a;
		d[5] = 111;
		System.out.print("a : ");
		for(int i = 0; i < 6; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		System.out.print("d : ");
		for (int i =0; i < 6; i++)
			System.out.print(d[i] + " ");
		System.out.println();
		
//		System.out.println("******** uvodim niz E **************");
//				
//		int e [] = new int [7];
//		
//		for(int i = 0; i < 7; i++)
//		
//			e[i] = d[i];
//		System.out.print("e : ");
//		for (int i = 0; i < 7; i++)
//			System.out.print(e[i] + " ");
//		System.out.println();
//		System.out.print("d : ");
//		for (int i = 0; i < 7; i++)
//			System.out.print(d[i] + " ");
//		System.out.println();
//		
//		for (int j = 0; j < d.length/2; j++)
//		{
//			int p;
//			p = e[j];
//			e[j] = e[e.length - j];
//			e[e.length - j] = p;
//						
//		}
//		System.out.print("e : ");
//		for (int i = 0; i < 6; i++)
//			System.out.print(e[i] + " ");
//		System.out.println();
//					
	}

}

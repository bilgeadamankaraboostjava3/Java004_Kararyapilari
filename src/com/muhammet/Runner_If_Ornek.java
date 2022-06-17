package com.muhammet;

public class Runner_If_Ornek {

	public static void main(String[] args) {

		// * * * *
		// * * * *
		// * * * *
		// * * * *
		// n pozitif bir sayý olsun
		// * * * * * *
		// *         *
		// *         *
		// *         *
		// * * * * * *
		
		String karakter = "*";
		int n=7;
		for(int i=1;i<=(n*n);i++) {
			if(i%n==0 || i%n==1 || i<=n || i>n*(n-1))			
				System.out.print(karakter+" ");
			else
				System.out.print("  ");
			if(i%n==0)
				System.out.println();
		}

	}

}

package com.muhammet;

public class Runner_Ternary {

	public static void main(String[] args) {
		// if --> Ternary
		/**
		 * durum-(boolean) ? i�lem : i�lem ;
		 * 1-2 adet i� i�e mant�kl� olabilir. fazlas� kodun okunurlu�una ve d�zenine zarar verebilir.
		 */
		int yas = 18;
		String uygunluk;
		if(yas>=18) {
			uygunluk = "UYGUNDUR";			
		}else {
			uygunluk = "UYGUN DE��L";
		}
		System.out.println(uygunluk);
		yas = 10;
		uygunluk = yas >= 18 ? "UYGUN" : "DE��L" ;

		/**
		 * B�yle kodlama yapmayal�m.
		 */
		uygunluk = yas >=10 ? "1. aral�k" :
				   yas >=20 ? "2. aral�k" :
				   yas >=30 ? "3. aral�k" : "son aral�k"; 	   
		
	}

}

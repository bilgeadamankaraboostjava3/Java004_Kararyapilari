package com.muhammet;

public class Runner_Ternary {

	public static void main(String[] args) {
		// if --> Ternary
		/**
		 * durum-(boolean) ? iþlem : iþlem ;
		 * 1-2 adet iç içe mantýklý olabilir. fazlasý kodun okunurluðuna ve düzenine zarar verebilir.
		 */
		int yas = 18;
		String uygunluk;
		if(yas>=18) {
			uygunluk = "UYGUNDUR";			
		}else {
			uygunluk = "UYGUN DEÐÝL";
		}
		System.out.println(uygunluk);
		yas = 10;
		uygunluk = yas >= 18 ? "UYGUN" : "DEÐÝL" ;

		/**
		 * Böyle kodlama yapmayalým.
		 */
		uygunluk = yas >=10 ? "1. aralýk" :
				   yas >=20 ? "2. aralýk" :
				   yas >=30 ? "3. aralýk" : "son aralýk"; 	   
		
	}

}

package com.muhammet;

public class Runner {

	public static void main(String[] args) {

		// if.... else if.... else
		// Login i�lemi
		// if
		int sayi = -20;
		if(sayi<2) {
			System.out.println("20 2 den b�y�kt�r");
		}
		// if...else
		String ka="admin", sf="123";
		if(ka=="admin" && sf=="1234") {
			System.out.println("Ba�ar� ile giri� yap�ld�");
		}else {
			System.out.println("Kullan�c� ad� ya da �ifre hatal�d�r.");
		}
		// if..elseif..else
		// ��rencinin not ortalamas�n�  harf olarak ifade edelim.
		int ort = 44;
		if(ort<10) System.out.println("FF");
		else if(ort<20) {System.out.println("FD"); System.out.println();}
		else if(ort<30) System.out.println("DD");
		else if(ort<40) System.out.println("DC");
		else if(ort<50) System.out.println("CC");
		else if(ort<60) System.out.println("CB");
		else if(ort<70) System.out.println("BB");
		else if(ort<80) System.out.println("BA");
		else System.out.println("AA");
		
			
		
	}

}

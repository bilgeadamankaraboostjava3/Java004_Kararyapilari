package com.muhammet;

import java.util.Scanner;

public class Runner_SwitchCase {

	public static void main(String[] args) {
		 
		/*
		switch(durum) {		
		case 1.durum: iþlem ; break;
		case 2.durum: iþlem ; break;
		default: iþlem 		
		}
		*/
		System.out.println("*************************");
		System.out.println("********ÝÞLEMLER********");
		System.out.println("*************************");
		System.out.println();
		System.out.println("1. TOplama");
		System.out.println("2. Çýkartma");
		System.out.println("3. Çarpma");
		System.out.println("4. Bölme");
		System.out.println("5. Mod");
		System.out.println("0. ÇIKIÞ");		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Seçiniz....: ");
		int secim = scanner.nextInt();
		if(secim==1) System.out.println("TOplama");
		else if(secim==2) System.out.println("çýkartma");
		else if(secim==3) System.out.println("çarpma");
		else if(secim==4) System.out.println("bölme");
		else if(secim==5) System.out.println("mod");
		else System.out.println("ÇIKIÞ");
		/**
		 * Key -> String, int(sayýlsal deðerler v.s.), enum (öðrenilecek daha sonra)
		 */
		switch (secim) {
		case 1: System.out.println("TOplama"); break;
		case 2: System.out.println("çýkartma"); break;
		case 3: 
			System.out.println("çarpma"); 
			System.out.println("yeni bir satýr çalýþsýn");
			break;
		case 4: System.out.println("bölme"); break;
		case 5: System.out.println("mod"); break;
		default:  System.out.println("ÇIKIÞ"); break;
		}
		/**
				 switch (secim) {
				case 1: System.out.println("TOplama"); break;
				case 2: System.out.println("çýkartma"); break;
				case 3: System.out.println("çarpma"); 
				case 4: System.out.println("bölme"); break;
				case 5: System.out.println("mod"); break;
				default:  System.out.println("ÇIKIÞ"); break;
				}
		 */
		// MEVSÝMLER
		int ay = 6; // haziran; // javaSE 14+
		switch (ay) {
		case 12 ,1 , 2: System.out.println("KIÞ");break;
		case 3 ,4 , 5: System.out.println("ÝLK BAHAR");break;
		case 6 ,7 , 8: System.out.println("YAZ");break;
		case 9 ,10 , 11: System.out.println("SON BAHAR");break;
		default: System.out.println("GEÇERSÝZ GÝRÝÞ");
		
		}
		
		String Mevsim = switch (ay) {
		case 12 ,1 , 2 ->{ 
			System.out.println("");
			yield "KIÞ"; }
		case 3 ,4 , 5 -> "ÝLK BAHAR";
		case 6 ,7 , 8 -> "YAZ";
		case 9 ,10 , 11 -> "SON BAHAR";
		default ->"GEÇERSÝZ GÝRÝÞ";		
		};
		
		int sayi = 45;
	}

}

package com.muhammet;

import java.util.Scanner;

public class Runner_SwitchCase {

	public static void main(String[] args) {
		 
		/*
		switch(durum) {		
		case 1.durum: i�lem ; break;
		case 2.durum: i�lem ; break;
		default: i�lem 		
		}
		*/
		System.out.println("*************************");
		System.out.println("********��LEMLER********");
		System.out.println("*************************");
		System.out.println();
		System.out.println("1. TOplama");
		System.out.println("2. ��kartma");
		System.out.println("3. �arpma");
		System.out.println("4. B�lme");
		System.out.println("5. Mod");
		System.out.println("0. �IKI�");		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Se�iniz....: ");
		int secim = scanner.nextInt();
		if(secim==1) System.out.println("TOplama");
		else if(secim==2) System.out.println("��kartma");
		else if(secim==3) System.out.println("�arpma");
		else if(secim==4) System.out.println("b�lme");
		else if(secim==5) System.out.println("mod");
		else System.out.println("�IKI�");
		/**
		 * Key -> String, int(say�lsal de�erler v.s.), enum (��renilecek daha sonra)
		 */
		switch (secim) {
		case 1: System.out.println("TOplama"); break;
		case 2: System.out.println("��kartma"); break;
		case 3: 
			System.out.println("�arpma"); 
			System.out.println("yeni bir sat�r �al��s�n");
			break;
		case 4: System.out.println("b�lme"); break;
		case 5: System.out.println("mod"); break;
		default:  System.out.println("�IKI�"); break;
		}
		/**
				 switch (secim) {
				case 1: System.out.println("TOplama"); break;
				case 2: System.out.println("��kartma"); break;
				case 3: System.out.println("�arpma"); 
				case 4: System.out.println("b�lme"); break;
				case 5: System.out.println("mod"); break;
				default:  System.out.println("�IKI�"); break;
				}
		 */
		// MEVS�MLER
		int ay = 6; // haziran; // javaSE 14+
		switch (ay) {
		case 12 ,1 , 2: System.out.println("KI�");break;
		case 3 ,4 , 5: System.out.println("�LK BAHAR");break;
		case 6 ,7 , 8: System.out.println("YAZ");break;
		case 9 ,10 , 11: System.out.println("SON BAHAR");break;
		default: System.out.println("GE�ERS�Z G�R��");
		
		}
		
		String Mevsim = switch (ay) {
		case 12 ,1 , 2 ->{ 
			System.out.println("");
			yield "KI�"; }
		case 3 ,4 , 5 -> "�LK BAHAR";
		case 6 ,7 , 8 -> "YAZ";
		case 9 ,10 , 11 -> "SON BAHAR";
		default ->"GE�ERS�Z G�R��";		
		};
		
		int sayi = 45;
	}

}

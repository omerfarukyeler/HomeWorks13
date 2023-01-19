package Ders13;

import java.util.Scanner;

public class uncheck {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir sayi  giriniz ");	
		String girdi = scan.nextLine();
		kontrol(102);
	
	
	}
	


	public static void kontrol(Integer i) {
		
		if (i <100 & i>0){
			
			System.out.println("sayinin 0 ile 100 arasindadır.");
		}
		
		else {
			throw new IllegalArgumentException ("sayi aralik disinda");
		}
	}




	}



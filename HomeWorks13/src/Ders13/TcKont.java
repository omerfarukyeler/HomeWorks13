package Ders13;

import java.util.Scanner;

public class TcKont {

	public static void main(String[] args) {
		
		TcKont test = new TcKont();
		
		test.tcKont();
	}

	public void tcKont() throws IllegalArgumentException {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Lutfen 11 haneli Tc kimlik no giriniz :");
		
		String tc = scan.nextLine();
		
		
		
		
			try {
				
				if(tc.length() !=11) {
					
				throw new IllegalArgumentException("Girilen tc 11 haneli degildir");//Metotlara geçersiz argüman atamalarında kullanılır .
				}
				
				try {
					 if(Integer.valueOf(tc.substring(10,11)) %2!=0) {                 //bir tam sayı değerine çevirip son 2 rakamı kullandım 
					 throw new IllegalArgumentException("Girilen son basamak cift olmalidir...");	 
						 
						 
					 }
						
				}
					catch(Exception e) {
						
					System.out.println("Girilen Tc son hanesi tek sayidir!!!!!!");//exception hepsinin atası olduğu için yazdım.
					
					e.printStackTrace();
		
					}
			}
			
			catch(Exception e) {
				System.out.println("Girilen tc 11 haneli degildir...");
				
				e.printStackTrace();
			}
 				
				
			finally {
					
					System.out.println("Girilen Tc "+tc);
					
					scan.close();
					
				}
				
			
	
	}
			}
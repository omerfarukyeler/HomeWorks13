package Ders13;

public class Question2 {

	public static void main(String[] args) throws IllegalArgumentException  {
		
				
		try {
			kontrol(99);
			
		}catch (Exception e) {
			
			System.out.println("Bu aralik yer almiyor");
			e.printStackTrace();
			
			
				}
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



	
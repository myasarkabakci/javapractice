package antraman;

public class AltAltaYıldızYazdırma {

	public static void main(String[] args) {
		// Soru4: Aşağıdaki görüntüyü konsol ekranına yazdıran algoritmayı tasarlayınız.
		//*
		//**
		//*** gibi
		
		int uzunluk=10;
		
		for (int i =0; i <uzunluk; i++) {
		
			System.out.print("");
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}

}
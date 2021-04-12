package antraman;

public class AltAltaYýldýzYazdýrma {

	public static void main(String[] args) {
		// Soru4: Aþaðýdaki görüntüyü konsol ekranýna yazdýran algoritmayý tasarlayýnýz.
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
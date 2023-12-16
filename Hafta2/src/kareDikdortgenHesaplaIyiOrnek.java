import java.util.Scanner;

public class kareDikdortgenHesaplaIyiOrnek {

	public static void main(String[] args) {
		Scanner klavyeilegirilendata= new Scanner(System.in);
		System.out.println("Birinci Kenarı Giriniz: ");
		int birincikenar = klavyeilegirilendata.nextInt();
		System.out.println("İkinci kenarı da gir");
		int ikincikenar = klavyeilegirilendata.nextInt();
		
		
		
		if(birincikenar==ikincikenar) {
			
			
			System.out.println("Sen bir Karesin");
			System.out.println("Çevren: "+birincikenar*4);
			System.out.println("Alanın: "+(birincikenar*birincikenar));
		}else {
			
			
			System.out.println("Sen bir dikdortgensin");
			System.out.println("Çevren: "+(birincikenar+ikincikenar)*2);
			System.out.println("Alanın: "+(birincikenar*ikincikenar));
		}
		
		

	}

}




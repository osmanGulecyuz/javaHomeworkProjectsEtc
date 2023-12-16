import java.util.Scanner;

public class fonksiyon {

	public static void menugor() {
		System.out.println("1-Listele:\n" + "2-İsim Ara:\n" + "3-En Yuksek Başarı Notu:\n"
				+ "4-En Yukse Başarı Notu Alternatif Yontem İle Arama\n" + "5-Kızlardan En Düşük Vize Notu Alan:\n" + "6-Erkeklerden En Düşük Başarı Notu:\n"
				+ "7-Kızların Final Ortalaması:\n" + "8-Kızlarda En Düşük Başarı Notu");

	}

	public static void listele(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		for (int i = 0; i < ogrenciAdi.length; i++) {
			System.out.println("Öğrenci Adi: " + ogrenciAdi[i]);
			System.out.println("Öğrenci Vizesi: " + vN[i]);
			System.out.println("Öğrenci Finali: " + fN[i]);
			System.out.println("Öğrenci Cinsiyeti: " + cinsiyet[i]);
			System.out.println("Öğrenci Başarı Notu: " + bN[i]);
			System.out.println("-------------------------------------");
		}

	}

	public static void isimAra(Scanner scanner, String[] ogrenciAdi,int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		System.out.println("Aranacak Öğrenci Adını Giriniz:");
		String arananAd = scanner.next();
		for (int i = 0; i < ogrenciAdi.length; i++) {
			if (arananAd.equalsIgnoreCase(ogrenciAdi[i])) {
				System.out.println("Öğrenci Vizesi: " + vN[i]);
				System.out.println("Öğrenci Finali: " + fN[i]);
				System.out.println("Öğrenci Cinsiyeti: " + cinsiyet[i]);
				System.out.println("Öğrenci Başarı Notu: " + bN[i]);
				System.out.println("-------------------------------------");
			}
		}

	}

	public static void enyuksekbasari(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		double enyb=Integer.MIN_VALUE;
		String ogrenc="";
		int vNgecici=0;
		int fNgecici=0;
		String cinsiyetgecici="";
		for (int i=0; i<ogrenciAdi.length; i++) {
			
			if(bN[i]>enyb) {
				enyb=bN[i];
				ogrenc=ogrenciAdi[i];
				vNgecici=vN[i];
				fNgecici=vN[i];	
				cinsiyetgecici=cinsiyet[i];
				
			
			}

				
		}System.out.println(enyb);
		System.out.println(ogrenc);
		System.out.println(vNgecici);
		System.out.println(fNgecici);
		System.out.println(cinsiyetgecici);
		System.out.println("-------------------------------------");
		
		
		
		
		
	}

	public static void enyuksekbasarialternatifilegosterme(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet,
			double[] bN) {
		double enyb=Integer.MIN_VALUE;
		for (int i=0; i<ogrenciAdi.length; i++) {
			if (bN[i]>enyb) {
				enyb=bN[i];
				System.out.println("En Yuksek Başarı Notu: "+enyb);
				
				for (int j=0; j<ogrenciAdi.length; j++) {
					if(bN[j]==enyb) {
						System.out.println("Ogrenci Adi "+ogrenciAdi[i]);
						System.out.println("Ogrenci Vizesi "+vN[i]);
						System.out.println("Ogrenci Finali "+fN[i]);
						System.out.println("Ogrenci Cinsiyeti "+cinsiyet[i]);
						System.out.println("-------------------------------------");
						
					}
				}
				
			}
		}
		
		
	}

	public static void kizlardanendusukvize(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		int endusukvize=Integer.MAX_VALUE;
		for (int i=0; i<ogrenciAdi.length; i++) {
			if (cinsiyet[i].equalsIgnoreCase("k")) {
				if(vN[i]<endusukvize) {
					endusukvize=vN[i];
					System.out.println("Kızlardan En Düşük Vize Notu: "+endusukvize);
					System.out.println("-------------------------------------");
					
				}
			}
		}
		
	}

	public static double erkeklerdeendusukBN(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		double endusbasar=Integer.MAX_VALUE;
		for (int i=0; i<ogrenciAdi.length; i++) {
			if(cinsiyet[i].equalsIgnoreCase("e")) {
				if(bN[i]<endusbasar) {
					endusbasar=bN[i];
					
				}
			}
		}
		System.out.println(endusbasar);
		return (endusbasar);
		
	}

	public static int kizlarfinalort(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		int kizlarfinaltoplami=0;
		int sayac=0;
		int ortalama=0;
		for (int i=0; i<ogrenciAdi.length; i++) {
			if(cinsiyet[i].equalsIgnoreCase("k")) {
				kizlarfinaltoplami+=fN[i];
				sayac+=1;
				ortalama =(kizlarfinaltoplami/sayac);
				
				
				
			}
			
		}System.out.println("Kızların Final Ortalaması:"+ortalama);
		ortalama =(kizlarfinaltoplami/sayac);
		return ortalama;
		
		
		
	}

	public static void kizlardaendusukBN(String[] ogrenciAdi, int[] vN, int[] fN, String[] cinsiyet, double[] bN) {
		double endusbasar=Integer.MAX_VALUE;
		for (int i=0; i<ogrenciAdi.length; i++) {
			if(cinsiyet[i].equalsIgnoreCase("k")) {
				if(bN[i]<endusbasar) {
					endusbasar=bN[i];

				
				
			}
		
	}
			
			
		

}System.out.println(endusbasar);
		
	
	}}

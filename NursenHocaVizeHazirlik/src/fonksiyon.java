
public class fonksiyon {

	public static void menugor() {
		System.out.println("1-Listele: \n"
				+ "2-Kayit Ara: \n"
				+ "3-En Yuksek Vize Notu: \n"
				+ "4-Erkek Ogrenci Vize Ortalama: \n"
				+ "5-En Düşük Final Notu: \n"
				+ "6-Aranacak Kişinin Başarı Notunu Getir: ");
		
	}

	public static void listele(String[] ad, int[] vize, int[] finalN, String[] cinsiyet) {
		for (int i=0; i<ad.length; i++) {
			System.out.println(i+1+". kişinin adı "+ad[i]);
			System.out.println(i+1+". kişinin vize notu: "+vize[i]);
			System.out.println(i+1+". kişinin final notu: "+finalN[i]);
			System.out.println(i+1+". kişinin cinsiyeti: "+cinsiyet[i]);
			System.out.println("----------------------------------------");
		}
		
	}

	public static void aramaislemi(String arananad, String[] ad, int[] vize, int[] finalN, String[] cinsiyet) {
		for (int i=0; i<ad.length; i++) {
			if (arananad.equalsIgnoreCase(ad[i])) {
				System.out.println("Vize Notu"+vize[i]);
				System.out.println("Vize Notu"+finalN[i]);
				System.out.println("Vize Notu"+cinsiyet[i]);
				System.out.println("----------------------------------------");
			}
		}
		
	}

	public static void enyuksekvize(String[] ad, int[] vize, String[] cinsiyet) {
		int enyv=Integer.MIN_VALUE;
		for (int i=0; i<ad.length; i++) {
			if (vize[i]>enyv)
				enyv=vize[i];
		}System.out.println("En Yuksek Vize "+enyv);
		
		for (int i=0; i<ad.length; i++) {
			if(vize[i]==enyv) {
				System.out.println(ad[i]);
				System.out.println(cinsiyet[i]);
				System.out.println("----------------------------------------");
			}
		}
		
	}

	public static void endusukfinal(String[] ad, int[] vize, int[] finalN, String[] cinsiyet) {
		int endf=Integer.MAX_VALUE;
		for (int i=0; i<ad.length;i++) {
			if (finalN[i]<endf)
			endf=finalN[i];
		}System.out.println("En Düşük Final "+endf);
		
		for (int i=0; i<ad.length; i++) {
			if (finalN[i]==endf) {
				System.out.println(ad[i]);
				System.out.println(cinsiyet[i]);
				System.out.println("----------------------------------------");
				
			}
		}
	}

	public static void erkekogrencinotortalama(String[] ad, String[] cinsiyet,int[] vize, int[] finalN) {
		int toplam=0;
		int sayac=0;
		
		for (int i=0; i<ad.length; i++) {
			if (cinsiyet[i].equalsIgnoreCase("E")) {
				toplam+=vize[i];
				sayac+=1;
			}
		}System.out.println(toplam/sayac);
		System.out.println("----------------------------------------");
		
		
	}

	
		
	

public static void aramaislemi2(String arananad2, String[] ad, int[] vize, int[] finalN, String[] cinsiyet) {
	for (int i=0; i<ad.length; i++) {
		if (arananad2.equalsIgnoreCase(ad[i])) {
			System.out.println("Başarı Notu: "+(vize[i]*0.4+finalN[i]*0.6));
			
			System.out.println("----------------------------------------");
		}
	}
	
}}

	

		
		
	

		


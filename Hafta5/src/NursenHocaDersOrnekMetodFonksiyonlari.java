
public class NursenHocaDersOrnekMetodFonksiyonlari {

	public static void MenuGor() {
		System.out.println("1-Listeleme\n2-İsim Arama\n3-Okul Durumu\n4-Yaş Ortalaması\n5-Çıkış");
		
	}

	public static void Listeleme(String[] ad, int[] yas, String[] cinsiyet) {
		for (int i=0; i<cinsiyet.length; i++) {
			System.out.println("Ad: "+ad[i]);
			System.out.println("Yaş: "+yas[i]);
			System.out.println("Cinsiyet: "+cinsiyet[i]);
			System.out.println("--------------------------");
			
		}
		
	}

	public static void Aramafonksiyonu(String arananAd, String[] ad, int[] yas, String[] cinsiyet) {
		boolean kontrol=true;
		for (int i=0; i<yas.length; i++) {
			if (arananAd.equalsIgnoreCase(ad[i])) {
				System.out.println("Ad: "+ad[i]);
				System.out.println("Yaş: "+yas[i]);
				System.out.println("Cinsiyet: "+cinsiyet[i]);
				kontrol=false;
			}
				if (kontrol) System.out.println("Aranan bulunamadı");
		}
		
	}

	public static void okulDurumu(String[] ad, int[] yas) {
		
		String okuldurum="";
		for (int i=0; i<ad.length; i++) {
			if (yas[i]<5) okuldurum="Çocuk evde hala";
			else if (yas[i]<7) okuldurum="Anaokulu";
			else if (yas[i]<11) okuldurum="ilkokulda";
			else if (yas[i]<15)okuldurum="ortaokul";
			else if (yas[i]<19) okuldurum="lisede";
			else if (yas[i]<25) okuldurum="üniversitede";
			else okuldurum="Hala üniversitede ama çalışıyor da olabilir. ";
			System.out.println(ad[i]+" :"+okuldurum);
			
			
		}
		
	}

	public static int ErkekYasOrt(String[] cinsiyet, int[] yas) {
		int toplamyas=0;
		int erkekkisiadedi=0;
		
		for (int i=0; i<yas.length;i++) {
			if (cinsiyet[i].equalsIgnoreCase("erkek")){
				toplamyas+=yas[i];
				erkekkisiadedi+=1;
			}
		}
		
		
		
		return toplamyas/erkekkisiadedi;
	}

}

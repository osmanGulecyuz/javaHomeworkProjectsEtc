
public class Fonksiyonlar {

	public static void menugoruntuleme() {
		System.out.println("1-Listele\n"
				+ "2-İsim Arama\n"
				+ "3-Yaş ve Maaş Ortalaması\n"
				+ "4-En Büyük Yaş ve Bilgileri\n"
				+ "5-En Küçük Yaş ve Bilgileri\n"
				+ "6-Erkeklerin Yaş Ortalaması\n"
				+ "7-Kadınların Yaş Ortalaması\n"
				+ "8-Kadınların Maaş Ortalaması\n"
				+ "9-Çıkış");
		System.out.println("---------------------------------------------------------------");
	
	}

	public static void Listeleme(String[] ad, byte[] yas, String[] cinsiyet, int[] maas) {
		for (int i=0; i<ad.length; i++) {
			System.out.println("Ad: "+ad[i]);
			System.out.println("Yas: "+yas[i]);
			System.out.println("Cinsiyet: "+cinsiyet[i]);
			System.out.println("Maas: "+maas[i]);
			System.out.println("---------------------------------------------------------------");
		}
		
	}

	public static void adarama(String azoncegirilenisim, String[] ad, byte[] yas, String[] cinsiyet, int[] maas) {
		for (int i=0; i<ad.length; i++) {
			if(azoncegirilenisim.equalsIgnoreCase(ad[i])) {
				System.out.println("Aranan Kişinin ismi: "+ad[i]);
				System.out.println("Aranan Kişinin Yaşı: "+yas[i]);
				System.out.println("Aranan Kişinin Cinsiyeti: "+ad[i]);
				System.out.println("Aranan Kişinin Maaşı: "+maas[i]);
				System.out.println("---------------------------------------------------------------");
			}
		}
		
	}

	public static void yasvemaasort(byte[] yas, int[] maas) {
		int toplamyas=0;
		for (int i=0; i<yas.length;i++) {
			toplamyas+=yas[i];
		}System.out.println(("Yaş ortalaması: "+(toplamyas/yas.length)));
		
		{
			int toplammaas=0;
			for (int i=0; i<yas.length;i++) {
				toplammaas+=maas[i];
			}System.out.println(("Maaş ortalaması: "+(toplammaas/maas.length)));
		
		System.out.println("---------------------------------------------------------------");
		
	}}

	public static void enbuyukyasvebilgileri(byte[] yas,String[] ad,String[] cinsiyet, int[] maas) {
		int enbyas=yas[0];
		for (int i=1; i<yas.length; i++) {
			if (yas[i]>enbyas)
				enbyas=yas[i];
			
		}System.out.println("En büyük yaş: "+enbyas);
		
		for (int i=0; i<yas.length;i++) {
			if (yas[i]==enbyas) {
				System.out.println("Adı: " +ad[i]);
				System.out.println("Cinsiyeti: "+cinsiyet[i]);
				System.out.println("Maaşı: "+maas[i]);
			}
		
		}
		
		System.out.println("---------------------------------------------------------------");
	}

	public static void enkucukyasvebilgiler(String[] ad, byte[] yas, String[] cinsiyet, int[] maas) {
		int enkyas=yas[0];
		for (int i=1; i<yas.length;i++) {
			if(yas[i]<enkyas)
				enkyas=yas[i];
				
		}System.out.println("En küçük yaş: "+enkyas);

		for (int i=0; i<yas.length;i++) {
			if (yas[i]==enkyas) {
				System.out.println("Adı: "+ad[i]);
				System.out.println("Cinsiyeti: "+cinsiyet[i]);
				System.out.println("Maas: "+maas[i]);
				System.out.println("---------------------------------------------------------------");
				
			}
		}
	}

	public static int erkekyasortalama(String[] cinsiyet, byte[] yas) {
		int toplamyas=0, sayac=0;
		
		for (int i=0; i<yas.length;i++) {
			if(cinsiyet[i].equalsIgnoreCase("Erkek")) {
				toplamyas+=yas[i];
				sayac+=1;
			}
			
				
		}
		
		return toplamyas/sayac;
	}

	public static int kadinyasortalama(String[] cinsiyet, byte[] yas) {
		int toplamkadinyas=0, toplamkadin=0;
		
		for (int i=0; i<yas.length; i++) {
			if(cinsiyet[i].equalsIgnoreCase("Kadın")) {
				toplamkadinyas=toplamkadinyas+yas[i];
				toplamkadin++;
			}
		}
		
		
		return toplamkadinyas/toplamkadin;
	}

	public static int kadinmaasortalam(String[] cinsiyet, int[] maas) {
		int kadinmaastoplam=0;
		int kadinadet=0;
		for (int i=0; i<cinsiyet.length;i++) {
			if(cinsiyet[i].equalsIgnoreCase("Kadın")){
				kadinmaastoplam+=maas[i];
				kadinadet+=1;
			}
		}
		return kadinmaastoplam/kadinadet;
	}

	

	
		
	}

			
		
		
	

		
	



		
		
	
	
	



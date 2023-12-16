import java.util.Scanner;

public class FonkKitaplik {

	public static void kitapEkle(Scanner girisyap, String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi,
			int[] basimYili, int kitapSayisi) {
		
		girisyap.nextLine();
		System.out.println("Kitap Adi Gir: ");
		kitapAdi[kitapSayisi]=girisyap.nextLine();
		
		System.out.println("Yazar Adi Gir: ");
		yazarAdi[kitapSayisi]=girisyap.nextLine();
		
		System.out.println("Sayfa Sayısı Gir: ");
		sayfaSayisi[kitapSayisi]=girisyap.nextInt();
		
		System.out.println("Basım Yılı Gir: ");
		basimYili[kitapSayisi]=girisyap.nextInt();
		
		
		
	}

	/*public static void listeleme(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili)*/ {
		
		
	}

	public static void listeleme(String kitapAdi, String yazarAdi, int sayfaSayisi, int basimYili) {
		System.out.println("Kişi adı: "+kitapAdi);
		System.out.println("Yazar adı: "+yazarAdi);
		System.out.println("Sayfa adedi: "+sayfaSayisi);
		System.out.println("Basım Yılı: "+basimYili);
		System.out.println("--------------------------");
		
	}

	/*public static void yazarArama(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili,
			String arananYazar) {
		for (int i =0; i<kitapAdi.length; i++) {
			if(arananYazar.equalsIgnoreCase(yazarAdi[i])) {
				listeleme(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
			}
				
				
		}
		
	}*/
	
	public static void yazarArama(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili,
			String arananYazar) {
		for (int i =0; i<kitapAdi.length; i++) {
			if(yazarAdi[i].equalsIgnoreCase(arananYazar)) {
				listeleme(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
			}
				
				
		}
		
	}
	
	
	
	

	public static void enSon(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili) {
		
		if(kitapAdi.length>0) {
			int enbBasimYili=basimYili[0];
			for (int i=0; i<basimYili.length; i++) {
				if (basimYili[i]>enbBasimYili)
					enbBasimYili=basimYili[i];
			}System.out.println("En Son Gelen Kitap Tarihi: "+enbBasimYili);
			
			for (int i=0; i<basimYili.length;i++) {
				if (basimYili[i]==enbBasimYili) {
					System.out.println("Kitabın Adi: "+kitapAdi[i]);
					System.out.println("Kitabın Sayfa Sayısı: "+sayfaSayisi[i]);
					System.out.println("Kitabın Yazarı: "+yazarAdi[i]);
					System.out.println("--------------------------");
				}
			}
					
		}else {
			System.out.println("Zaten Kitap Girilmemiş: ");
		}
		
		
	}

	public static void toplamKitapAdedi(int kitapAdetUzunluk) {
		
		System.out.println(kitapAdetUzunluk);
		System.out.println("--------------------------");
		
	}

	public static void ortalamaSayfaSayisi(int[] sayfaSayisi) {
		int sayfa=0;
		int sayac=0;
		for (int i=0; i<sayfaSayisi.length; i++) {
			sayfa+=sayfaSayisi[i];
			sayac+=1;
			
			
			
			
		}System.out.println("Ortalama Sayfa Sayisi: "+(sayfa/sayac));
		System.out.println("--------------------------");
		
	}

	public static void basimYiliOrtalamasi(int[] basimYili) {
		int yil=0;
		int sayac=0;
		for (int i=0; i<basimYili.length; i++) {
			yil+=basimYili[i];
			sayac+=1;
		}System.out.println("Ortalama Basım Yılı: "+(yil/sayac));
		System.out.println("--------------------------");
		
		
	}

	public static void arananYazarinEnbSayfaliKitabi(String[] kitapAdi, String[] yazarAdi, int[] basimYili, int[] sayfaSayisi, String aY) {
		int enbSayfaSayisi=	Integer.MIN_VALUE;		/*bu da olur sayfaSayisi[0];*/
		for (int i=0; i<kitapAdi.length; i++) {
			if (yazarAdi[i].equalsIgnoreCase(aY)) {
				if(sayfaSayisi[i]>enbSayfaSayisi)
					enbSayfaSayisi=sayfaSayisi[i];
					
			}
		}
		System.out.println("Bu yazarın en çok sayfalı kitabı "+enbSayfaSayisi);
		System.out.println("--------------------------");
	}

		
	

		
	}

		
		
	
	
	

	
		
	


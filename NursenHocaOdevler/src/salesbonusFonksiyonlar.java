
/* bu ödevde 7. ve 8. maddeler ne yazık ki saatler süren denemelere rağmen yapılamadı*/

public class salesbonusFonksiyonlar {

	public static void menugoruntuleme() {
		System.out.println("1-Tüm Satışçı Bilgileri Listesi\n"
				+ "2-Satışçı Bonusları (Tümü)\n"
				+ "3-Satışçı Arama\n"
				+ "4-En Çok Satan Ürün, Geliri, Lokasyonu, Satan Mümessil\n"
				+ "5-Satılan Parfüm Adedi ve Tutarı\n"
				+ "6-Satılan Kozmetik Adedi ve Tutarı\n"
				+ "7-En yüksek Bonus Sahibi ve Bilgileri\n"
				+ "8-En büşük gelirli Lokasyon\n"
				+ "9-Çıkış");
		System.out.println("------------------------------------------------------------------------");
		
	}

	public static void tumBilgiler(String[] ad, String[] lokasyon, String[] urun, int[] adet) {
		
		for (int i=0; i<ad.length;i++) {
			System.out.println(i+1+" numaralı kişinin adı: "+ad[i]);
			System.out.println(i+1+" numaralı kişinin lokasyonu: "+lokasyon[i]);
			System.out.println(i+1+" numaralı kişinin sattığı ürün adedi: "+adet[i]);
			System.out.println(i+1+" numaralı kişinin sattığı ürün grubu: "+urun[i]);
			System.out.println("------------------------------------------------------------------------");
		}
		
	}

	public static void tumBonuslar(String[] ad, String[] lokasyon, String[] urun, int[] adet) {
		int toplamparfumbonus=0;
		int toplamkozmetikbonus=0;

		
		
		for (int i=0; i<ad.length;i++) {
			if (urun[i].equalsIgnoreCase("Parfum")) {
				toplamparfumbonus+=((adet[i]*500)*0.1);
			} else if(urun[i].equalsIgnoreCase("Kozmetik")) {
				toplamkozmetikbonus+=((adet[i]*400)*0.1);
				
			}
			
		}System.out.println("Toplam Parfum Bonusu: "+(toplamparfumbonus>150000? toplamparfumbonus*1.5: toplamparfumbonus));
		System.out.println("Toplam Kozmetik Bonusu: "+(toplamkozmetikbonus>100000? toplamkozmetikbonus*1.2: toplamkozmetikbonus));
		System.out.println("------------------------------------------------------------------------");	
	}

	public static void adarama(String girilenAd, String[] urun, int[] adet, String[] ad, String[] lokasyon) {
		
		for (int i =0; i<ad.length; i++) {
			if(girilenAd.equalsIgnoreCase(ad[i])) {
				System.out.println("Aranan Kişinin Adı: "+ad[i]);
				System.out.println("Aranan Kişinin Sattığı Ürün: "+urun[i]);
				System.out.println("Aranan Kişinin Lokasyonu: "+lokasyon[i]);
				System.out.println("Aranan Kişinin Sattığı Ürün Adedi: "+adet[i]);
				System.out.println("------------------------------------------------------------------------");
			}
		}
		
	}

	public static void encoksatanurunvebilgileri(String[] ad, String[] lokasyon, String[] urun, int[] adet) {
		
		
		int encoksatanurun=adet[0];
		for (int i=1; i<adet.length;i++) {
			if (adet[i]>encoksatanurun)
			encoksatanurun=adet[i];
		}System.out.println("En çok satan ürün adedi: "+encoksatanurun);
		
		for (int i=0; i<adet.length;i++) {
			if (adet[i]==encoksatanurun) {
				System.out.println("Ürün adı: "+urun[i]);
				System.out.println("Satıcısı: "+ad[i]);
				
				int adetfiyati;
				if (urun[i].equalsIgnoreCase("Parfum")) {
					adetfiyati=500;
				}else adetfiyati=400;
				{
				
				}
				
				int toplamgelir=adet[i]*adetfiyati;
				System.out.println("Satıldığı lokasyon: "+lokasyon[i]);
				System.out.println("Satıldığı lokasyon: "+toplamgelir);
				System.out.println("------------------------------------------------------------------------");
			}
		}
		
	}

	public static void satilanparfumvetutar(String[] ad, String[] lokasyon, String[] urun, int[] adet) {
					
		int satilanadet=0; 
		
		for (int i=0; i<adet.length; i++) {
			if (urun[i].equalsIgnoreCase("Parfum")) {
				satilanadet+=adet[i];
				
				
			}
		}System.out.println("Satılan Parfum Adedi: "+satilanadet);
		System.out.println("Parfum Geliri: "+(satilanadet*500));
		System.out.println("------------------------------------------------------------------------");
				
			}

	public static void satilankozmetikadedivetutari(String[] urun, int[] adet) {
		
		int satilankozmetikadedi=0;
		for (int i=0; i<adet.length; i++) {
			if(urun[i].equalsIgnoreCase("Kozmetik")) {
				satilankozmetikadedi+=adet[i];
					}
		}System.out.println("Satilan Kozmetik Adedi: "+satilankozmetikadedi);
		System.out.println("Kozmetik Geliri: "+(satilankozmetikadedi*400));
		System.out.println("------------------------------------------------------------------------");
		
	}

	public static void enyuksekbonuslueleman(String[] ad, String[] lokasyon, String[] urun, int[] adet) {
		
		int toplamparfumsatisbonusu=0;
		int toplamkozmetiksatisbonusu=0;
		int maxbonus=0; 
		String enyuksekbonusverenurun="";
		
		
		
		for (int i=0; i<adet.length; i++) {
			if (urun[i].equalsIgnoreCase("Parfum")) {
				toplamparfumsatisbonusu+=((adet[i]*500)*0.1);
				if ((toplamparfumsatisbonusu>150000)) {
					toplamparfumsatisbonusu*=1.5;
					
				}
					
					
					
				} else if(urun[i].equalsIgnoreCase("Kozmetik")) {
					toplamkozmetiksatisbonusu+=((adet[i]*400)*0.1);
					if (toplamkozmetiksatisbonusu>100000) {
						toplamkozmetiksatisbonusu*=1.2;
						
				}
					
			} 
			if (toplamparfumsatisbonusu>toplamkozmetiksatisbonusu) {
				maxbonus=toplamparfumsatisbonusu;
				enyuksekbonusverenurun="Daha çok parfum satildi";
				
			}
			else {
				maxbonus=toplamkozmetiksatisbonusu;
				enyuksekbonusverenurun="Kozmetik adedi daha fazla";
			}
			System.out.println(enyuksekbonusverenurun);
			System.out.println(toplamparfumsatisbonusu);
			System.out.println(toplamkozmetiksatisbonusu);
			System.out.println(maxbonus);
		}
		
	
		
		
		
	}

	public static void enyuksekgelirlilokasyon(String[] ad, String[] lokasyon, String[] urun, int[] adet) {
		
		String encoksatisyapilanlokasyon= lokasyon[0];
		
		int enyuksekgelir=0;
		
		for (int i=0; i<lokasyon.length; i++) {
			int gelir = 0;
			if(urun[i].equalsIgnoreCase("Parfum")) {
				gelir=adet[i]*500;
			} else if (urun[i].equalsIgnoreCase("Kozmetik")) {
				gelir=adet[i]*400;
		}
		if (gelir>enyuksekgelir) {
			enyuksekgelir=gelir;
			encoksatisyapilanlokasyon=lokasyon[i];
		}
		
		System.out.println("En yüksek gelir "+enyuksekgelir);
		System.out.println("En yüksek gelirli lokasyon "+encoksatisyapilanlokasyon);
		

			

	}
		}		
	}

			



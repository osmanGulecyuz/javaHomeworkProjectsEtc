package yuksekLisans;

import java.util.Scanner;

public class NursenHocaLoopYasMaasOdev {
	

	public static void main(String[] args) {
		Scanner giris= new Scanner(System.in);
		System.out.println("Kisi adedi giriniz");
		byte kisi=giris.nextByte();
		String ad []=new String [kisi];
		int yas []= new int [kisi];
		String cinsiyet []= new String [kisi];
		int maas []= new int [kisi];
		
		for (int i=0;i<kisi;i++) {
			System.out.println("İsim Giriniz");
			ad[i]=giris.next();
			System.out.println("Yaş giriniz: ");
			yas[i]=giris.nextInt();
			System.out.println("Cinsiyet giriniz: (Erkek/Kadın)");
			cinsiyet[i]=giris.next();
			System.out.println("Maas giriniz: ");
			maas[i]=giris.nextInt();
			
			
		}
		byte menu=0;
		for (;;) {
			System.out.println("\n\n1-listele\n2-İsim Arama\n3-Yas ve Maas Ortalaması\n4-En büyük yaş ve bilgiler");
			System.out.println("5-En küçük yaş ve bilgiler \n6-Erkeklerin Yaş ortalaması\n7-Kadınların Yaş Ortalaması\n7-Erkeklerin maaş ortalaması");
			System.out.println("8-Kadınların Maaş Ortalaması\n9-Çıkış");
			menu=giris.nextByte();
			
			switch(menu) {
			case 1: //listeleme
				for (int i=0;i<kisi;i++) {
					System.out.println("Adı: "+ad[i]);
					System.out.println("Yaşı: "+yas[i]);
					System.out.println("Cinsiyeti: "+cinsiyet[i]);
					System.out.println("Maaşı: "+maas[i]);
					System.out.println("--------------------------------------");
				}
				break;
				
			case 2: //isim arama
				System.out.println("Aranacak Adı giriniz");
				String aranacakAd=giris.next();
				
				
				for (int i=0; i<kisi; i++) {
					if(ad[i].equalsIgnoreCase(aranacakAd)) {
						
						System.out.println("Adı: "+ad[i]);
						System.out.println("Yaşı: "+yas[i]);
						System.out.println("Cinsiyeti: "+cinsiyet[i]);
						System.out.println("Maaşı: "+maas[i]);
						System.out.println("--------------------------------------");
						
					}//burada bu döngü içindeki if biter
					
				}//bu da for sonudur
				
				break;
				
			case 3: 
				//hem maas hem yaş ortalaması
				int toplammaas=0;
				for (int i=0; i<kisi;i++) {
					toplammaas=toplammaas+maas[i];
				}
				System.out.println("maaş ortalaması"+(toplammaas/maas.length));
				
				int toplamyas=0;
				for (int i=0; i<kisi;i++) {
					toplamyas=toplamyas+yas[i];
				}
				System.out.println("maaş ortalaması"+(toplamyas/yas.length));
			

				
				break;
				
			case 4: 
				// en büyük yaş

				int enbyas = yas[0];
				for (int i = 1; i < kisi; i++) {
					if (yas[i] > enbyas)
						enbyas = yas[i];
				}
				System.out.println("En büyük yaş: " + enbyas);
				for (int i = 0; i < kisi; i++) {
					if (yas[i] == enbyas) {
						System.out.println("Adı: " + ad[i]);
						System.out.println("Yaşı: " + yas[i]);
						System.out.println("Cinsiyeti: " + cinsiyet[i]);
						System.out.println("Maaşı: " + maas[i]);
						System.out.println("--------------------------------------");
					}
				}
				break;
			case 5: //en küçük  yaş ve bilgiler
				
				int enkyas=yas[0];
				for (int i=1; i<kisi; i++) {
					if (yas[i]<enkyas)
						enkyas= yas[i];
				}
				System.out.println("En küçük yaş: " + enkyas);
				for (int i=0; i<kisi; i++){
					if (yas[i] == enkyas) {
						System.out.println("Adı: " + ad[i]);
						System.out.println("Yaşı: " + yas[i]);
						System.out.println("Cinsiyeti: " + cinsiyet[i]);
						System.out.println("Maaşı: " + maas[i]);
						System.out.println("--------------------------------------");
					}
				}
				
				
				
				break;
				
				

				
				
			case 6: //Erkeklerin yaş ortalaması
				
				int toplamyaserkek=0;
				int sayacerkekyas=0;
				for (int i=0; i<kisi; i++) 
					{if (cinsiyet[i].equals("Erkek"))
						{toplamyaserkek+=yas[i];
						sayacerkekyas+=1;}
						
				}
				System.out.println("Erkek yaş ortalaması: "+(toplamyaserkek/sayacerkekyas));
				System.out.println("--------------------------------------");
				
				
				break;
			case 7: //Kadınların yaş ortalaması
				
				int toplamyaskadin=0;
				int sayackadinyas=0;
				for (int i=0; i<kisi; i++) 
					{if (cinsiyet[i].equals("Kadın"))
						{toplamyaskadin+=yas[i];
						sayackadinyas+=1;}
						
				}
				System.out.println("Kadın yaş ortalaması: "+(toplamyaskadin/sayackadinyas));
				System.out.println("--------------------------------------");
				
				
				
				break;
				
				
			case 8: //Erkeklerin Maaş Ortalaması
				
				int toplammaaserkek=0;
				int sayacerkekmaas=0;
				for (int i=0; i<kisi; i++) {
					if (cinsiyet[i].equals("Erkek"))
						{toplammaaserkek+=maas[i];
						sayacerkekmaas+=1;}
						
						
				}
					
				System.out.println("Erkek yaş ortalaması: "+(toplammaaserkek/sayacerkekmaas));
				System.out.println("--------------------------------------");
				
					
				
				break;
				
								
				
			case 9: 
				System.out.println("Programı bitirdiniz");
				System.exit(0);
				
				break;
			default:
				System.out.println("Yanlış değer girdiniz");
				break;
			
			
			
			
			}
			
			
		}//sonsuz döngü burada biter
	}

}

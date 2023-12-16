import java.util.Scanner;

public class telefonFatura {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.println("Kisi adedi girin: ");
		byte kisi= giris.nextByte();
		int dk[]= new int[kisi];
		int sms[]= new int[kisi];
		int internet[]= new int[kisi];
		int fatura[]= new int[kisi];
		String ad[]=new String[kisi];
		for (int i=0; i<kisi; i++) {
			System.out.println("isim giriniz: ");
			ad[i]=giris.next();
			System.out.println("Dakika giriniz");
			dk[i]=giris.nextInt();
			System.out.println("SMS adet giriniz");
			sms[i]=giris.nextInt();
			System.out.println("GB giriniz");
			internet[i]=giris.nextInt();
			fatura[i]=(int) (dk[i]*0.5+sms[i]*0.4+internet[i]*25);
			
			
		}
		byte menu;
		for(;;) {
			
			System.out.println("1-listeleme\n2-İsim Arama\n3-Fatura Ortalaması");
			System.out.println("4-En yüksek fatura ve bilgileri\n5-En düşük fatura ve bilgileri\n6-Çıkış");
			menu=giris.nextByte();
			switch (menu) {
			case 1:
				for (int i=0; i<kisi; i++ ) {
					System.out.println("adınız: "+ad[i]);
					System.out.println("Kullanılan dakika: "+dk[i]);
					System.out.println("Kullanılan sms: "+sms[i]);
					System.out.println("Kullanılan GB: "+internet[i]);
					System.out.println("Ödenecek Fatura: "+fatura[i]);
					System.out.println("------------------------------------------------------------------------");
				}
				break;
			case 2:
				System.out.println("Aranacak adı giriniz: ");
				String arananAd=giris.next();
				for (int i=0; i<kisi; i++) {
					if (ad[i].equalsIgnoreCase(arananAd)) {
						System.out.println("adınız: "+ad[i]);
						System.out.println("Kullanılan dakika: "+dk[i]);
						System.out.println("Kullanılan sms: "+sms[i]);
						System.out.println("Kullanılan GB: "+internet[i]);
						System.out.println("Ödenecek Fatura: "+fatura[i]);
						System.out.println("------------------------------------------------------------------------");
					}//bu if'in sonu
					
					
				} //bu for döngüsünün sonu
				break;
			case 3: 
				//tüm faturaların ortalaması
				int toplam=0;
				for (int bedel:fatura) {
					toplam+=bedel;
				}
				System.out.println("Fatura Ortalaması"+(toplam/kisi));
				System.out.println("------------------------------------------------------------------------");
				break;
			case 4:
				//en büyük fatura ve bilgileri
				int enbfatura=fatura[0];
				for (int i=1; i<kisi; i++) {

					if(fatura[i]>enbfatura) 
						enbfatura=fatura[i];
				}
				System.out.println("En yüksek fatura"+enbfatura);
				
				for (int i=0; i<kisi; i++) {
					if (fatura[i]==enbfatura) {
						System.out.println("adınız: "+ad[i]);
						System.out.println("Kullanılan dakika: "+dk[i]);
						System.out.println("Kullanılan sms: "+sms[i]);
						System.out.println("Kullanılan GB: "+internet[i]);
						System.out.println("Ödenecek Fatura: "+fatura[i]);
						System.out.println("------------------------------------------------------------------------");
					}//bu if'in sonu
					
					
				} //bu for döngüsünün sonu
				

				break;
			case 5:
				//en düşük fatura ve bilgileri
				int enkucukfatura=fatura[0];
				for (int i=1; i<kisi; i++) {
					if(fatura[i]<enkucukfatura) 
						enkucukfatura=fatura[i];
				}
				System.out.println("En düşük fatura"+enkucukfatura);
				
				for (int i=0; i<kisi; i++) {
					if (fatura[i]==enkucukfatura) {
						System.out.println("adınız: "+ad[i]);
						System.out.println("Kullanılan dakika: "+dk[i]);
						System.out.println("Kullanılan sms: "+sms[i]);
						System.out.println("Kullanılan GB: "+internet[i]);
						System.out.println("Ödenecek Fatura: "+fatura[i]);
						System.out.println("------------------------------------------------------------------------");
					}//bu if'in sonu
					
					
				} //bu for döngüsünün sonu
				
					
				
				break;
			case 6:
				System.out.println("Program bitti");
				System.exit(0);
				break;
			default:
				System.out.println("Yanlış menu değeri girdiniz");
				break;
			}
			
		}//sonsuz döngü for(;;) bittiği yer
		
		

	}

}

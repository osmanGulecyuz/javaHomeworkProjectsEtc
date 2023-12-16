import java.util.Scanner;

public class anaKitaplik {

	/* 2 Aralık 2023 Cihan KAradağ ile Ödev */

	public static void main(String[] args) {
		Scanner kGiris = new Scanner(System.in);
		System.out.print("Kitap Adedini Giriniz: ");
		byte kitapadedi = kGiris.nextByte();

		/* değişkenler */

		String kitapAdi [] =new String[kitapadedi];
		int sayfaSayisi [] =new int[kitapadedi];
		String yazarAdi []=new String[kitapadedi];
		String kitapTuru []=new String[kitapadedi];
		String dil []=new String[kitapadedi];
		int kitapStokAdedi[]=new int[kitapadedi];

		byte secim = 0;
		byte suangirilenkitapadedi=0;

		do {

			fonksiyon.menu();
			secim=kGiris.nextByte();
			switch (secim) {
			
			case 1:
				
				
				if(suangirilenkitapadedi<kitapadedi) {
					System.out.println("Şu Ana Kadar Girilen Kitap Adedi: "+suangirilenkitapadedi);
					System.out.println("İlk Girilen Kitap Adedi: "+kitapadedi);
					System.out.println("---------------------------------------");
					
					fonksiyon.kitapEkle(kGiris,kitapAdi, sayfaSayisi,yazarAdi,kitapTuru,dil,kitapStokAdedi,suangirilenkitapadedi);
					suangirilenkitapadedi++;
					
				}else System.out.println("İlk Girilen Kitap Adedini Aştınız");
				
					

				
				
				break;
			case 2:
				fonksiyon.Listele(kitapAdi, sayfaSayisi,yazarAdi,kitapTuru,dil,kitapStokAdedi);

				
				
				break;
				
				
			case 3:
				System.out.println("Aranacak Yazar Adını Giriniz: ");
				String suAnArananYazar=kGiris.next();
				fonksiyon.yazarArama(suAnArananYazar,kitapAdi, sayfaSayisi,yazarAdi,kitapTuru,dil,kitapStokAdedi);

				
				
				break;
				
				
			case 4:
				
				fonksiyon.StokAdetOrtalama(kitapadedi,kitapStokAdedi);
				System.out.println();
				

				break;
				
				
			case 5:

				break;
				
				
			case 6:

				break;
				
				
			case 7:

				break;
				
				
			case 8:

				break;
				
				
			case 9:
				
				
				System.out.println("Program Bitti");
				System.exit(0);

				break;

			default:
				
				
				System.out.println("Yanlış Tuşa Bastınız!");
				break;
			}
			
			
		} while (secim != 9);



	}

}

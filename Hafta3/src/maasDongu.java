import java.util.Scanner;

public class maasDongu {

	public static void main(String[] args) {
			Scanner k= new Scanner(System.in);
			String ad;
			int maas;
			byte cocukadedi;
			String mDurum;
			
			char kontrol='e';
			
			do{
				System.out.println("İsim gir");
				ad=k.next();
				System.out.println("maas gir");
				maas=k.nextInt();
				System.out.println("Cocuk adedi");
				cocukadedi=k.nextByte();
				if (cocukadedi>3) 
					cocukadedi=3;
				maas=maas+(cocukadedi*250);
				System.out.println("medeni durum gir");
				mDurum=k.next();
				if (mDurum.equalsIgnoreCase("evli"))
					maas=maas+500;
				System.out.println("ismin"+ad+"maaşın"+maas+" TLdir");
				System.out.println("Devam edecek misiniz? (e/h)");
				kontrol=k.next().charAt(0);
			}while (kontrol=='e'|| kontrol=='E');
			System.out.println("bitti");

	}

}

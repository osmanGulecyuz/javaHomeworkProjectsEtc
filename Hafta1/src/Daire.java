import java.util.Scanner;

public class Daire {

	public static void main(String[] args) {
		short yaricap;
		float cevre;
		float alan;
		final float pi=3.1415f;
		Scanner klavyeilegirisyap= new Scanner(System.in);
		System.out.println("Yaricap gir çabuk: ");
		yaricap=klavyeilegirisyap.nextShort();
		cevre=2*pi*yaricap;
		alan=pi*yaricap*yaricap;
		System.out.println("YARICAPI "+yaricap+" olan dairenin çevresi "+cevre+" cikar");
		System.out.println("YARICAPI "+yaricap+" olan dairenin alanı "+alan+" cikar");
		


	}

}

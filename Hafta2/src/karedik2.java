import java.util.Scanner;

public class karedik2 {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("birinci kenar");
		short birincikenar=giris.nextShort();
		System.out.println("ikinci kenar");
		short ikincikenar=giris.nextShort();
		short kalan, dalan, kcevre, dcevre;
		kalan=(short) (birincikenar*birincikenar);
		dalan=(short) (birincikenar*ikincikenar);
		kcevre=(short) (birincikenar*4);
		dcevre=(short) ((birincikenar+ikincikenar)*2);
		if (birincikenar==ikincikenar) {
			System.out.println("Sen bir karesin");
			System.out.println("alanın "+kalan);
			System.out.println("çevren "+kcevre);
		} else {
			System.out.println("Sen bir dikdörtgensin");
			System.out.println("alanın "+dalan);
			System.out.println("çevren "+dcevre);
		}
				
	}

}

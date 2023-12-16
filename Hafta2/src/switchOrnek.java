
public class switchOrnek {

	public static void main(String[] args) {

		// switch case sadece tam sayı ve eşit midir değil midir, büyük küçük yok

		int a = 2;

		switch (a) {
		case 1:
			
			
		case 2:
			System.out.println("a 1 ya da 2 değerindedir");
			break;
		case 3:
			System.out.println("a 3 değerindedir");
			break;
		case 4:
			System.out.println("a 4 değerindedir");
			break;
		case 5:
			System.out.println("a 5 değerindedir");
			break;
		default:
			System.out.println("a 1-5 dışında");
		} // case sonuna geldi
	}

}

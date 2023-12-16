package hatalar;

import javax.swing.JOptionPane;

public class baskaSinif {

	public static void main(String[] args) {
		String ad=JOptionPane.showInputDialog(null,"İsim Giriniz: ","Bilgi",JOptionPane.QUESTION_MESSAGE);
		System.out.println(ad);
		JOptionPane.showMessageDialog(null,"Girilen ad "+ad,"Bilgi",JOptionPane.QUESTION_MESSAGE);

	}

}

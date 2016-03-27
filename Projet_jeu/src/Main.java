import javax.swing.JFrame;

public class Main {

	public static Visuel visuel;
	public static void main(String[] args) {
		System.out.println("non");
		JFrame fenetre = new JFrame("Jeu test");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700,700);
		fenetre.setResizable(false);
		
		visuel = new Visuel();
		
		fenetre.setContentPane(visuel);;
		fenetre.setVisible(true);
		
	}

}

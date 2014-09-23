
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pays pays1 = new Pays("France", "Français", "Euro", new Capitale("Paris", 2249975));
		pays1.ajouterVille(new Ville("Evry", 52184));
		pays1.ajouterVille(new Ville("Soisy", 6992));
		System.out.println(pays1.toString());
		
		
	}

}

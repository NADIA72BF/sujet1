package ex;

public class Theatre extends Evenement {
	private String auteur ;

	public Theatre(String titre, int duree,
			String[] tabNom,String realisateur, String auteur) {
		super(titre, duree, realisateur, tabNom);
		this.auteur = auteur;
	}

	public String getAuteur() {
		return auteur;
	}

	@Override
	public String toString() {
		return "Theatre ["+ super.toString() + 
				"+auteur" +auteur +"]";
	}

	
	
}

package ex;

public class Film extends Evenement {
	private String producteur;
	private String genre;
	public Film(String titre, int duree, String[] tabNom,
			String	realisateur, String producteur
			, String genre) {
		super(titre, duree, realisateur, tabNom);
		this.producteur = producteur;
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Film [producteur=" 
	+ producteur + ", genre=" + genre +
	"\n" + super.toString() + "]";
	}
	public String getProducteur() {
		return producteur;
	}
	public String getGenre() {
		return genre;
	}
	
	
	
}

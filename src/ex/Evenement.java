package ex;

import java.util.Arrays;

public class Evenement {
	private String titre;
	private int duree;
	private String realisateur;
	private String[] tabNom;
	



	public Evenement(String titre, int duree, String realisateur, String[] tabNom) {
		this.titre = titre;
		this.duree = duree;
		this.realisateur = realisateur;
		this.tabNom = tabNom;
	}


	@Override
	public String toString() {
		return "Evenement [titre=" + titre + 
				", duree=" + duree + ", realisateur=" 
				+ realisateur + ", tabNom="
				+ Arrays.toString(tabNom) + "]";
	}


	public String getTitre() {
		return titre;
	}


	public int getDuree() {
		return duree;
	}


	public String getRealisateur() {
		return realisateur;
	}
	
	public boolean acteurIn (String s) {
		boolean ok=false;
		for(int i=0;i<tabNom.length;i++) {
			if (tabNom[i].equals(s)) {
				ok=true;
				break;
			}
		}
		return ok;
	}
	
}

package ex;

public class ThemeArtiste implements ThemeEvt {
	private String artiste;
	
	public ThemeArtiste(String artiste) {
		this.artiste = artiste;
	}

	@Override
	public boolean theme(Evenement Evt) {
		if(Evt instanceof Theatre) {
			Theatre t=(Theatre) Evt;
			return t.getAuteur().equals(artiste)||
					Evt.getRealisateur().equals(artiste)
					||Evt.acteurIn(artiste);
			}else if (Evt instanceof Film) {
				Film f=(Film) Evt;
				return f.getProducteur().equals(artiste)||
						Evt.getRealisateur().equals(artiste)||
						Evt.acteurIn(artiste);
			}
		return false;
	}

}

package ex;

public class OrganiseEvtMois {
	private int mois;
	private ThemeEvt theme;
	private Evenement tabEvent[];
	
	public int Nmax() {
		int x=0;
		switch(mois) {
		case 2:x=28;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: x=31;
		case 4:
		case 6:
		case 9:
		case 11: x=30;
		}
		return x;
	}
	public OrganiseEvtMois(int mois, ThemeEvt theme) {
		this.mois = mois;
		this.theme = theme;
		this.tabEvent = new Evenement[Nmax()];
	}
	
	void ajouter(Evenement Evt , int jour) throws EvtException{
		if (theme.theme(Evt)){
		if(jour<1||jour>Nmax()) {
			throw new EvtException ("Jour Incorrecte");
		}
		
		if(tabEvent[jour-1]==null) {
				tabEvent[jour-1]=Evt;
		}
		else {
			int i=0;
			for(;i<Nmax();i++) {
				if(tabEvent[i]==null) {
					tabEvent[i]=Evt;
					break;
				}
			}
			if(i==Nmax()) {
				throw new EvtException("Complet");
			}
		}
	}
		else System.out.println("hors theme");
		
	}	
	void afficherCalendrierEvts() {
		for(int i=0;i<Nmax();i++) {
			if(this.tabEvent[i]!=null)
			System.out.println(this.tabEvent[i]);
		}
	}
}
	

package entites;

public class AdressePostale {

	public int numeroRue;
	public String libellerue;
	public int codepostal;
	public String ville; 
	

	public AdressePostale (int nR, String lib, int cp, String v) {
		numeroRue= nR;
		libellerue= lib;
		codepostal= cp;
		ville=v;
	
	}
	public String afficherAdresse() {
		return numeroRue + " "+ libellerue+" "+ codepostal+" "+ville;
	}
}
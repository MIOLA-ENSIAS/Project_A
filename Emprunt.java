package bibliotheque;

public class Emprunt {

	int kindleNumber;
	int numAdherent;
	private final int numero;
	static private int nb=0;
	
	Emprunt(int kindleNumber, int numAdherent){
		numero=++nb;
		this.kindleNumber=kindleNumber;
		this.numAdherent=numAdherent;
	}
}

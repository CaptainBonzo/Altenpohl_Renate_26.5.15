import java.util.*;

public class Workshop {
	int nummer;
	String bez;
	String datum;
	
	Referent ref;
	ArrayList<Teilnehmer> teilnehmerliste;
	ArrayList<Referent> besucherliste;

	public Workshop(int nr, String bez, String dat, Referent r){
		nummer = nr;
		this.bez= bez;
		datum = dat;
		ref =r;
		teilnehmerliste = new ArrayList<Teilnehmer>();
	}
	
	
}

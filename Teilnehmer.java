import java.util.*;


public class Teilnehmer {
	
	String name;
	String email;
	String status;
	
	ArrayList<Workshop> workshopliste;
	ArrayList<Rahmenprogramm> rahmenprogrammliste;
	
	public Teilnehmer(String name,String email, String status){
		this.name = name;
		this.email = email;
		this.status = status;
		
		workshopliste = new ArrayList<Workshop>();
	}
	
}

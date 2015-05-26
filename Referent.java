import java.util.ArrayList;


public class Referent {
	String name;
	String email;
	String firma;
	
	ArrayList<Workshop> workshopliste ;
	ArrayList<Workshop> teilnahmeliste;
	
	public Referent(String n, String e, String f){
		name= n;
		email=e;
		firma =f;
		
		workshopliste = new ArrayList<Workshop>();
		
	}
}


public class Rennstrecke {
	double length; //länge Runde
	int round; //Anzahl Runden
	double racelength;
	String name; //Name
	
	public Rennstrecke(String name, double length, int round){
		this.name=name;
		this.length=length;
		this.round=round;
		racelength= length*round;
		
	}
}

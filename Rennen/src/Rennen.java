
public class Rennen {

	public static void main(String[] args) {
		
		Auto a1 = new Auto (1, 200, 60, 20); //neue Autos werden erstelt, Werte werden übergeben
		Auto a2 = new Auto (2, 220, 50, 30);
		
		Rennstrecke nordschleife= new Rennstrecke ("Nordschleife", 20.83, 60);
		
		System.out.println(a1); //Daten ausgeben
		System.out.println("Fahrzeit: "+(a1.fahren(nordschleife.racelength,nordschleife.round))/3600+" Stunden");//rennstrecke  wird aufgerufen mit bestimmten auto, werte werden ausgegeben
	
		System.out.println();
		System.out.println(a2);
		
		System.out.println("Fahrzeit: "+(a2.fahren(nordschleife.racelength,nordschleife.round))/3600+" Stunden"); //Fahrzeit Auto 2
		
	}

}

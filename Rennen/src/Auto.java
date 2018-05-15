import java.util.Random;

public class Auto {
	
	int nummer; //Identifizierung unterschiedliche Autos
	double vmax; //Variablen werden bestimmt, nicht initialisiert, maximale Geschwindigkeit
	double speed;//eigentliche Geschwindigkeit, bei Fehlern geändert, sonst vmax
	double capacity; //Akkukapazität
	double consumption; //Stromeverbrauch
	double energy_remaining; //verbleibende Energie
	//int acc; accident, klappt nicht
	double range; //Reichweite
	double time; //zeit die bei Rennen benötigt wird
	double failure;
	

	public Auto(int nummer, double vmax, double capacity, double consumption){ //Konstruktor Objekt Auto, Eigenschaften werden übergeben
		this.nummer = nummer; //individuelle Nummern
		this.vmax = vmax; //eigene Geschwindigkeit (sonst alle gleich)
		this.capacity = capacity;
		this.consumption = consumption;
		this.energy_remaining = this.capacity;//werden voll aufgeladen: Akku voll(eigene Kapazität, da nicht allgemein)
	}


	public double fahren(double racelength, int round){  //strecke in Rennen definiert, was passiert wenn man fährt, anderer Ansatz als Rest (nicht über Runden sondern allgemein)
		
		Random random = new Random();

		
		range = (capacity/consumption)*100;	//reichweite	
		double stops = Math.ceil(racelength/range); //Anzahl Boxenstops (Aufladen)
		double stoptime = 21 + capacity + random.nextInt((int)stops*3); // Zeit pro stop
		failure = failure(); //failure ist Objektvariable
		speed = vmax-failure;		 //aktuelle Geschwindigkeit ist Maximalgeschwindigkeit-Fehlerfaktor (0-10)

		
		double time = stops*stoptime +(racelength/speed)*3600;
		
		return time;

		
	
	}
	
	public double failure(){ //Fehler (Auto fährt langsamer)
		
		Random random = new Random(); //zufällliger Wert, bestimmt ob und wie gravierend Fehler ist
		int failure = random.nextInt(10);
		
		return failure;
		
	}
	

	

	public void aufladen(){ //Aufladen des Akkus
		energy_remaining = capacity; //Akku wird wieder voll (kapazitätat)
		speed = speed-80; //Durchschnittsgeschwindigkeit für Runde sinkt, da Aufladen zeit braucht
	}
	
	public String toString(){ //Daten für Auto werden ausgegeben
		return "Startnummer: " +nummer+ //\n ist Zeilenumbruch; großer String als Rückgabewert
				"\n Vmax: "+vmax+
				"\n Derzeitige Durchschnittsgeschwindigkeit: "+speed+
				"\n Akkukapazität: " +capacity+
				"\n Restenergie: " +energy_remaining+
				"\n Verbrauch auf 100 km: " +consumption+
				"\n Letzter Fehler: " +failure();
		
		
	}
	
	public double getFailure(){ //Fehler wird ausgegeben, macht toString Methode unnötig
		
		return failure;
	}
	
	/*public double getEnergyRemaining(){
		return
	
	}*/
}

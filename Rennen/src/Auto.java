import java.util.Random;

public class Auto {
	
	int nummer; //Identifizierung unterschiedliche Autos
	double vmax; //Variablen werden bestimmt, nicht initialisiert
	double speed;//eigentliche Geschwindigkeit, bei Fehlern ge�ndert, sonst vmax
	double capacity; //Akkukapazit�t
	double consumption; //Stromeverbrauch
	double energy_remaining; //verbleibende Energie
	

	public Auto(int nummer, double vmax, double capacity, double consumption){ //Konstruktor Objekt Auto, Eigenschaften werden �bergeben
		this.nummer = nummer; //individuelle Nummern
		this.vmax = vmax; //eigene Geschwindigkeit (sonst alle gleich)
		this.capacity = capacity;
		this.consumption = consumption;
		this.energy_remaining = this.capacity;//werden voll aufgeladen: Akku voll(eigene Kapazit�t, da nicht allgemein)
	}


	public void fahren(){
	
	}
	
	public void failure(){ //Fehler (Auto f�hrt langsamer)
		
		Random random = new Random(10); //zuf�llliger Wert, bestimmt ob und wie gravierend Fehler ist
		int failure = random.nextInt(10);
		speed = vmax-failure; //aktuelle Geschwindigkeit ist Maximalgeschwindigkeit-Fehlerfaktor (0-10)
	}

	public void aufladen(){ //Aufladen des Akkus
		energy_remaining = capacity; //Akku wird wieder voll (kapazit�tat)
		speed = speed-80; //Durchschnittsgeschwindigkeit f�r Runde sinkt, da Aufladen zeit braucht
	}
	
	public String toString(){ //Daten f�r Auto werden ausgegeben
		return "Startnummer: " +nummer+ //\n ist Zeilenumbruch; gro�er String als R�ckgabewert
				"\n Vmax: "+vmax+
				"\n Derzeitige Durchschnittsgeschwindigkeit: "+speed+
				"\n Akkukapazit�t: " +capacity+
				"\n Restenergie: " +energy_remaining+
				"\n Verbrauch auf 100 km: " +consumption;
		
		
		
	}
	
}
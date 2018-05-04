import java.util.Random;

public class Auto {
	
	int nummer; //Identifizierung unterschiedliche Autos
	double vmax; //Variablen werden bestimmt, nicht initialisiert, maximale Geschwindigkeit
	double speed;//eigentliche Geschwindigkeit, bei Fehlern geändert, sonst vmax
	double capacity; //Akkukapazität
	double consumption; //Stromeverbrauch
	double energy_remaining; //verbleibende Energie
	int acc;
	

	public Auto(int nummer, double vmax, double capacity, double consumption){ //Konstruktor Objekt Auto, Eigenschaften werden übergeben
		this.nummer = nummer; //individuelle Nummern
		this.vmax = vmax; //eigene Geschwindigkeit (sonst alle gleich)
		this.capacity = capacity;
		this.consumption = consumption;
		this.energy_remaining = this.capacity;//werden voll aufgeladen: Akku voll(eigene Kapazität, da nicht allgemein)
	}


	public void fahren(){
	
	}
	
	public int failure(){ //Fehler (Auto fährt langsamer)
		
		Random random = new Random(10); //zufällliger Wert, bestimmt ob und wie gravierend Fehler ist
		int failure = random.nextInt(10);
		speed = vmax-failure; //aktuelle Geschwindigkeit ist Maximalgeschwindigkeit-Fehlerfaktor (0-10)
		return failure;
	}
	
	/*public int accident(int failure){ //ausprboieren Unnfall -> Problem, klappt nicht (acc immer 0)
		
		
		if (failure>5){
			Random random=new Random (9);
			int probAcc= random.nextInt(9);
			if (probAcc==9){
				 //acc = true;
				acc=100;
				 return acc;
				}
			else{
				 //acc = false;
				acc=probAcc*failure;
				 return acc;
			}
		}
		else{
			Random random = new Random (50);
			int  probAcc = random.nextInt(50);
			
			if (probAcc==50){
				//acc = true;
				acc=100;
				return acc;
			}
			else{
				//acc = false;
				int acc=probAcc*failure;
				return acc;
			}
		}
		
	}*/
	

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
				"\n Wahrscheinlichkeit Unfall: "+acc+"%";
		
		
	}
	
	
}

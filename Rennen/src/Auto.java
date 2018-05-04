import java.util.Random;

public class Auto {
	
	double vmax; //Variablen werden bestimmt, nicht initialisiert
	double speed;//eigentliche Geschwindigkeit, bei Fehlern geändert, sonst vmax
	double capacity;
	double consumption;
	double energy_remaining;
	

	public Auto(double vmax, double capacity, double consumption){ //Konstruktor Objekt Auto, Eigenschaften werden übergeben
		this.vmax = vmax; //eigene Geschwindigkeit (sonst alle gleich)
		this.capacity = capacity;
		this.consumption = consumption;
		this.energy_remaining = this.capacity;//werden voll aufgeladen: Akku voll(eigene Kapazität, da nicht allgemein)
	}


	public void fahren(){
	
	}
	
	public void failure(){
		
		Random random = new Random(10);
		int failure = random.nextInt(10);
		speed = vmax-failure;
	}

	public void aufladen(){
	
	}
}
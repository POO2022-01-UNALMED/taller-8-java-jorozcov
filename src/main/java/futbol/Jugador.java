package futbol;

public class Jugador extends Futbolista{
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
	    this.dorsal = 7;
	}
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
	      super(nombre, edad, posicion);
	      this.golesMarcados = golesMarcados;
	      this.dorsal = dorsal;
	  }


	public int compareTo(Object o) {
		return Math.abs(this.getEdad() - ((Futbolista)o).getEdad());
	}


	public boolean jugarConLasManos() {
		return false;
	}
	
	public String toString() {
    	return "El futbolista "+ this.getNombre()+" tiene "+this.getEdad()+ ", yjuega de "+this.getPosicion() + "con el dorsal "
    			+this.dorsal+". Ha marcado "+this.golesMarcados;
    }


}

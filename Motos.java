
public abstract class Motos extends vehículo {
	String carnet_req;
	boolean estriberas;
	int tamaño_rueda;
	
	public Motos(){
		super();
		this.carnet_req="A2";
		this.estriberas=true;
		this.tamaño_rueda=18;
	}

	public Motos(String carnet_req, boolean estriberas, int tamaño_rueda){
		super();
		this.carnet_req=carnet_req;
		this.estriberas=estriberas;
		this.tamaño_rueda=tamaño_rueda;
	}
	public abstract String muestracaracteristicas();

	
}

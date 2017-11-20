
public class Moto_carretera extends Motos{
	boolean navegador;
	public Moto_carretera(){
		super();
		this.navegador=false;
	}
	public String muestracaracteristicas(){
	String str= +this.v_max+"carnet necesario: "
	+this.carnet_req+" estriberas: "+this.estriberas+" tamaño de rueda: "+this.tamaño_rueda+" navegador: "+this.navegador;
	System.out.println(str);
	return str;
	}
}


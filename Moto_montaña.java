
public class Moto_montaña extends Motos{
	String amortiguadores;
	String tipo_rueda;
	public Moto_montaña(){
		super();
		this.amortiguadores="as";
		this.tipo_rueda="bonita";
	}
	public String muestracaracteristicas(){
	String str= +this.v_max+"carnet necesario: "
	+this.carnet_req+" estriberas: "+this.estriberas+" tamaño de rueda: " +
			""+this.tamaño_rueda+" tipo de rueda: "+this.tipo_rueda+" amortiguadores: "+this.amortiguadores;
	System.out.println(str);
	return str;
	}
}

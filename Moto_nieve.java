
public class Moto_nieve extends Motos {
	int tamaño_cadena;
	public Moto_nieve(){
		super();
		this.tamaño_cadena=6;
	}
	public String muestracaracteristicas(){
	String str= +this.v_max+"carnet necesario: "
	+this.carnet_req+" estriberas: "+this.estriberas+" tamaño de rueda: " +
			""+this.tamaño_rueda+" tamaño cadena: "+this.tamaño_cadena;
	System.out.println(str);
	return str;
	}
}

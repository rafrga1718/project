
public class Moto_nieve extends Motos {
	int tamaño_cadena;
	public Moto_nieve(){
		super();
		this.tamaño_cadena=6;
	}
	public void __setdata(){
		System.out.println("Introduce la velocidad máxima");
		this.v_max=data.nextInt();
		System.out.println("Introduce el tipo de combustible");
		this.combustible=data.nextLine();
		System.out.println("Introduce el precio");
		this.precio=data.nextFloat();
		System.out.println("Introduce el precio_alquiler ");
		this.precio_alquiler=data.nextFloat();
		System.out.println("Introduce la potencia");
		this.potencia=data.nextInt();
		System.out.println("Introduce el modelo");
		this.modelo=data.nextLine();
		System.out.println("Introduce el carnet requerido");
		this.carnet_req=data.nextLine();
		System.out.println("Tiene estriberas? ");
		this.estriberas=data.nextBoolean();
		System.out.println("Introduce el tamaño de rueda");
		this.tamaño_rueda=data.nextInt();
		System.out.println("Introduce el tamaño de la cadena ");
		this.tamaño_cadena=data.nextInt();
		data.close();
	}
	public String muestracaracteristicas(){
	String str= +this.v_max+"carnet necesario: "
	+this.carnet_req+" estriberas: "+this.estriberas+" tamaño de rueda: " +
			""+this.tamaño_rueda+" tamaño cadena: "+this.tamaño_cadena;
	System.out.println(str);
	return str;
	}
}

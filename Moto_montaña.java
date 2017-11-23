
public class Moto_montaña extends Motos{
	String amortiguadores;
	String tipo_rueda;
	public Moto_montaña(){
		super();
		this.amortiguadores="as";
		this.tipo_rueda="bonita";
	}
	public void __setdata(){
		System.out.println("Introduce la velocidad máxima");
		this.v_max=data.nextInt();
		data.nextLine();
		System.out.println("Introduce el tipo de combustible");
		this.combustible=data.nextLine();
		System.out.println("Introduce el precio");
		this.precio=data.nextFloat();
		System.out.println("Introduce el precio_alquiler ");
		this.precio_alquiler=data.nextFloat();
		System.out.println("Introduce la potencia");
		this.potencia=data.nextInt();
		data.nextLine();
		System.out.println("Introduce el modelo");
		this.modelo=data.nextLine();
		System.out.println("Introduce el carnet requerido");
		this.carnet_req=data.nextLine();
		System.out.println("Tiene estriberas? ");
		this.estriberas=data.nextBoolean();
		System.out.println("Introduce el tamaño de rueda");
		this.tamaño_rueda=data.nextInt();
		data.nextLine();
		System.out.println("Introduce el tipo de rueda ");
		this.tipo_rueda=data.nextLine();
		System.out.println("Introduce el modelo de los amortiguadores ");
		this.amortiguadores=data.nextLine();
	}
	public String muestracaracteristicas(){
	String str= +this.v_max+"carnet necesario: "
	+this.carnet_req+" estriberas: "+this.estriberas+" tamaño de rueda: " +
			""+this.tamaño_rueda+" tipo de rueda: "+this.tipo_rueda+" amortiguadores: "+this.amortiguadores;
	System.out.println(str);
	return str;
	}
}

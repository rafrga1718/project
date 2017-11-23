
public class Moto_carretera extends Motos{
	boolean navegador;
	public Moto_carretera(){
		super();
		this.navegador=false;
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
		System.out.println("Tiene navegador? ");
		this.navegador=data.nextBoolean();
	}
	public String muestracaracteristicas(){
	String str= +this.v_max+"carnet necesario: "
	+this.carnet_req+" estriberas: "+this.estriberas+" tamaño de rueda: "+this.tamaño_rueda+" navegador: "+this.navegador;
	System.out.println(str);
	return str;
	}
}


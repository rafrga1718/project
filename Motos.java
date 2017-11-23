
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
	public void __setdata(){
		System.out.println("Introduce la velocidad máxima");
		this.v_max=data.nextInt();
		System.out.println("Introduce el tipo de combustible");
		this.combustible=data.nextLine();
		System.out.println("Introduce el precio");
		this.precio=data.nextFloat();;
		System.out.println("Introduce el precio_alquiler ");
		this.precio_alquiler=data.nextFloat();;
		System.out.println("Introduce la potencia");
		this.potencia=data.nextInt();;
		System.out.println("Introduce el modelo");
		this.modelo=data.nextLine();
		System.out.println("Introduce el carnet requerido");
		this.carnet_req=data.nextLine();
		System.out.println("Tiene estriberas? ");
		this.estriberas=data.nextBoolean();
		System.out.println("Introduce el tamaño de rueda");
		this.tamaño_rueda=data.nextInt();
	}
	public Motos(String carnet_req, boolean estriberas, int tamaño_rueda){
		super();
		this.carnet_req=carnet_req;
		this.estriberas=estriberas;
		this.tamaño_rueda=tamaño_rueda;
	}
	public abstract String muestracaracteristicas();

	
}

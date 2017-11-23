
public class Furgonetas extends vehículo implements setdata{
	int num_puertas;
	String tipo_tracción;
	int capacidad_carga;
	public Furgonetas(){
		super();
		this.num_puertas=5;
		this.tipo_tracción="Delantera";
		this.capacidad_carga=5000;
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
		System.out.println("Introduce el número de puertas");
		this.num_puertas=data.nextInt();
		data.nextLine();
		System.out.println("Introduce el tipo de tracción");
		this.tipo_tracción=data.nextLine();
		System.out.println("Introduce la capacidad de carga");
		this.capacidad_carga=data.nextInt();
		data.nextLine();
	}
}

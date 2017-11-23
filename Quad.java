
public class Quad extends vehículo{
	String tipo_rueda;
	int num_plazas;
	public Quad(){
		super();
		this.tipo_rueda="t1";
		this.num_plazas=1;
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
		System.out.println("Introduce el número de plazas");
		this.num_plazas=data.nextInt();
		System.out.println("Introduce el tipo de rueda");
		this.tipo_rueda=data.nextLine();
	}
}

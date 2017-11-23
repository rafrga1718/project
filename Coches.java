
public class Coches extends vehículo{
	int num_puertas;
	String tipo_tracción;
	int volumen_maletero;
	boolean ABS;
	boolean airbag;
	public Coches(){
		super();
		this.num_puertas=5;
		this.tipo_tracción="Delantera";
		this.volumen_maletero=300;
		this.ABS=true;
		this.airbag=true;
	}
	public void __setdata(){
		System.out.println("Introduce la velocidad máxima");
		this.v_max=data.nextInt();
		String saltoDeLinea = data.nextLine();
		System.out.println("Introduce el tipo de combustible");
		this.combustible=data.nextLine();
		System.out.println("Introduce el precio");
		this.precio=data.nextFloat();
		System.out.println("Introduce el precio_alquiler ");
		this.precio_alquiler=data.nextFloat();;
		System.out.println("Introduce la potencia");
		this.potencia=data.nextInt();
		saltoDeLinea = data.nextLine();
		System.out.println("Introduce el modelo");
		this.modelo=data.nextLine();
		System.out.println("Introduce el número de puertas");
		this.num_puertas=data.nextInt();
		saltoDeLinea = data.nextLine();
		System.out.println("Introduce el tipo de tracción");
		this.tipo_tracción=data.nextLine();
		System.out.println("Introduce el volumen del maletero");
		this.volumen_maletero=data.nextInt();
		System.out.println("Tiene ABS?");
		this.ABS=data.nextBoolean();
		System.out.println("Tiene airbag?");
		this.airbag=data.nextBoolean();
		data.close();
	}
}
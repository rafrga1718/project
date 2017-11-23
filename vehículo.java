import java.util.Scanner;


public abstract class vehículo implements setdata{
	int v_max;
	String combustible;//ha de ser un enum
	float precio;
	float precio_alquiler;
	int potencia;
	String modelo;
	boolean alquilado;
	boolean vendido;
	protected Alquiler a;
	Scanner data = new Scanner(System.in);
	public vehículo() {
		this.v_max=150;
		this.precio=15000;
		this.combustible="gasolina";
		this.precio_alquiler=1000;
		this.potencia=75;
		this.modelo="1";
	}
	public void __setdata(){
		System.out.println("Introduce la velocidad máxima");
		this.v_max=data.nextInt();
		System.out.println("Introduce el tipo de combustible");
		this.combustible=data.nextLine();
		System.out.println("Introduce el precio");
		this.precio=data.nextFloat();
		System.out.println("Introduce el precio_alquiler ");
		this.precio_alquiler=data.nextFloat();;
		System.out.println("Introduce la potencia");
		this.potencia=data.nextInt();
		System.out.println("Introduce el modelo");
		this.modelo=data.nextLine();
	}
	public void __setprecioalq(float n){
		this.precio_alquiler=n;
	}
	public float __getprecioalq(){
		return this.precio_alquiler;
	}
	public void __settime(int n){
		a.tiempo=n;
	}
	public int __gettime(){
		return a.tiempo;
	}
	public float __getprecio(){
		return this.precio;
	}
}

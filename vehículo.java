
public abstract class vehículo {
	int v_max;
	String combustible;//ha de ser un enum
	float precio;
	float precio_alquiler;
	int potencia;
	String modelo;
	boolean alquilado;
	protected Alquiler a;

	public vehículo() {
		this.v_max=150;
		this.precio=15000;
		this.combustible="gasolina";
		this.precio_alquiler=1000;
		this.potencia=75;
		this.modelo="1";
		this.alquilado=false;
	}
	public void __setdata(int v,float p, float pa, int po, String m){
		this.v_max=v;
		this.precio=p;
		this.precio_alquiler=pa;
		this.potencia=po;
		this.modelo=m;
	}
	public void __setprecioalq(float n){
		this.precio_alquiler=n;
	}
	public float __getprecioalq(){
		return this.precio_alquiler;
	}
	public void __setalquilat(){
		this.alquilado=true;
	}
	public void __unsetalquilat(){
		this.alquilado=false;
	}
	public boolean __getalquilat(){
		return this.alquilado;
	}
	public void __settime(int n){
		a.tiempo=n;
	}
	public int __gettime(){
		return a.tiempo;
	}
}


public abstract class vehículo {
	int v_max;
	String combustible;//ha de ser un enum
	float precio;
	float precio_alquiler;
	int potencia;
	String modelo;

	public vehículo() {
		this.v_max=150;
		this.precio=15000;
		this.combustible="gasolina";
		this.precio_alquiler=1000;
		this.potencia=75;
		this.modelo="1";
	}
	public void __setdata(int v,float p, float pa, int po, String m){
		this.v_max=v;
		this.precio=p;
		this.precio_alquiler=pa;
		this.potencia=po;
		this.modelo=m;
	}
	public boolean alquila(){
		return true;
	}
	public float __getprecioalq(){
		return this.precio_alquiler;
	}
}

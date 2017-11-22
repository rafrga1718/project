
public class Alquiler {
	float precio;
	String modo_pago;
	int tiempo;
	boolean seguro;
	protected vehículo v;
	public Alquiler(){
		this.precio=4;
		this.modo_pago="efectivo";
		this.tiempo=4;
		this.seguro=false;
	}
	public void calculaprecio(vehículo v){
		this.precio=__getpreualq(v)*this.tiempo;
	}
	public void __setpreualq(vehículo v){
		this.precio=v.__getprecioalq();
	}
	public float __getpreualq(vehículo v){
		__setpreualq(v);
		return this.precio;
	}
	public float __getprecio(){
		return this.precio;
	}
	public void __settime(int n){
		this.tiempo=n;
	}
	public int __gettime(){
		return this.tiempo;
	}
}

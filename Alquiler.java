
public class Alquiler {
	float precio;
	String modo_pago;
	int tiempo;
	boolean seguro;
	public Alquiler(){
		this.precio=4;
		this.modo_pago="efectivo";
		this.tiempo=4;
		this.seguro=false;
	}
	public float calculaprecio(){
		return this.precio*this.tiempo;
	}
	public void setpreualq(float n){
		this.precio=n;
	}
}

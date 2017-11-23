
public class Venta {
	float precio;
	private vehículo v;
	public void __setprecio(vehículo v){
		this.precio=v.__getprecio();
	}
	public float __getprecio(){
		return this.precio;
	}
}

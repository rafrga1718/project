
public class Cuenta {
	int num_cuenta;
	float saldo;
	private Alquiler a;
	private Venta venta;
	public Cuenta(){
		this.num_cuenta=123456789;
		this.saldo=0;
	}
	public void __setSaldo(float n){
		this.saldo=saldo+n;
	}
	public void __getSaldo(){
		System.out.println(this.saldo);
	}
	public float __getsaldo(){
		return this.saldo;
	}
	public void recibiralquiler(Alquiler a){
		this.saldo+=a.__getprecio();
	}
	public float hacer_compra(float precio){
		this.saldo=saldo-precio;
		return this.saldo;
	}
	public void hacer_Venta(Venta venta){
		this.saldo=saldo+venta.__getprecio();
	}
}


public class Main {

	public static void main(String[] args) {
		Moto_carretera m1= new Moto_carretera();
		Moto_montaña m2= new Moto_montaña();
		Moto_nieve m3= new Moto_nieve();
		m1.muestracaracteristicas();
		m2.muestracaracteristicas();
		m3.muestracaracteristicas();
		Cuenta c1= new Cuenta();
		c1.__setSaldo(15000);
		c1.__getSaldo();
		Alquiler a1= new Alquiler();
		a1.setpreualq(m1.__getprecioalq());
		c1.recibiralquiler(a1.calculaprecio());
		c1.__getSaldo();
		
	}

}

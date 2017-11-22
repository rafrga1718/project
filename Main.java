
import java.util.Scanner;
public class Main {

	public static int menuinicial(Cuenta c1, Alquiler[] a){
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int n=1;
		do{
			//Try catch para evitar que el programa termine si hay un error
				System.out.println("Elige opción:\n1. Admin" +
						"\n2. Cliente"+"\n3. Exit"); 
				//Recoger una variable por consola
				n = Integer.parseInt(scanner.nextLine()); 
				int contraseña=123456;
				//Ejemplo de switch case en Java
				switch(n){
				case 1: 
					System.out.println("Introdueix la contrasenya");
					int contr=Integer.parseInt(scanner2.nextLine());
					if (contr==contraseña){
						System.out.println("contrasenya correcta");
					menuadmin(c1,a);}
					else 
						System.out.println("contrasenya incorrecta");
					break;
				case 2: 
					//menuclient
					System.out.println();
					break;
				case 3: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Introduzca una opción válida");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
		}while(n != 3);
		scanner.close();
		scanner2.close();
		return n;
	}
	public static int menuadmin(Cuenta c1, Alquiler[] a){
		Scanner scanner = new Scanner(System.in);
		int n=1;
		int m;
		do{
				System.out.println("Elige opción:\n1. Ver saldo de cuenta " +
						"\n2. Añadir saldo a la cuenta "+"\n3. Recibir alquiler"
						+"\n4. Hacer compra"+"\n5. Hacer venta"
						+"\n6. Vuelve al menú previo"); 
				//Recoger una variable por consola
				n = Integer.parseInt(scanner.nextLine()); 
				//Ejemplo de switch case en Java
				switch(n){
				case 1: 
					c1.__getSaldo();
					break;
				case 2: 
					System.out.println("Cantidad de saldo a añadir: ");
					m=Integer.parseInt(scanner.nextLine()); 
					c1.__setSaldo(m);
					break;
				case 3: 
					Moto_carretera m1= new Moto_carretera();
					for (int i=0; i<a.length;i++){
						a[i].calculaprecio(m1);
						c1.recibiralquiler(a[i]);
					}
				case 4: 
					
					break;
				case 5: 
					//menuclient
					System.out.println();
					break;
				case 6: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Introduzca una opción válida");break;
				}
				
				System.out.println("\n"); //Mostrar un salto de línea en Java
				
		}while(n != 6);
		scanner.close();
		return n;
	}
	public static void main(String[] args) {	
		/*Moto_carretera m1= new Moto_carretera();
		Alquiler a1= new Alquiler();
		a1.calculaprecio(m1);
		System.out.println(a1.__getprecio());
		Cuenta c1= new Cuenta();
		c1.__getSaldo();
		c1.recibiralquiler(a1);
		c1.__getSaldo();*/
		
		Cuenta c1= new Cuenta();
		Moto_carretera m1= new Moto_carretera();
		Alquiler[] alquileres = new Alquiler[4];
		alquileres[0] = new Alquiler();
		alquileres[1] = new Alquiler();
		alquileres[2] = new Alquiler();
		alquileres[3] = new Alquiler();
		//alquileres[0].setpreualq(m1.__getprecioalq());
		
		menuinicial(c1,alquileres);
		//Moto_carretera m1= new Moto_carretera();
		Moto_montaña m2= new Moto_montaña();
		Moto_nieve m3= new Moto_nieve();
		m1.muestracaracteristicas();
		m2.muestracaracteristicas();
		m3.muestracaracteristicas();
		c1.__setSaldo(15000);
		c1.__getSaldo();
		//Alquiler a1= new Alquiler();
		//a1.setpreualq(m1.__getprecioalq());
		//c1.recibiralquiler(a1.calculaprecio());
		c1.__getSaldo();
		
			}

}

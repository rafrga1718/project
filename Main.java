
import java.util.Arrays;

import java.util.Scanner;
public class Main {

	public static void menuinicial(Cuenta c1, Alquiler[] a, vehículo[] b, vehículo[] valq, Venta v){
		
		int n=1;
		do{
			Scanner scanner = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
				String saltoDeLinea = scanner.nextLine();
				System.out.println("Elige opción:\n1. Admin" +
						"\n2. Cliente"+"\n3. Exit"); 
				n=1;
				n = scanner.nextInt(); 
				int contraseña=123456;
				switch(n){
				case 1: 
					System.out.println("Introdueix la contrasenya");
					int contr=Integer.parseInt(scanner2.nextLine());
					if (contr==contraseña){
						System.out.println("contrasenya correcta");
					menuadmin(c1,a,b,valq, v);}
					else 
						System.out.println("contrasenya incorrecta");
					scanner.close();
					scanner2.close();
					break;
				case 2: 
					menuuser(b,a,valq);
					System.out.println();
					scanner.close();
					scanner2.close();
					break;
				case 3: 
					System.out.println("Adios!");
					scanner.close();
					scanner2.close();
					break;
				default:
					System.out.println("Introduzca una opción válida");
					scanner.close();
					scanner2.close();
					break;
				}
				
				System.out.println("\n"); 
				
		}while(n != 3);
		
	}
	public static void menuadmin(Cuenta c1, Alquiler[] a, vehículo[] b, vehículo[] valq, Venta v){
		Scanner scanner = new Scanner(System.in);
		int n=1;
		int m;
		do{
				System.out.println("Elige opción:\n1. Ver saldo de cuenta " +
						"\n2. Añadir saldo a la cuenta "+"\n3. Recibir alquiler"
						+"\n4. Hacer compra"+"\n5. Hacer venta"
						+"\n6. Vuelve al menú previo"); 
				n = Integer.parseInt(scanner.nextLine()); 
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
					for (int i=0; i<a.length;i++){
						c1.recibiralquiler(a[i]);
						if (valq[i]!=null){
						b[i]=valq[i];
						valq[i]=null;
						}
					}
				case 4: 
					System.out.println("Que tipo de vehículo quieres comprar? \n1. Coche " +
						"\n2. Furgoneta "+"\n3. Quad"
						+"\n4. Moto_carretera"+"\n5. Moto_montaña"
						+"\n6. Moto_nieve"+"\n7. Volver al menú previo");
					m = scanner.nextInt();
					switch (m){
					case 1:
						if(b[6]==null){
							b[6]= new Coches();
							b[6].__setdata();
						}
						else if (b[7]==null){
							b[7]= new Coches();
							b[7].__setdata();
						}
						else
							System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
						break;
					case 2:
						break;
					case 3: 
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					}
					
					break;
				case 5: 
					System.out.println("Que vehículo quieres vender? introduce el número " +
							"que hace referencia a la posición del elemento");
					System.out.println(Arrays.asList(b));
					m=scanner.nextInt();
					m=m-1;
					if(b[m]!=null){
					b[m].__setvendido();
					if (b[m].vendido){
					 System.out.println("está vendido");
						v.__setprecio(b[m]);
						System.out.println(v.__getprecio());
						b[m]=null;
						c1.hacer_Venta(v);
						System.out.println("S'ha realitzat la venta");
						System.out.println(Arrays.asList(b));
					}
					}
					else 
						System.out.println("Introduce una opción válida ");
					break;
				case 6: 
					System.out.println("Adios!");
					break;
				default:
					System.out.println("Introduzca una opción válida");break;
				}
				
				System.out.println("\n"); 
				
		}while(n != 6);
		scanner.close();
	}
	public static void menuuser(vehículo[] b,Alquiler[] a, vehículo[] valq){
	Scanner scanner = new Scanner(System.in);
	int n=1,m=1;
	do{
			System.out.println("Elige opción:\n1. Alquila" +
					"\n2. Exit"); 
			n = Integer.parseInt(scanner.nextLine()); 
			switch(n){
			case 1: 
				System.out.println("Que vehículo quieres alquilar? introduce el número " +
						"que hace referencia a la posición del elemento");
				System.out.println(Arrays.asList(b));
				m=Integer.parseInt(scanner.nextLine());
				m=m-1;
				b[m].__setalquilat();
				if (b[m].alquilado){
					a[m]= new Alquiler();
					valq[m]=b[m];
					System.out.println("Introdueix el temps que tindràs alquilat el vehícle en dies: ");
					int time=Integer.parseInt(scanner.nextLine());
					a[m].__settime(time);
					a[m].calculaprecio(b[m]);
					b[m]=null;
					System.out.println("S'ha realitzat l'alquiler");
					System.out.println(Arrays.asList(b));
					System.out.println(Arrays.asList(valq));
					
				}
				
				break;
			case 2: 
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Introduzca una opción válida");break;
			}
			
			System.out.println("\n");
			
	}while(n != 2);
	scanner.close();
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
		Alquiler[] alquileres= new Alquiler[8];
		vehículo[] vehículos = new vehículo[8];
		vehículo[] valquilado =new vehículo[8];
		vehículos[0] = new Coches();
		vehículos[1] = new Furgonetas();
		vehículos[2] = new Quad();
		vehículos[3] = new Moto_carretera();
		vehículos[4] = new Moto_montaña();
		vehículos[5] = new Moto_nieve();
		vehículos[0].__setalquilat();
		valquilado[0]=vehículos[0];
		Venta v1= new Venta();
		System.out.println(Arrays.asList(vehículos));
		/*if (vehículos[0].alquilado){
			Alquiler a2= new Alquiler();
			a2.__settime(5);
			a2.calculaprecio(vehículos[0]);
			vehículos[0]=null;
			System.out.println(Arrays.asList(vehículos));
			System.out.println(Arrays.asList(valquilado));
			for (int i=0; i<alquileres.length;i++){
				c1.recibiralquiler(a2);
				if (valquilado[i]!=null){
				vehículos[i]=valquilado[i];
				valquilado[i]=null;
				}
			}
				c1.__getSaldo();
				System.out.println(Arrays.asList(vehículos));
				System.out.println(Arrays.asList(valquilado));
		
		}*/
		/*Alquiler[] alquileres = new Alquiler[6];
		for (int i=100, j=0; j<vehículos.length;i+=20,j++){
			vehículos[j].__setprecioalq(i);
			System.out.println(vehículos[j]);
		}
		vehículos[0].__setalquilat();
		if (vehículos[0].__getalquilat())
			System.out.println("está alquilado");
		else 
			System.out.println("no está alquilado");*/
		
		/*Alquiler[] alquileres = new Alquiler[6];
		alquileres[0] = new Alquiler();
		alquileres[1] = new Alquiler();
		alquileres[2] = new Alquiler();
		alquileres[3] = new Alquiler();
		//alquileres[0].setpreualq(m1.__getprecioalq());*/
		
		menuinicial(c1,alquileres,vehículos,valquilado,v1);
		//Moto_carretera m1= new Moto_carretera();
		/*Moto_montaña m2= new Moto_montaña();
		Moto_nieve m3= new Moto_nieve();
		m1.muestracaracteristicas();
		m2.muestracaracteristicas();
		m3.muestracaracteristicas();
		c1.__setSaldo(15000);
		c1.__getSaldo();
		//Alquiler a1= new Alquiler();
		//a1.setpreualq(m1.__getprecioalq());
		//c1.recibiralquiler(a1.calculaprecio());
		c1.__getSaldo();*/
		
		
			}

}

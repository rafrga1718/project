
import java.util.Arrays;

import java.util.Scanner;
public class Main {

		public static void menuinicial(Cuenta c1, Alquiler[] a, vehículo[] b, vehículo[] valq, Venta v,Admin ad,Usuario[] u){
			Scanner scanner = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			int n=1;
			do{
					System.out.println("Elige opción:\n1. Admin" +
							"\n2. Cliente"+"\n3. Exit"); 
					n=1;
					n = Integer.parseInt(scanner.nextLine()); 
					switch(n){
					case 1: 
						System.out.println("Introdueix la contrasenya");
						int contr=Integer.parseInt(scanner2.nextLine());
						if (contr==ad.password){
							System.out.println("contrasenya correcta");
						menuadmin(c1,a,b,valq, v,u);}
						else 
							System.out.println("contrasenya incorrecta");
						break;
					case 2: 
						menuuser(b,a,valq,u);
						System.out.println();
						break;
					case 3: 
						System.out.println("Adios!");
						break;
					default:
						System.out.println("Introduzca una opción válida");
						break;
					}
					
					System.out.println("\n"); 
					
			}while(n != 3);
		}
		public static void menuadmin(Cuenta c1, Alquiler[] a, vehículo[] b, vehículo[] valq, Venta v,Usuario[] u){
			Scanner s1 = new Scanner(System.in);
			Scanner s2 = new Scanner(System.in);
			int n=1;
			int m;
			do{
					System.out.println("Elige opción:\n1. Ver saldo de cuenta " +
							"\n2. Añadir saldo a la cuenta "+"\n3. Recibir alquiler"
							+"\n4. Hacer compra"+"\n5. Hacer venta"
							+"\n6. Vuelve al menú previo"+"\n7. Ver alquileres"+"\n8. Ver gasto de los usuarios"); 
					n = Integer.parseInt(s1.nextLine()); 
					switch(n){
					case 1: 
						c1.__getSaldo();
						break;
					case 2: 
						System.out.println("Cantidad de saldo a añadir: ");
						m=Integer.parseInt(s2.nextLine()); 
						c1.__setSaldo(m);
						break;
					case 3: 
						for (int i=0; i<a.length;i++){
							if (valq[i]!=null){
							c1.recibiralquiler(a[i]);
							b[i]=valq[i];
							valq[i]=null;
							a[i]=null;
							}
						}
						break;
					case 4: 
						System.out.println("Que tipo de vehículo quieres comprar? \n1. Coche " +
							"\n2. Furgoneta "+"\n3. Quad"
							+"\n4. Moto_carretera"+"\n5. Moto_montaña"
							+"\n6. Moto_nieve"+"\n7. Volver al menú previo");
						m = s2.nextInt();
						switch (m){
						case 1:
							if(b[6]==null){
								b[6]= new Coches();
								b[6].__setdata();
								if (b[6].__getprecio()>c1.__getsaldo()){
									b[6]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[6].__getprecio());
							}
							else if (b[7]==null){
								b[7]= new Coches();
								b[7].__setdata();
								if (b[7].__getprecio()>c1.__getsaldo()){
									b[7]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[7].__getprecio());

							}
							else
								System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
							break;
						case 2:
							if(b[6]==null){
								b[6]= new Furgonetas();
								b[6].__setdata();
								if (b[6].__getprecio()>c1.__getsaldo()){
									b[6]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[6].__getprecio());

							}
							else if (b[7]==null){
								b[7]= new Furgonetas();
								b[7].__setdata();
								if (b[7].__getprecio()>c1.__getsaldo()){
									b[7]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[7].__getprecio());

							}
							else
								System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
							break;
						case 3: 
							if(b[6]==null){
								b[6]= new Quad();
								b[6].__setdata();
								if (b[6].__getprecio()>c1.__getsaldo()){
									b[6]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[6].__getprecio());

							}
							else if (b[7]==null){
								b[7]= new Quad();
								b[7].__setdata();
								if (b[7].__getprecio()>c1.__getsaldo()){
									b[7]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[7].__getprecio());
							}
							else
								System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
							break;
						case 4:
							if(b[6]==null){
								b[6]= new Moto_carretera();
								b[6].__setdata();
								if (b[6].__getprecio()>c1.__getsaldo()){
									b[6]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[6].__getprecio());

							}
							else if (b[7]==null){
								b[7]= new Moto_carretera();
								b[7].__setdata();
								if (b[7].__getprecio()>c1.__getsaldo()){
									b[7]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[7].__getprecio());

							}
							else
								System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
							break;
						case 5:
							if(b[6]==null){
								b[6]= new Moto_montaña();
								b[6].__setdata();
								if (b[6].__getprecio()>c1.__getsaldo()){
									b[6]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[6].__getprecio());

							}
							else if (b[7]==null){
								b[7]= new Moto_montaña();
								b[7].__setdata();
								if (b[7].__getprecio()>c1.__getsaldo()){
									b[7]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[7].__getprecio());

							}
							else
								System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
							break;
						case 6:
							if(b[6]==null){
								b[6]= new Moto_nieve();
								b[6].__setdata();
								if (b[6].__getprecio()>c1.__getsaldo()){
									b[6]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[6].__getprecio());

							}
							else if (b[7]==null){
								b[7]= new Moto_nieve();
								b[7].__setdata();
								if (b[7].__getprecio()>c1.__getsaldo()){
									b[7]=null;
									System.out.println("No tienes dinero suficiente en tu cuenta");
								}
								else
									c1.hacer_compra(b[7].__getprecio());
							}
							else
								System.out.println("Has llegado al número máximo de vehículos extra que caben en el almacén");
							break;
						case 7:
							break;
						}
						
						break;
					case 5: 
						System.out.println("Que vehículo quieres vender? introduce el número " +
								"que hace referencia a la posición del elemento");
						System.out.println(Arrays.asList(b));
						m=s2.nextInt();
						m=m-1;
						if(b[m]!=null){
						if (b[m]!=null){
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
					case 7:
						System.out.println(Arrays.asList(b));
						System.out.println(Arrays.asList(valq));
						System.out.println(Arrays.asList(a));
						break;
					case 8:
						for (int i=0;i<u.length && u[i]!=null ;i++){
							System.out.print(u[i].nombre+" ha gastado: ");
							System.out.println(u[i].__getdinero_Gastado()+"€");
						}
					default:
						System.out.println("Introduzca una opción válida");break;
					}
					
					System.out.println("\n"); 
					
			}while(n != 6);
		}
		public static void menuuser(vehículo[] b,Alquiler[] a, vehículo[] valq,Usuario[] u){
		Scanner s3 = new Scanner(System.in);
		String email="e";
		int i=1,j,k=0;
		do{
			System.out.println("Elige opción:\n1. Registro" +
					"\n2. Entra"+"\n3. Vuelve al menú principal");
			k = Integer.parseInt(s3.nextLine());
			switch(k){
			case 1:
				int n;
				System.out.println("Hola, procedamos a hacer el registro ");
				for (n=0; n<u.length && u[n]!=null; n++){
				}
				if (n<u.length){
					u[n]= new Usuario();
					u[n].__setdata();
				}
				else
					System.out.println("El registro de usuarios está lleno");
				System.out.println(Arrays.asList(u));
				break;
			case 2:
				System.out.println("Introduce tu email ");
				i=1;
				while(i!=0){
					email= s3.nextLine();

					for(j=0;j<u.length && u[j]!=null && !email.equals(u[j].email);j++){
					}
					if(u[j]!=null && email.equals(u[j].email)){
						System.out.println("Bienvenido "+u[j].nombre);
						i=0;
						menuuser2(b,a,valq,u,j);
					}
					else 
						System.out.println("Usuario incorrecto, introduzca su email ");
					}
				break;
			case 3:
				break;
			default:
				System.out.println("Introduzca una opción válida");break;
			}
		}while(k!=3);
}

	public static void menuuser2(vehículo[] b,Alquiler[] a, vehículo[] valq,Usuario[] u, int j){
		Scanner s4 = new Scanner(System.in);
		int n=1,m=1;
		do{
			System.out.println("Elige opción:\n1. Alquila" +
					"\n2. Ver gastos"+"\n3. Exit"); 
			n = Integer.parseInt(s4.nextLine()); 
			switch(n){
			case 1: 
				System.out.println("Que vehículo quieres alquilar? introduce el número " +
						"que hace referencia a la posición del elemento");
				System.out.println(Arrays.asList(b));
				m=Integer.parseInt(s4.nextLine());
				m=m-1;
				if (b[m]!=null){
					a[m]= new Alquiler();
					valq[m]=b[m];
					System.out.println("Introdueix el temps que tindràs alquilat el vehícle en dies: ");
					int time=Integer.parseInt(s4.nextLine());
					a[m].__settime(time);
					a[m].calculaprecio(b[m]);
					u[j].__setdinero_Gastado(a[m].precio);
					b[m]=null;
					System.out.println("S'ha realitzat l'alquiler");
					System.out.println(Arrays.asList(b));
					System.out.println(Arrays.asList(valq));
					System.out.println(Arrays.asList(a));
				}
				else 
					System.out.println("El vehículo solicitado ya ha sido alquilado o no existe.");
				
				break;
			case 2: 
				System.out.println(u[j].__getdinero_Gastado());
				break;
			case 3: 
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Introduzca una opción válida");break;
			}
			
			System.out.println("\n");
			
	}while(n != 3);
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
		//que l'administrador assigni vip oo no vip, que pugui veure el rànquing de clients depenent dels diner gastat
		//i que l'administrador pugui veure l'historial de cada client (intface comparable)
		//que es puguin generar extractos segons la data i els diners gastats.Que muestre las fechas y el precio.
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
		//vehículos[0].__setalquilat();
		Venta v1= new Venta();
		Admin admin= new Admin();
		Usuario[] usuarios = new Usuario[10];
		//System.out.println(Arrays.asList(vehículos));
		//Quad q1= new Quad();
		//System.out.println(q1.__toString());
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
		
		menuinicial(c1,alquileres,vehículos,valquilado,v1,admin,usuarios);
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

package menus;
import java.util.Arrays;
import java.util.Scanner;

public class menus {
	public static void menuinicial(Cuenta c1, Alquiler[] a, vehículo[] b, vehículo[] valq, Venta v){
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int n=1;
		do{
				System.out.println("Elige opción:\n1. Admin" +
						"\n2. Cliente"+"\n3. Exit"); 
				n=1;
				n = Integer.parseInt(scanner.nextLine()); 
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
					break;
				case 2: 
					menuuser(b,a,valq);
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
	public static void menuadmin(Cuenta c1, Alquiler[] a, vehículo[] b, vehículo[] valq, Venta v){
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		int n=1;
		int m;
		do{
				System.out.println("Elige opción:\n1. Ver saldo de cuenta " +
						"\n2. Añadir saldo a la cuenta "+"\n3. Recibir alquiler"
						+"\n4. Hacer compra"+"\n5. Hacer venta"
						+"\n6. Vuelve al menú previo"+"\n7. Ver alquileres"); 
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
				default:
					System.out.println("Introduzca una opción válida");break;
				}
				
				System.out.println("\n"); 
				
		}while(n != 6);
	}
	public static void menuuser(vehículo[] b,Alquiler[] a, vehículo[] valq){
	Scanner s3 = new Scanner(System.in);
	Scanner s4 = new Scanner(System.in);
	int n=1,m=1;
	do{
			System.out.println("Elige opción:\n1. Alquila" +
					"\n2. Exit"); 
			n = Integer.parseInt(s3.nextLine()); 
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
				System.out.println("Adios!");
				break;
			default:
				System.out.println("Introduzca una opción válida");break;
			}
			
			System.out.println("\n");
			
	}while(n != 2);
}
}

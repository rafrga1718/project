import java.util.Scanner;


public class Usuario extends Persona {
	public int id;
	public float dinero_gastado;
	public Usuario(){
		super();
		this.id=1;
		this.dinero_gastado=0;
	}
	public void __setdata() {
		Scanner data = new Scanner(System.in);
		System.out.println("Introduce tu email");
		this.email=data.nextLine();
		System.out.println("Introduce tu id");
		this.id=data.nextInt();
		data.nextLine();
		System.out.println("Introduce tu nombre");
		this.nombre=data.nextLine();
		
	}
	public void __setdinero_Gastado(float n){
		this.dinero_gastado=this.dinero_gastado+n;
	}
	public float __getdinero_Gastado(){
		return this.dinero_gastado;
	}
	public String __get_email(){
		return this.email;
	}

}

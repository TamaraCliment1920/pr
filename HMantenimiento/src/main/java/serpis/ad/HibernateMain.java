package serpis.ad;

import java.util.Scanner;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tcl=new Scanner(System.in);
		System.out.println("Bienvenido");
		System.out.println("¿Que vamos a Gestionar?");
		System.out.println("1-Clientes");
		System.out.println("2-Pedidos");
		int op=tcl.nextInt();
		if (op==1) {
			System.out.println("Bienvenido a la Gestion de Clientes");
		}
		if (op==2) {
			System.out.println("Bienvenido a la Gestion de Pedidos");
		}
	}

}

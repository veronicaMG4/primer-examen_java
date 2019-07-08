import java.util.Scanner;

public class RevistaMain {

	// MENU OPCIONES

	final static int OPCION_LISTAR =1;
	final static int OPCION_GUARDAR =2;
	final static int OPCION_SALIR =0;

	static int opcionSeleccionada;
	static Scanner sc;
	
	
	public static void main(String[] args) {
		
		
		//dos revistas de ejemplo
		Revista r1 = new Revista("Corazon", 897325641, 54, true);
		Revista r2 = new Revista("Super Pop", 546879231, 100, true);
		Revista r3 = new Revista();
	
	

		
		sc = new Scanner(System.in);

		//

		do {//repite mientras la opcion NO es salir

			
			pintarMenuYpedirOpcion();
			System.out.println("La opcion elegida es:" + opcionSeleccionada);

			// opcionSeleccionada = Integer.parseInt(sc.nextLine());

			switch (opcionSeleccionada) {
			case OPCION_LISTAR:

				r1.mostrarDatos();
				r2.mostrarDatos();
				System.out.println(r1.toString());
				System.out.println(r2.formato());
				
			
		
				break;

			case OPCION_GUARDAR:
				System.out.println("***VAMOS A GUARDAR DATOS***");
				guardarDatos();

				break;

			default:
				break;
			}

		} while (opcionSeleccionada != OPCION_SALIR);

		System.out.println("Agur Venur");

		sc.close();

		// ________________________________________________________________________________

	}// main

	// METODOS
	public static void guardarDatos() {
		//Scanner sc = new Scanner(System.in);
		;
		String scTitulo = null;
		int scIsbn = 0;
		int scPaginas = 0;
		String scformato;
		
		boolean pregunta = true;
		boolean formato = false;
		
		Revista r4 = new Revista();

		// Revista r1 = new Revista("corazon", 123456789, 35, true);
		//Revista r2 = new Revista(scTitulo, scIsbn, scPaginas, true);

		System.out.println("A continuacion guardaremos los datos de la Revista");

		while (pregunta) {

			// try1
			try {

				System.out.println("Introduzca titulo");

				scTitulo = sc.nextLine();
				System.out.println("TITULO" + scTitulo);
				
				r4.setTitulo(scTitulo);
			
				
				
				pregunta = false;
			} catch (Exception e) {
				System.out.println("Error");
				System.out.println("vuelva a introducir los datosssssssssssssssssss");

			}
		} // while
		pregunta = true;
		while (pregunta) {

			// try2
			try {

				System.out.println("Introduzca isbn");
				scIsbn = Integer.parseInt(sc.nextLine());
				r4.setIsbn(scIsbn);
				pregunta = false;
				System.out.println("ISBN:" + scIsbn);
			} catch (Exception d) {
				System.out.println("formato erroneo");
				pregunta = true;
				// sc.close();

			}
		} // while 2

		pregunta = true;
		while (pregunta) {
			try {
				System.out.println("Introduzca numpaginas");
				scPaginas = Integer.parseInt(sc.nextLine());
				r4.setNumPaginas(scPaginas);
				System.out.println("NUMERO DE PAGINAS:" + scPaginas);
				pregunta = false;

			} catch (Exception f) {
				System.out.println("el  numero de paginas no es correcto");
				pregunta = true;
			}
		}

		pregunta = true;
		while (pregunta) {
			try {
				System.out.println("Introduzca formato(p=papel, d=digital)");
				scformato = sc.nextLine();
				
				if ("d".equals(scformato)) {
					formato = r4.setFormato(true);
					System.out.println("se ha metido en didital");
				} else if ("p".equals(scformato)) {
					r4.setFormato(false);
					formato = r4.setFormato(false);
					System.out.println("se ha metido en papel");

				}
				System.out.println("el formato es" + scformato);
				pregunta = false;

			} catch (Exception f) {
				System.out.println("******ERROR******el formato *NO* es correcto");
				pregunta = true;
			}
			
		}
		
		r4 = new Revista(scTitulo, scIsbn, scPaginas,formato);
		 r4.mostrarDatos();
		 System.out.println(r4.toString());

	}
	

	// _______________________________________________________________________________________

	// __________________________________________________________________________________

	private static void pintarMenuYpedirOpcion() {
		System.out.println("-------------------------------");
		System.out.println("GESTIONAR REVISTAS");
		System.out.println("-------------------------------");
		System.out.println("1 Listar");
		System.out.println("2 Guardar");
		System.out.println("-------------------------------");
		System.out.println(" 0 para salir");
		System.out.println("-------------------------------");
		System.out.println("");
		System.out.println("Dime tu opcion.....");

		try {

			
			opcionSeleccionada = Integer.parseInt(sc.nextLine());
			System.out.println("La opcion essssssssss"+opcionSeleccionada);

		} catch (Exception e) {
			System.out.println("*** opcion no posible **** ");

			pintarMenuYpedirOpcion();

		}

	}// pintarMenuYpedirOpcion

}// class

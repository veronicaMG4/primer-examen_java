
public class Revista {

	private static final String ERROR_TITULO = "entre 150 y3";
	
	// ATRIBUTOS
	private String titulo;// tamaño mínimo 3 letras, máximo 150
	private int isbn;// número de longitud 10
	private int numPaginas;//Número de Páginas, mínimo 1
	private boolean formato;//digital o papel
	
	
	public int MAX_TITULO=150;
	public int MIN_TITULO=3;
	public int LONG_ISBN=10;
	private static final int MIN_PAGINAS = 1;

	// boolean

	// CONSTRUCTOR

	public Revista(String titulo, int isbn, int numPaginas, boolean formato) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.numPaginas = numPaginas;
		this.formato = formato;

	}// constructor
	
	
	//constructo desde la super clase, me permite no inicializar el constructor en el RevistaMain
	public Revista() {
		super();
		// TODO Auto-generated constructor stub
	}




	// GETTERS Y SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) throws Exception {
		if (titulo!= null && titulo.length()> MIN_TITULO && titulo.length()< MAX_TITULO) {
			this.titulo = titulo;
			
		}else {
			throw new Exception ("Este mensaje no sale");
		}
		
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) throws Exception {
		this.isbn = isbn;
		
		if (String.valueOf(isbn).length() == LONG_ISBN) {
			
		}else {
			throw new Exception("Introduzca 10 cifras");
			
		}
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) throws Exception {
		this.numPaginas = numPaginas;
		
		if (numPaginas >= MIN_PAGINAS) {
			this.numPaginas = numPaginas;
		} else {
			throw new Exception("Número mínimo de Páginas  es " + MIN_PAGINAS);
		}
	}

	public boolean isFormato() {
		return formato;
	}

	public boolean setFormato(boolean formato) {
		return this.formato = formato;
	}

	// me falta el tostring
	
	@Override
	public String toString() {
		return "Revista [titulo=" + titulo + ", isbn=" + isbn + ", numPaginas=" + numPaginas + ", formato=" + formato
				+ "]";
	}

	
	

	// METODOS

	public void mostrarDatos() {

		System.out.println(
				"NOMBRE REVISTA: " + titulo + "ISBN:" + isbn + "  NUMPAGINAS:" + numPaginas + "FORMATO:" + formato);

	}

	


public boolean formato() {
		
	
		return formato;

		
	}

}// class

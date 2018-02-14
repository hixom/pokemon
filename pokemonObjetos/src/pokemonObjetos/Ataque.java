package pokemonObjetos;
import java.util.Scanner;
public class Ataque {
	private String nombre;
	private String tipo;
	private String categoria;
	private int potencia, precision, pp;
	private String[] pokemonPuedeUsarlo;
	private String[] efectosOtro;
	public Scanner sc = new Scanner (System.in);
	private String AQuienAfecta;
	
	
	
	public Ataque() {
		nombre="a";
		tipo="a"; 
		categoria="a";
		potencia=0;
		precision=0; 
		pp=0;
		pokemonPuedeUsarlo=new String[1];
		efectosOtro=new String[1];
		pokemonPuedeUsarlo[0]="a";
		efectosOtro[0]="a";
			
		
	}
	public Ataque(String nombre,String tipo, String categoria, int potencia, int precision, int pp, String[] pokemonPuedeUsarlo, String[] efectosOtro,String AQuienAfecta){
		this.pokemonPuedeUsarlo=new String[pokemonPuedeUsarlo.length];
		this.efectosOtro=new String[efectosOtro.length];
		this.nombre=nombre;
		this.tipo=tipo; 
		this.categoria=categoria;
		this.potencia=potencia;
		this.precision=precision; 
		this.pp=pp;
		for(int i=0;i<pokemonPuedeUsarlo.length;i++){
			
			this.pokemonPuedeUsarlo[i]=pokemonPuedeUsarlo[i];
			
		}
		for(int i=0;i<efectosOtro.length;i++){
			
			this.efectosOtro[i]=efectosOtro[i];
			
		}
		
	}
	public void copia(Ataque ataque) {
		this.nombre=ataque.getNombre();
		this.tipo=ataque.getTipo();
		this.categoria=ataque.getCategoria();
		this.potencia=ataque.getPotencia();
		this.precision=ataque.getPrecision();
		this.pp=ataque.getPp();
		this.pokemonPuedeUsarlo=ataque.getPokemonPuedeUsarlo(); 
		this.efectosOtro=ataque.getEfectosOtro();
	}
	public String[] getEfectosOtro() {
		return efectosOtro;
	}
	
	public String getAQuienAfecta() {
		return AQuienAfecta;
	}
	public void setAQuienAfecta(String aQuienAfecta) {
		AQuienAfecta = aQuienAfecta;
	}
	
	
	
	
	public String[] getPokemonPuedeUsarlo() {
		return pokemonPuedeUsarlo;
	}
	

//	le das un ataque y te dice uno de los pokemon que lo pueda usar
	public String getNombrePokemonValido(int i) {
		return pokemonPuedeUsarlo[i];
	}


	public String getNombre() {
		return nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public int getPotencia() {
		return potencia;
	}


	public int getPrecision() {
		return precision;
	}


	public int getPp() {
		return pp;
	}
	public void pasarTurno(){
		if(pp>0) {
			pp--;
		}
	}


	


	public String getTipo() {
		return tipo;
	}
	
	
}
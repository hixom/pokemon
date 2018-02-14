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
	private Ataque[] listaAtaques;
	
	private int vidaARestar;
	private int variacion;
	private float efectividad;
	private int statAtaque;
	private float stab;
	private String AQuienAfecta;
	
	public Ataque() {
		nombre="";
		tipo=""; 
		categoria="";
		potencia=0;
		precision=0; 
		pp=0;	
		pokemonPuedeUsarlo[0]="";
		efectosOtro[0]=efectosOtro[0];
			
		
	}
	public Ataque(String nombre,String tipo, String categoria, int potencia, int precision, int pp, String[] pokemonPuedeUsarlo, String[] efectosOtro,String AQuienAfecta){
	
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
	public String getAQuienAfecta() {
		return AQuienAfecta;
	}
	public void setAQuienAfecta(String aQuienAfecta) {
		AQuienAfecta = aQuienAfecta;
	}
	
	public void elegirAtaque(String nombre, Ataque[] movimientosPokemon, int i){
		boolean exit=false;
		String nombreAtaqueDeseado;
 		Ataque[] listaPosibles;
 		Ataque ataqueDeseado=new Ataque();
 		System.out.println("Estos son los que puedes elegir en base al pokemon que has elegido");
 		listaPosibles=getListaAtaquesPosibles(nombre, movimientosPokemon );
		showListaPosibles(listaPosibles);
		System.out.println("elige el ataque nª"+i+":");
		nombreAtaqueDeseado=sc.nextLine();
		
		for(int j=0; j<listaAtaques.length && !exit ;j++){
			if(nombreAtaqueDeseado.equals(listaAtaques[j].getNombre())){
				ataqueDeseado.copia(j);
				exit=true;
			}
		}
 		
 		
	}
	private void showListaPosibles(Ataque[] lista) {
		
		for(int i=0; i<lista.length;i++){
			String[] listaEfectosOtro=lista[i].getEfectosOtro();
			System.out.println("nombre: "+listaAtaques[i].getNombre());
			System.out.println("El cual tiene las siguientes características:");
			System.out.println("	- tipo: "+listaAtaques[i].getTipo());
			System.out.println("	- categoría: "+listaAtaques[i].getCategoria());
			System.out.println("	- potencia: "+listaAtaques[i].getPotencia());
			System.out.println("	- precision: "+listaAtaques[i].getPrecision());
			System.out.println("	- pp: "+listaAtaques[i].getPp());
			System.out.println("	-efectos secundarios que tiene:");
			for(int j=0; j<lista[i].getEfectosOtro().length;j++){
				System.out.println("		-"+listaEfectosOtro[j]);
			}
			
		}
	}
	private void copia(int i) {
		this.nombre=listaAtaques[i].getNombre();
		this.tipo=listaAtaques[i].getTipo();
		this.categoria=listaAtaques[i].getCategoria();
		this.potencia=listaAtaques[i].getPotencia();
		this.precision=listaAtaques[i].getPrecision();
		this.pp=listaAtaques[i].getPp();
		this.pokemonPuedeUsarlo=listaAtaques[i].getPokemonPuedeUsarlo(); 
		this.efectosOtro=listaAtaques[i].getEfectosOtro();
	}
	public String[] getEfectosOtro() {
		return efectosOtro;
	}
	public Ataque[] getListaAtaquesPosibles(String nombre, Ataque[] ataquesUsados){
		boolean exit=false;
		Ataque[] listaAtaquesPosibles=new Ataque[0];
		for(int i=0;i<listaAtaques.length;i++ ){
//			este segundo for es para comparar cada pokemon que puede realizar cada uno de los ataques
			for(int j=0;j<getAtaqueDeLaListaCompleta(i).getPokemonPuedeUsarlo().length && exit==false;j++ ){
				if (nombre.equals(getAtaqueDeLaListaCompleta(i).getNombrePokemonValido(j))){
					for(int k=0;k<ataquesUsados.length && exit==false;k++) {
						if(!ataquesUsados[k].getNombre().equals(getAtaqueDeLaListaCompleta(i))) {
							listaAtaquesPosibles=new Ataque[i];
							listaAtaquesPosibles[listaAtaquesPosibles.length-1]=getAtaqueDeLaListaCompleta(i);
							exit=true;
						}
						
					}
					
				}
			}
		}
		return listaAtaquesPosibles; 
	}
	
	
	public String[] getPokemonPuedeUsarlo() {
		return pokemonPuedeUsarlo;
	}
	
//		devuelve el ataque numero i de la lista al completo
	public Ataque getAtaqueDeLaListaCompleta(int i) {
		return listaAtaques[i];
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
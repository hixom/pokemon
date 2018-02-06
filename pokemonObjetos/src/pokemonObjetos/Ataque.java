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
	
	public Ataque(String nombre,String tipo, String categoria, int potencia, int precision, int pp, String[] pokemonPuedeUsarlo, String[] efectosOtro){
		
		this.nombre=nombre;
		this.tipo=tipo; 
		this.categoria=categoria;
		this.potencia=potencia;
		this.precision=precision; 
		this.pp=pp;
		for(int i=0;i<pokemonPuedeUsarlo.length;i++){
			
			this.pokemonPuedeUsarlo[i]=pokemonPuedeUsarlo[i];
			
		}
		for(int i=0;i<pokemonPuedeUsarlo.length;i++){
			
			this.pokemonPuedeUsarlo[i]=pokemonPuedeUsarlo[i];
			
		}
		
	}
	public void listaAtaques(){
		
		this.pokemonPuedeUsarlo=new String[1];
		listaAtaques= new Ataque[14];
		pokemonPuedeUsarlo[0]="charizard";
		efectosOtro[0]="quemar";
		listaAtaques[0]=new Ataque("lanzallamas", "fuego", 		"especial", 		90, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[3];
		pokemonPuedeUsarlo[0]="charizard";
		pokemonPuedeUsarlo[1]="venusaur";
		pokemonPuedeUsarlo[2]="blastoise";
		efectosOtro[0]="nada";
		listaAtaques[2]=new Ataque("terremoto", "tierra", 		"fisico", 		100, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="quemar";
		listaAtaques[1]= new Ataque("escaldar", "agua", 		"especial", 		80, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="charizard";
		efectosOtro[0]="ataque";
		efectosOtro[1]="velocidad";
		listaAtaques[3]=new Ataque("danza dragon", "dragon", 		"otro", 		0, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[2];
		pokemonPuedeUsarlo[0]="venusaur";
		pokemonPuedeUsarlo[1]="blastoise";
		efectosOtro[0]="curar";
		listaAtaques[4]= new Ataque("recuperacion", "normal", 		"otro", 		0, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[3];
		pokemonPuedeUsarlo[0]="charizard";
		pokemonPuedeUsarlo[1]="venusaur";
		pokemonPuedeUsarlo[2]="blastoise";
		efectosOtro[0]="proteger";
		listaAtaques[5]= new Ataque("proteccion", "normal", 		"otro", 		0, 		 100, 			20, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[2];
		pokemonPuedeUsarlo[0]="venusaur";
		pokemonPuedeUsarlo[1]="charizard";
		efectosOtro[0]="ataque";
		efectosOtro[1]="ataque";
		listaAtaques[6]= new Ataque("danza espada", "normal", 		"otro", 		0, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[3];
		pokemonPuedeUsarlo[0]="charizard";
		pokemonPuedeUsarlo[1]="venusaur";
		pokemonPuedeUsarlo[2]="blastoise";
		efectosOtro[0]="envenenar grave";
		listaAtaques[7]= new Ataque("toxico", "veneno", 		"otro", 		0, 		 90, 			20, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="congelar";
		listaAtaques[8]= new Ataque("ventisca", "hielo", 		"especial", 		110, 		 70, 			5, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="nada";
		listaAtaques[9]= new Ataque("hidrobomba", "agua", 		"especial", 		110, 		 80, 			5, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="defensa";
		efectosOtro[1]="defensa";
		listaAtaques[10]= new Ataque("defensa ferrea", "acero", 		"otro", 		0, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="nada";
		listaAtaques[11]= new Ataque("fisura", "tierra", 		"fisica", 		999999999, 		 30, 			5, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="venusaur";
		efectosOtro[0]="nada";
		listaAtaques[12]= new Ataque("bomba germen", "planta", 		"fisico", 		80, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		this.pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="venusaur";
		efectosOtro[0]="nada";
		listaAtaques[13]= new Ataque("poder oculto", "roca", 		"especial", 		60, 		 100, 			20, 	 pokemonPuedeUsarlo, efectosOtro  );
		
		
	
	}
//	public String[] getPokemonPuedeUsarlo(){
//		return  pokemonPuedeUsarlo;
//	}
	public Ataque getListaAtaquesPosibles(Pokemon pokemon){
		Ataque[] ListaAtaquesPosibles;
		for(int i=0;i<listaAtaques.length;i++ ){
			if (pokemon.getTipo()== getPokemonPuedeUsarlo()){
				
			}
		}
		return ListaAtaquesPosibles; 
	}
	public String[] getPokemonPuedeUsarlo() {
		return pokemonPuedeUsarlo;
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
	
	public void daño(Pokemon pokemonATQ, Pokemon pokemonDEF ){
	
	//		calculamos si el ataque tiene el 100% de daño o no
			setVariacion();
	//		calculamos si es eficaz o no el ataque contra el pokemon
			getEfectividad(tipo, pokemonDEF.getTipo());
	//		comprobamos si recibe stab el ataque
			if(tipo.equals(pokemonATQ.getTipo())){
				stab=1.5f;
			}else{
				stab=1;
			}
	//		comprobamos si el ataque el por el lado fisico o especial y devolvemos el stat del atacante			
			if (categoria.equals("fisico")){
				statAtaque=pokemonATQ.getAtaque();
			}else{
				statAtaque=pokemonATQ.getAtaqueESP();
			}
	//		calculamos el daño que le vamos a hacer al pokemon defensor y se lo restamos. Fuente de la fï¿½rmula matemï¿½tica ----- http://es.pokemon.wikia.com/wiki/Da%C3%B1o
			vidaARestar=(int)-(0.01*stab*efectividad*variacion*(((0.2*(100+1)*statAtaque*potencia)/(25*pokemonDEF.getDefensa()))+2));
			pokemonDEF.setVida(vidaARestar);

	
	}
private void setVariacion(){
	variacion=(int)(Math.random()*(100-85+1)+(85));
}

private void getEfectividad(String tipoMovimiento, String[] tipoDefensor ){
	float efectividad=1;
	for(int i=0;i<tipoDefensor.length;i++){
		switch(tipoMovimiento){
		case "agua":
			switch(tipoDefensor[i]){
				case "fuego":
					efectividad+=1;
					break;
				case "agua":
					efectividad-=0.5f;
					break;
				case "planta":
					efectividad-=0.5f;
					break;
			}
			break;
		case "planta":
			switch(tipoDefensor[i]){
				case "fuego":
					efectividad-=0.5f;
					break;
				case "agua":
					efectividad+=1;
					break;
				case "planta":
					efectividad-=0.5f;
					break;
				case "volador":
					efectividad-=0.5f;
					break;
			}
			break;
		case "fuego":
			switch(tipoDefensor[i]){
				case "fuego":
					efectividad-=0.5f;
					break;
				case "agua":
					efectividad-=0.5f;
					break;
				case "planta":
					efectividad+=1;
					break;
			}
			break;
		case "hielo":
			switch(tipoDefensor[i]){
				case "fuego":
					efectividad-=0.5f;
					break;
				case "agua":
					efectividad-=0.5f;
					break;
				case "planta":
					efectividad+=1;
					break;
				case "volador":
					efectividad+=1;
					break;
			}
			break;
		case "tierra":
			switch(tipoDefensor[i]){
				case "fuego":
					efectividad+=1;
					break;
				case "agua":
//					se mantiene el mismo valor
					break;
				case "planta":
					efectividad-=0.5f;
					break;
			}
			break;
		case "roca":
			switch(tipoDefensor[i]){
				case "fuego":
					efectividad+=1;
					break;
				case "volador":
					efectividad+=1;
					break;
			}
			break;
}
	
	}
	
	}
}

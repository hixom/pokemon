package pokemonObjetos;
import java.util.Scanner;
public class juego {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Ataque[] lista=new Ataque[13];
		listaAtaques(lista);
		
		System.out.println("player1, vamos a proceder a elegir y crear tu pokemon");
		Pokemon pokemonPlayer1=new Pokemon();
		System.out.println("player2, vamos a proceder a elegir y crear tu pokemon");
		Pokemon pokemonPlayer2=new Pokemon();
		
	}
public static void listaAtaques(Ataque[] listaAtaques){
		String[] pokemonPuedeUsarlo;
		String[] efectosOtro;
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="charizard";
		efectosOtro=new String[1];
		efectosOtro[0]="quemar";
		listaAtaques[0]=new Ataque("lanzallamas", "fuego", 		"especial", 		90, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro, "defensor"  );
		
		pokemonPuedeUsarlo=new String[3];
		pokemonPuedeUsarlo[0]="charizard";
		pokemonPuedeUsarlo[1]="venusaur";
		pokemonPuedeUsarlo[2]="blastoise";
		efectosOtro[0]="nada";
		listaAtaques[2]=new Ataque("terremoto", "tierra", 		"fisico", 		100, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro , "nadie" );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="quemar";
		listaAtaques[1]= new Ataque("escaldar", "agua", 		"especial", 		80, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro , "defensor" );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="charizard";
		efectosOtro=new String[2];
		efectosOtro[0]="ataque";
		efectosOtro[1]="velocidad";
		listaAtaques[3]=new Ataque("danza dragon", "dragon", 		"otro", 		0, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro , "atacante" );
		
		pokemonPuedeUsarlo=new String[2];
		pokemonPuedeUsarlo[0]="venusaur";
		pokemonPuedeUsarlo[1]="blastoise";
		efectosOtro=new String[1];
		efectosOtro[0]="curar";
		listaAtaques[4]= new Ataque("recuperacion", "normal", 		"otro", 		0, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro , "atacante" );
		
		pokemonPuedeUsarlo=new String[3];
		pokemonPuedeUsarlo[0]="charizard";
		pokemonPuedeUsarlo[1]="venusaur";
		pokemonPuedeUsarlo[2]="blastoise";
		efectosOtro[0]="proteger";
		listaAtaques[5]= new Ataque("proteccion", "normal", 		"otro", 		0, 		 100, 			20, 	 pokemonPuedeUsarlo, efectosOtro , "atacante" );
		
		pokemonPuedeUsarlo=new String[2];
		pokemonPuedeUsarlo[0]="venusaur";
		pokemonPuedeUsarlo[1]="charizard";
		efectosOtro=new String[2];
		efectosOtro[0]="ataque";
		efectosOtro[1]="ataque";
		listaAtaques[6]= new Ataque("danza espada", "normal", 		"otro", 		0, 		 100, 			10, 	 pokemonPuedeUsarlo, efectosOtro, "atacante"  );
		
		pokemonPuedeUsarlo=new String[3];
		pokemonPuedeUsarlo[0]="charizard";
		pokemonPuedeUsarlo[1]="venusaur";
		pokemonPuedeUsarlo[2]="blastoise";
		efectosOtro=new String[1];
		efectosOtro[0]="intoxicar";
		listaAtaques[7]= new Ataque("toxico", "veneno", 		"otro", 		0, 		 100, 			20, 	 pokemonPuedeUsarlo, efectosOtro , "defensor" );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="congelar";
		listaAtaques[8]= new Ataque("ventisca", "hielo", 		"especial", 		110, 		 70, 			5, 	 pokemonPuedeUsarlo, efectosOtro , "defensor" );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro[0]="nada";
		listaAtaques[9]= new Ataque("hidrobomba", "agua", 		"especial", 		110, 		 80, 			5, 	 pokemonPuedeUsarlo, efectosOtro, "nadie"  );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro=new String[2];
		efectosOtro[0]="defensa";
		efectosOtro[1]="defensa";
		listaAtaques[10]= new Ataque("defensa ferrea", "acero", 		"otro", 		0, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro , "atacante" );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="blastoise";
		efectosOtro=new String[1];
		efectosOtro[0]="nada";
		listaAtaques[11]= new Ataque("fisura", "tierra", 		"fisica", 		999999999, 		 30, 			5, 	 pokemonPuedeUsarlo, efectosOtro , "nadie" );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="venusaur";
		efectosOtro[0]="nada";
		listaAtaques[12]= new Ataque("bomba germen", "planta", 		"fisico", 		80, 		 100, 			15, 	 pokemonPuedeUsarlo, efectosOtro, "nadie"  );
		
		pokemonPuedeUsarlo=new String[1];
		pokemonPuedeUsarlo[0]="venusaur";
		efectosOtro[0]="nada";
		listaAtaques[13]= new Ataque("poder oculto", "roca", 		"especial", 		60, 		 100, 			20, 	 pokemonPuedeUsarlo, efectosOtro, "nadie"  );
		
		
	
	}
	public static void partida(Pokemon pokemonPlayer1, Pokemon pokemonPlayer2 ) {
		boolean pkmnDebilitado=false;
		int masRapido;
		int turnosDormCongP1=1;
		int turnosDormCongP2=1;
		Pokemon atacaPrimero;
		Pokemon atacaSegundo;
		String playerVeloz;
		String playerLento;
		Ataque ataqueDeseadoP1=new Ataque();
		Ataque ataqueDeseadoP2=new Ataque();
		
		do {
			
			masRapido=masRapido(pokemonPlayer1, pokemonPlayer2);
			if(masRapido==1) {
				playerVeloz="player 1";
				playerLento="player 2";
				atacaPrimero=pokemonPlayer1;
				atacaSegundo=pokemonPlayer2;
				
			}else {
				playerVeloz="player 2";
				playerLento="player 1";
				atacaPrimero=pokemonPlayer2;
				atacaSegundo=pokemonPlayer1;
			}
			
			System.out.println(playerVeloz+" vamos contigo");
			ataqueDeseadoP1=atacaPrimero.elegirAtaque();
			System.out.println(playerLento+" vamos contigo");
			ataqueDeseadoP2=atacaSegundo.elegirAtaque();
			
			
			seCuraONO(atacaPrimero, turnosDormCongP1);
			if (atacaPrimero.getEstado().equals("congelado") || atacaPrimero.getEstado().equals("dormido") ) {
				pkmnDebilitado=atacar(atacaPrimero, atacaSegundo,ataqueDeseadoP1,pkmnDebilitado );
				imprimirVida(atacaSegundo);
			}
			
			if(atacaSegundo.getVida()>0) {
				seCuraONO(atacaSegundo, turnosDormCongP2);
				if (atacaSegundo.getEstado().equals("congelado") || atacaSegundo.getEstado().equals("dormido") ) {
					pkmnDebilitado=atacar(atacaSegundo, atacaPrimero ,ataqueDeseadoP2,pkmnDebilitado );
					imprimirVida(atacaPrimero);	
				}
			}
				
				
			
			pkmnDebilitado=restarVidaSegunEstadoAlterado(atacaPrimero,pkmnDebilitado);
			pkmnDebilitado=restarVidaSegunEstadoAlterado(atacaSegundo,pkmnDebilitado);
		}while (pkmnDebilitado==false);
	}
	public static int seCuraONO(Pokemon pokemon, int turnos) {
		if (pokemon.getEstado().equals("congelado")) {
			if((Math.random()*(100)+1)<=(turnos*10)) {
				pokemon.setEstado("normal");
				System.out.println("El pokemon se ha descongelado");
				turnos=1;
			}else {
				turnos++;
			}
		}
		if ( pokemon.getEstado().equals("dormido") ) {
			if((Math.random()*(100)+1)<=(turnos*33.4)) {
				pokemon.setEstado("normal");
				System.out.println("El pokemon se ha despertado");
				turnos=1;
			}else {
				turnos++;
			}
		} 
		return turnos;
	}
	public static boolean restarVidaSegunEstadoAlterado(Pokemon pokemon, boolean debilitado){
		if (pokemon.getEstado().equals("quemado") || pokemon.getEstado().equals("envenenado")) {
			pokemon.setVida((int)(pokemon.getVidaInicial()*0.16));
			if (pokemon.getVida()<1) {
				debilitado = true;
			}
		}
		return  debilitado;
	}
//	imprime el porcentaje de vida del pokemon le queda un poco grÃ¡ficamente con asteriscos y barras bajas
	public static void imprimirVida(Pokemon pokemon) {
		int aux;
		System.out.println("Vida "+ pokemon.getMote()+":");
		System.out.print(pokemon.getVida()+"ps/:");
		for (int i = 0; i < 100; i++) {
//			si el porcentaje de vida es igual a la variable i, pintamos un asterisco si no la barra
			if(((pokemon.getVidaInicial()*pokemon.getVida())/100)>= i) {
				System.out.print("*");
			}else {
				System.out.print("_");
			}
		}
		System.out.println("/: "+pokemon.getVidaInicial()+"ps");
	}

	public static int masRapido(Pokemon pokemonPlayer1, Pokemon pokemonPlayer2 ) {
			if (pokemonPlayer1.getVelocidad()>pokemonPlayer2.getVelocidad()) {
				return 1;
			}else {
				return 2;
			}
		
	}
	public static boolean atacar(Pokemon pokemonATQ, Pokemon pokemonDEF, Ataque ataque, boolean debilitado) {
		System.out.println(pokemonATQ.getMote()+" usó "+ ataque.getNombre());
//		si la precision es de 80, por ejemplo, y el random da un numero superior a este no ataca
		
		if((Math.random()*(100)+1)<= ataque.getPrecision()){
			if (!ataque.getCategoria().equals("otro")) {
				daño(pokemonATQ, pokemonDEF, ataque);
				if(pokemonDEF.getVida()>0){
//					comprobamos si ademï¿½s tiene algï¿½n efecto secundario 
					if(!ataque.getEfectosOtro().equals("nada") ){
						if((Math.random()*(100)+1)<=15){
							if(ataque.getAQuienAfecta().equals("atacante")){
								otro(ataque.getEfectosOtro(), pokemonATQ);
							}else{
								otro(ataque.getEfectosOtro(), pokemonDEF);
							}
						}
								
					}	
				}else {
					System.out.println(pokemonDEF.getMote()+ " se ha debilitado");
					debilitado=true;
				}

				
			}else {
				otro(ataque.getEfectosOtro(), pokemonDEF);
			}	
		}else{
			System.out.println("El ataque ha fallado.");
		}
		ataque.pasarTurno();
		return debilitado;
	}
	public static void daño(Pokemon pokemonATQ, Pokemon pokemonDEF, Ataque ataque ){
		float stab;
		int statAtaque;
		int vidaARestar;
				
		//		calculamos si es eficaz o no el ataque contra el pokemon
				getEfectividad(ataque.getTipo(), pokemonDEF.getTipo());
		//		comprobamos si recibe stab el ataque
				if(ataque.getTipo().equals(pokemonATQ.getTipo())){
					stab=1.5f;
				}else{
					stab=1;
				}
		//		comprobamos si el ataque el por el lado fisico o especial y devolvemos el stat del atacante			
				if (ataque.getCategoria().equals("fisico")){
					statAtaque=pokemonATQ.getAtaque();
				}else{
					statAtaque=pokemonATQ.getAtaqueESP();
				}
		//		calculamos el daï¿½o que le vamos a hacer al pokemon defensor y se lo restamos. Fuente de la fï¿½rmula matemï¿½tica *---- http://es.pokemon.wikia.com/wiki/Da%C3%B1o
				vidaARestar=(int)-(0.01*stab*getEfectividad(ataque.getTipo(), pokemonDEF.getTipo())*setVariacion()*(((0.2*(100+1)*statAtaque*ataque.getPotencia())/(25*pokemonDEF.getDefensa()))+2));
				pokemonDEF.setVida(vidaARestar);

		
		}
	public static int setVariacion(){
		int variacion;
		return variacion=(int)(Math.random()*(100-85+1)+(85));
	}

	public static float getEfectividad(String tipoMovimiento, String[] tipoDefensor ){
		float efectividad=1;
		for(int i=0;i<tipoDefensor.length;i++){
			switch(tipoMovimiento){
			case "agua":
				switch(tipoDefensor[i]){
					case "fuego":
						efectividad*=2;
						break;
					case "agua":
						efectividad/=0.5f;
						break;
					case "planta":
						efectividad/=0.5f;
						break;
				}
				break;
			case "planta":
				switch(tipoDefensor[i]){
					case "fuego":
						efectividad/=0.5f;
						break;
					case "agua":
						efectividad*=2;
						break;
					case "planta":
						efectividad/=0.5f;
						break;
					case "volador":
						efectividad/=0.5f;
						break;
				}
				break;
			case "fuego":
				switch(tipoDefensor[i]){
					case "fuego":
						efectividad/=0.5f;
						break;
					case "agua":
						efectividad/=0.5f;
						break;
					case "planta":
						efectividad*=2;
						break;
				}
				break;
			case "hielo":
				switch(tipoDefensor[i]){
					case "fuego":
						efectividad/=0.5f;
						break;
					case "agua":
						efectividad/=0.5f;
						break;
					case "planta":
						efectividad*=2;
						break;
					case "volador":
						efectividad*=2;
						break;
				}
				break;
			case "tierra":
				switch(tipoDefensor[i]){
					case "fuego":
						efectividad*=2;
						break;
					case "agua":
//						se mantiene el mismo valor
						break;
					case "planta":
						efectividad/=0.5f;
						break;
				}
				break;
			case "roca":
				switch(tipoDefensor[i]){
					case "fuego":
						efectividad*=2;
						break;
					case "volador":
						efectividad*=2;
						break;
				}
				break;
	}
		
		}
		return efectividad;
		}
	public static void otro(String[] acciones,  Pokemon pokemonAfectado){
		for(int i =0; i< acciones.length;i++){
			switch(acciones[i]){
				case "ataque":
					pokemonAfectado.setAtaque();
					System.out.println("has subido el ataque de "+ pokemonAfectado.getMote() +" hasta "+pokemonAfectado.getAtaque() );
					break;
				case "defensa":
					pokemonAfectado.setDefensa();
					System.out.println("has subido la defensa de "+ pokemonAfectado.getMote() +" hasta "+pokemonAfectado.getDefensa() );
					break;
				case "velocidad":
					pokemonAfectado.setVelocidad();
					System.out.println("has subido la Velocidad de "+ pokemonAfectado.getMote() +" hasta "+pokemonAfectado.getVelocidad() );
					break;
				case "intoxicar":
					pokemonAfectado.setEstado("envenenado");
					System.out.println("has intoxicado a " + pokemonAfectado.getMote());
					break;
				case "quemar":
					pokemonAfectado.setEstado("quemado");
					System.out.println("has quemado a " + pokemonAfectado.getMote());
					break;
				case "dormir":
					pokemonAfectado.setEstado("dormir");
					System.out.println("has dormido a " + pokemonAfectado.getMote());
					break;
				case "congelar":
					String[] tipos=pokemonAfectado.getTipo();
					if(!tipos[0].equals("fuego")) {
						pokemonAfectado.setEstado("congelado");
						System.out.println("has congelado a " + pokemonAfectado.getMote());
					}
					break;	
				case "curar":
					pokemonAfectado.setVida((int)(pokemonAfectado.getVidaInicial()*0.5));
					System.out.println(pokemonAfectado.getMote()+" tiene ahora "+pokemonAfectado.getVida()+" puntos de vida");
					break;
					
			}
		}
	}

}


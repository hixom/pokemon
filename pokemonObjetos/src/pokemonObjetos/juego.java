package pokemonObjetos;
import java.util.Scanner;
public class juego {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("player1, vamos a proceder a elegir y crear tu pokemon");
		Pokemon pokemonPlayer1=new Pokemon();
		System.out.println("player2, vamos a proceder a elegir y crear tu pokemon");
		Pokemon pokemonPlayer2=new Pokemon();
		
	}
	public static void partida(Pokemon pokemonPlayer1, Pokemon pokemonPlayer2 ) {
		boolean pkmnDebilitado=false;
		int masRapido;
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
			
			System.out.println(playerVeloz+" elige el movimiento que quieres hacer");
			ataqueDeseadoP1=atacaPrimero.elegirAtaque();
			System.out.println(playerLento+" elige el movimiento que quieres hacer");
			ataqueDeseadoP2=atacaSegundo.elegirAtaque();
			
			System.out.println(atacaPrimero.getMote()+" us� " ataqueDeseadoP1);
			
			
			
		}while (pkmnDebilitado==false);
	}
	

	public static int masRapido(Pokemon pokemonPlayer1, Pokemon pokemonPlayer2 ) {
			if (pokemonPlayer1.getVelocidad()>pokemonPlayer2.getVelocidad()) {
				return 1;
			}else {
				return 2;
			}
		
	}
	public void atacar(Pokemon pokemonATQ, Pokemon pokemonDEF, Ataque ataque) {
//		si la precision es de 80, por ejemplo, y el random da un numero superior a este no ataca
		if((Math.random()*(100)+1)<= ataque.getPrecision()){
			if (!ataque.getCategoria().equals("otro")) {
				da�o(pokemonATQ, pokemonDEF, ataque);
//				comprobamos si adem�s tiene alg�n efecto secundario 
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
				otro(ataque.getEfectosOtro(), pokemonDEF);
			}
				
			
		}else{
			System.out.println("El ataque ha fallado.");
		}	
	}
	public void da�o(Pokemon pokemonATQ, Pokemon pokemonDEF, Ataque ataque ){
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
		//		calculamos el da�o que le vamos a hacer al pokemon defensor y se lo restamos. Fuente de la f�rmula matem�tica *---- http://es.pokemon.wikia.com/wiki/Da%C3%B1o
				vidaARestar=(int)-(0.01*stab*getEfectividad(ataque.getTipo(), pokemonDEF.getTipo())*setVariacion()*(((0.2*(100+1)*statAtaque*ataque.getPotencia())/(25*pokemonDEF.getDefensa()))+2));
				pokemonDEF.setVida(vidaARestar);

		
		}
	private int setVariacion(){
		int variacion;
		return variacion=(int)(Math.random()*(100-85+1)+(85));
	}

	private float getEfectividad(String tipoMovimiento, String[] tipoDefensor ){
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
					pokemonAfectado.setEstado("congelado");
					System.out.println("has congelado a " + pokemonAfectado.getMote());
					break;	
				case "curar":
					pokemonAfectado.setVida((int)(pokemonAfectado.getVidaInicial()*0.5));
					System.out.println(pokemonAfectado.getMote()+" tiene ahora "+pokemonAfectado.getVida()+" puntos de vida");
					break;
					
			}
		}
	}

}

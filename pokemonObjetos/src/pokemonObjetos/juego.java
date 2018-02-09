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
		if (!ataque.getCategoria().equals("otro")) {
			daño(pokemonATQ, pokemonDEF, ataque);
			if(ataque.getEfectosOtro().length==1 && !ataque.getEfectosOtro().equals("nada") ){
				
			}
		}else {
			
		}
	}
	public void daño(Pokemon pokemonATQ, Pokemon pokemonDEF, Ataque ataque ){
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
		//		calculamos el daño que le vamos a hacer al pokemon defensor y se lo restamos. Fuente de la fñrmula matemñtica ----- http://es.pokemon.wikia.com/wiki/Da%C3%B1o
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
//						se mantiene el mismo valor
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
		return efectividad;
		}

}

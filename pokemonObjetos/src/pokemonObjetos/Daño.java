package pokemonObjetos;

public class Daño {
	private int vidaARestar;
	private int variacion;
	private float efectividad;
	private int statAtaque;
	private float stab;
	
	public Daño(Pokemon pokemonATQ, Pokemon pokemonDEF, Ataque movimiento ){
//			calculamos si el ataque tiene el 100% de daño o no
			setVariacion();
//			calculamos si es eficaz o no el ataque contra el pokemon
			getEfectividad(movimiento.getTipo(), pokemonDEF.getTipo());
//			comprobamos si recibe stab el ataque
			if(movimiento.getTipo().equals(pokemonATQ.getTipo())){
				stab=1.5f;
			}else{
				stab=1;
			}
//			comprobamos si el ataque el por el lado fisico o especial y devolvemos el stat del atacante			
			if (movimiento.getAtaqueOAtaqueESP().equals("fisico")){
				statAtaque=pokemonATQ.getAtaque();
			}else{
				statAtaque=pokemonATQ.getAtaqueESP();
			}
//			calculamos el daño que le vamos a hacer al pokemon defensor y se lo restamos. Fuente de la fórmula matemática ----- http://es.pokemon.wikia.com/wiki/Da%C3%B1o
			vidaARestar=(int)-(0.01*stab*efectividad*variacion*(((0.2*(100+1)*statAtaque*movimiento.getDaño())/(25*pokemonDEF.getDefensa()))+2));
			pokemonDEF.setVida(vidaARestar);
		
	}
	private void setVariacion(){
		variacion=(int)(Math.random()*(100-85+1)+(85));
	}
	
	private void getEfectividad(String tipoMovimiento, String tipoDefensor ){
		float efectividad=1;
		switch(tipoMovimiento){
			case "agua":
				switch(tipoDefensor){
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
				switch(tipoDefensor){
					case "fuego":
						efectividad-=0.5f;
						break;
					case "agua":
						efectividad+=1;
						break;
					case "planta":
						efectividad-=0.5f;
						break;
				}
				break;
			case "fuego":
				switch(tipoDefensor){
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
				switch(tipoDefensor){
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
			case "tierra":
				switch(tipoDefensor){
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
		}
		
	}
	
	
}

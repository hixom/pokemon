package pokemonObjetos;

public class Otro {
//	subir ataque y velocidad
//	recuperar vida
//	intoxicar
//	quemar
//	congelar
//	dormir
	public Otro(String[] acciones,  Pokemon pokemonAfectado){
		for(int i =0; i< acciones.length;i++){
			switch(acciones[i]){
				case "ataque":
					pokemonAfectado.setAtaque();
					break;
				case "defensa":
					pokemonAfectado.setDefensa();
					break;
				case "ataqueESP":
					pokemonAfectado.setAtaqueESP();
					break;
				case "defensaESP":
					pokemonAfectado.setDefensaESP();
					break;
				case "velocidad":
					pokemonAfectado.setVelocidad();
					break;
				case "intoxicar":
					pokemonAfectado.setEstado("envenenado");
					break;
				case "quemar":
					pokemonAfectado.setEstado("quemado");
					break;
				case "dormir":
					pokemonAfectado.setEstado("dormir");
					break;
				case "congelar":
					pokemonAfectado.setEstado("congelado");
					break;	
				case "curar":
					pokemonAfectado.setVida((int)(pokemonAfectado.getVida()*0.5));
					break;
					
			}
		}
	}
	
	
	
}

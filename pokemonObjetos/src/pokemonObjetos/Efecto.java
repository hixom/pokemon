package pokemonObjetos;

public class Efecto {
	private int vidaARestar;
	private int variacion;

	public Efecto(String categoria, int daño, int stab, int efectividad, int ataque, int defensa, Pokemon pokemon){
		if(categoria.equals("daño")){
			setVariacion();
			vidaARestar=(int)(0.01*stab*efectividad*variacion*(((0.2*(100+1)*ataque*daño)/(25*defensa))+2));
			pokemon.setVida(vidaARestar);
		}else{
			
		};
	}

	private void setVariacion() {
		variacion = (int) (Math.random() * (100 - 85 + 1) + (85));
	}
}

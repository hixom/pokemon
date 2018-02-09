package pokemonObjetos;
import java.util.Scanner;
public class Pokemon {
	private String nombre;
	private String mote;
	private String[] tipo;
	private int vida, ataque, ataqueESP, defensa, defensaESP, velocidad, vidaInicial;
	private Ataque[] movimientos= new Ataque[4];
	private String estado;
	Scanner sc=new Scanner(System.in);
	
	
	public Pokemon(){
		setNombre();
		setMote();
		estado="normal";
		setEstadisticas(nombre);
		puntosDeEsfuerzo();
		vida=vidaInicial;
		if (!nombre.equals("blastoise")||!nombre.equals("charizard") || !nombre.equals("venusaur")) {
		String []listaPokemon=new String[1];
		listaPokemon[0]="missigno";
		String []efectosOtro=new String[2];
		efectosOtro[0]="ataque";
		efectosOtro[1]="ataqueESP";
		nombre="Missigno";
		setMote(nombre);
		setMovimientos(nombre);
		movimientos[0]= new Ataque("Paliza universal","Error Supremo", "fisica",99999 , 100, 50,listaPokemon,efectosOtro);
		movimientos[1]= new Ataque("Destrucción total","Error Supremo", "especial",99999 , 100, 50,listaPokemon,efectosOtro);
		movimientos[2]= new Ataque("erradicación molecular","Error Supremo", "fisica",99999 , 100, 50,listaPokemon,efectosOtro);
		efectosOtro=new String[3];
		efectosOtro[0]="ataque";
		efectosOtro[1]="ataqueESP";
		efectosOtro[2]="curar";
		movimientos[3]= new Ataque("nirvana","Error Supremo", "otro",0 , 100, 50,listaPokemon,efectosOtro);
		}else {
			setMovimientos(nombre);
		}
	
	}
	public void setMote() {
		String respuesta;
		
		do {
			System.out.println("¿Quieres ponerle algún mote?(si|no)");
			respuesta = sc.nextLine();
		}while(!respuesta.equals("si")|| !respuesta.equals("no"));
		if(respuesta.equals("si")) {
			System.out.println("Ok, escríbelo entonces");
			this.mote=sc.nextLine();
		}else {
			this.mote=this.nombre;
		}
		
	
}
	public Ataque elegirAtaque() {
		
		int nAtaqueDeseado;
		System.out.println("estos son los movimientos que has elegido");
		for (int i=0;i<4;i++) {
			System.out.println(this.movimientos[i].getNombre()+" (nª"+i+")");
		}
		do {
		System.out.println("elige ahora cuál es el ataque que quieres (0,1,2,3)");
		nAtaqueDeseado=sc.nextInt();
		}while(nAtaqueDeseado<0 || nAtaqueDeseado>3);
		
		return this.movimientos[nAtaqueDeseado];
	}
	
	
	public Ataque[] getMovimientos() {
		return movimientos;
	}
	public void setNombre() {
		
			System.out.println("elige: blastoise, charizard o venusaur");
			this.nombre = sc.nextLine();
		
	}

	public void setEstadisticas(String nombre){
		switch (nombre){
		 case "Missigno":
			tipo[0]="Error Supremo";
			vidaInicial=1234;
			ataque=1234; 
			ataqueESP=1234; 
			defensa=1234;
			defensaESP=1234; 
			velocidad=1234;
			break;
		 case "Blastoise":
			tipo[0]="agua"; 
			vidaInicial=299;
			ataque=181;
			defensa=259;
			ataqueESP=206;
			defensaESP=246; 
			velocidad=192;
			break;
		 case "Charizard":
			tipo[0]="fuego";
			tipo[1]="volador";
			vidaInicial=297;
			ataque=183;
			defensa=192;
			ataqueESP=254;
			defensaESP=206; 
			velocidad=259;
		 case "Venusaur":
				tipo[0]="planta";
				vidaInicial=301;
				ataque=180;
				defensa=203;
				ataqueESP=259;
				defensaESP=236; 
				velocidad=196;
				break;
			
		}
	}
		
	public int getVelocidad() {
		return velocidad;
	}
	public String[] getTipo() {
		return tipo;
	}
	public int getVidaInicial() {
		return vidaInicial;
	}
	public int getVida() {
		return vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getAtaqueESP() {
		return ataqueESP;
	}
	public int getDefensa() {
		return defensa;
	}
	public int getDefensaESP() {
		return defensaESP;
	}
	public void setMovimientos(String nombre){
		System.out.println("Vamos a proceder a elegir los cuatro ataques");
		for (int i=0;i<4;i++) {
			this.movimientos[i]=new Ataque();
			this.movimientos[i].elegirAtaque(nombre, this.movimientos, i);
		}
	

	}
		
		
	
		public void puntosDeEsfuerzo(){
			String[] respuesta=new String[2];
			Scanner sc = new Scanner (System.in);
			System.out.println("¿En qué dos apartados quieres que se especialice el pokémon (vida, ataque, defensa, ataqueESP, defensaESP o velocidad)?");
			do{
				System.out.println("Elige el primero (recuerda que tiene que ser uno de los siguientes: vidaInicial, ataque, defensa, ataqueESP, defensaESP o velocidad)");
				respuesta[0]=sc.nextLine();
			}while(!respuesta[0].equals("vida") && !respuesta[0].equals("ataque") && !respuesta[0].equals("defensa") && !respuesta[0].equals("ataqueESP") && !respuesta[0].equals("defensaESP") && !respuesta[0].equals("velocidad"));
			
			do{
				System.out.println("Elige el segundo (recuerda que tiene que ser uno de los siguientes: vidaInicial, ataque, defensa, ataqueESP, defensaESP o velocidad)");
				respuesta[1]=sc.nextLine();
			}while((!respuesta[1].equals("vida") && !respuesta[1].equals("ataque") && !respuesta[1].equals("defensa") && !respuesta[1].equals("ataqueESP") && !respuesta[1].equals("defensaESP") && !respuesta[1].equals("velocidad")) || respuesta[0].equals(respuesta[1]));
			
			for(int i=0;i<respuesta.length;i++){
				switch(respuesta[i]){
					case "vida":
						vidaInicial+=70;
						break;
					case "ataque":
						ataque+=70;
						break;
					case "defensa":
						defensa+=70;
						break;
					case "ataqueESP":
						ataqueESP+=70;
						break;
					case "defensaESP":
						defensaESP+=70;
						break;
					case "velocidad":
						velocidad+=70;
						break;
				}
			}
		}
		
		public String getNombre() {
			return nombre;
		}
		public String getMote() {
			return mote;
		}
		public void setAtaque() {
			this.ataque *=(int) (1.5);
		}
		public void setAtaqueESP() {
			this.ataqueESP *=(int) (1.5);
		}
		public void setDefensa() {
			this.defensa*=(int) (1.5);
		}
		public void setDefensaESP() {
			this.defensaESP *=(int) (1.5);
		}
		public void setVelocidad() {
			this.velocidad *=(int) (1.5);
		}
		public void showEstadisticas(){
			System.out.println("vida="+vida+" ataque="+ataque+" defensa="+defensa+" ataqueESP="+ ataqueESP+" defensaESP="+defensaESP+" velocidad="+velocidad );
		}
		public void setMote(String mote){
			this.mote=mote;
		}
		public void setVida(int modificacionVida){
			this.vida+=modificacionVida;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
	}	
		
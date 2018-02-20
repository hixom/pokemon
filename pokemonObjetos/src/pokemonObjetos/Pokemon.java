package pokemonObjetos;
import java.util.Scanner;
import java.util.Vector;
public class Pokemon {
	private String nombre;
	private String mote;
	private String[] tipo;
	private int vida, ataque, ataqueESP, defensa, defensaESP, velocidad, vidaInicial;
	private Ataque[] movimientos= new Ataque[4];
	private String estado;
	private Ataque[] listaAtaques;
	Scanner sc=new Scanner(System.in);
	
	
	public Pokemon(Ataque[] listaTodosAtaques){
		setNombre();
		setMote();
		estado="normal";
		setEstadisticas(nombre);
		puntosDeEsfuerzo();
		vida=vidaInicial;
		if (nombre.equals("missigno")) {
		String []listaPokemon=new String[1];
		listaPokemon[0]="missigno";
		String []efectosOtro=new String[2];
		efectosOtro[0]="ataque";
		efectosOtro[1]="ataqueESP";
		nombre="Missigno";
		setMote(nombre);
		movimientos[0]= new Ataque("Paliza universal","Error Supremo", "fisica",99999 , 100, 50,listaPokemon,efectosOtro, "defensor");
		movimientos[1]= new Ataque("Destrucción total","Error Supremo", "especial",99999 , 100, 50,listaPokemon,efectosOtro, "defensor");
		movimientos[2]= new Ataque("erradicación molecular","Error Supremo", "fisica",99999 , 100, 50,listaPokemon,efectosOtro, "defensor");
		efectosOtro=new String[3];
		efectosOtro[0]="ataque";
		efectosOtro[1]="ataqueESP";
		efectosOtro[2]="curar";
		movimientos[3]= new Ataque("nirvana","Error Supremo", "otro",0 , 100, 50,listaPokemon,efectosOtro, "defensor");
		}else {
			listaAtaques=listaTodosAtaques;
			escogerCuatroAtaques();
		}
	
	}
	public void setMote() {
		String respuesta;
		
		do {
			System.out.println("¿Quieres ponerle algún mote?(si|no)");
			respuesta = sc.nextLine();
		}while(!respuesta.equals("si") && !respuesta.equals("no"));
		if(respuesta.equals("si")) {
			System.out.println("Ok, escríbelo entonces");
			mote=sc.nextLine();
		}else {
			mote=nombre;
		}
		
	
}
	public Ataque elegirAtaque() {
		int numEntero;
		String nAtaqueDeseado;
		System.out.println("estos son los movimientos que puedes hacer:");
		for (int i=0;i<4;i++) {
			System.out.println(movimientos[i].getNombre()+" (n�"+i+")");
		}
		do{
			do {
				System.out.println("elige ahora cuál es el ataque que quieres (0, 1, 2 o 3)");
				nAtaqueDeseado=sc.nextLine();
				if (!nAtaqueDeseado.equals("0") && !nAtaqueDeseado.equals("1") && !nAtaqueDeseado.equals("2") && !nAtaqueDeseado.equals("3") ) {
					System.out.println("no has elegido un n�mero comprendido entre el 3 o el 0, has elegido el "+ nAtaqueDeseado);
				}
			}while(!nAtaqueDeseado.equals("0") && !nAtaqueDeseado.equals("1") && !nAtaqueDeseado.equals("2") && !nAtaqueDeseado.equals("3"));
			numEntero = Integer.parseInt(nAtaqueDeseado);
			if (movimientos[numEntero].getPp()<1) {
				System.out.println("El ataque que has elegido no tiene pp's");
			}
		
		}while(movimientos[numEntero].getPp()<1);
		
		return movimientos[numEntero];
	}
	
	public void showMovimientos(){
		for (int i = 0; i < movimientos.length; i++) {
			System.out.println(movimientos[i].getNombre()+ "pp:"+movimientos[i].getPp());
		}
		
	}
	public Ataque[] getMovimientos() {
		return movimientos;
	}
	public void setNombre() {
		
			System.out.println("elige: blastoise, charizard o venusaur");
			nombre = sc.nextLine();
			if (!nombre.equals("blastoise") && !nombre.equals("charizard") && !nombre.equals("venusaur")  ) {
				nombre="missigno";
			}
		
	}

	public void setEstadisticas(String nombre){
		switch (nombre){
		 case "missigno":
			 tipo=new String[1];
			tipo[0]="Error Supremo";
			vidaInicial=1234;
			ataque=1234; 
			ataqueESP=1234; 
			defensa=1234;
			defensaESP=1234; 
			velocidad=1234;
			break;
		 case "blastoise":
			tipo=new String[1];
			tipo[0]="agua"; 
			vidaInicial=299;
			ataque=181;
			defensa=259;
			ataqueESP=206;
			defensaESP=246; 
			velocidad=192;
			break;
		 case "charizard":
			tipo=new String[2];
			tipo[0]="fuego";
			tipo[1]="volador";
			vidaInicial=297;
			ataque=183;
			defensa=192;
			ataqueESP=254;
			defensaESP=206; 
			velocidad=259;
		 case "venusaur":
			 tipo=new String[1];
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
		
		
	
		public void puntosDeEsfuerzo(){
			String[] respuesta=new String[2];
			Scanner sc = new Scanner (System.in);
			System.out.println("¿En qué dos apartados quieres que se especialice el pokémon (vida, ataque, defensa, ataqueESP, defensaESP o velocidad)?");
			do{
				System.out.println("Elige el primero (recuerda que tiene que ser uno de los siguientes: vida, ataque, defensa, ataqueESP, defensaESP o velocidad)");
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
			vida+=modificacionVida;
			if(vida>vidaInicial){
				vida=vidaInicial;
			}
			if(vida<0){
				vida=0;
			}
			
			
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
		
		
		
		public boolean ataqueEncontrado(Vector <Ataque> listaPosibles, String nombre) {
			boolean encontrado=false;
			
			for (int i = 0; i < listaPosibles.size() && !encontrado; i++) {
				if(listaPosibles.get(i).getNombre().equals(nombre)) {
					encontrado=true;
				}
			}
			if (encontrado==false) {
				System.out.println("el nombre de ataque que has introducido no existe, el que has introducido es el siguiente "+ nombre);
			}
			
			return encontrado;
		}
		
		
//		este sirve para que en medio de la batalla elijas cual de los cuatro ataques quieres hacer
		public void escogerCuatroAtaques(){
			boolean exit;
			String nombreAtaqueDeseado;
	 		Vector <Ataque> listaPosibles=new Vector<Ataque>();
	 		Ataque ataqueDeseado=new Ataque();
	 		listaPosibles=getListaAtaquesPosibles();
	 		System.out.println("Vamos a elegir los cuatro ataques que tendr� tu pok�mon:");
	 		for (int i = 0; i < 4; i++) {
	 			System.out.println("vamos a elegir el ataque nº "+ i);
	 			
	 			System.out.println("Estos son los que puedes elegir en base al pokemon que has elegido");
		 		
				showListaPosibles(listaPosibles);
				do{
					System.out.println("elige el ataque nª"+i+":");
					nombreAtaqueDeseado=sc.nextLine();
				}while(ataqueEncontrado(listaPosibles, nombreAtaqueDeseado)==false);
				
				
				exit = false;
				for(int j=0; j<listaPosibles.size() && !exit ;j++){
					if(nombreAtaqueDeseado.equals(listaPosibles.get(j).getNombre())){
						movimientos[i]=new Ataque();
						ataqueDeseado.copia(listaPosibles.get(j));
						movimientos[i].copia(ataqueDeseado);
						exit=true;
						listaPosibles.remove(j);
					}
				}
				
			}
	 		
		 		
	 		
	 		
		}
//		private Ataque[] eliminarAtaqueEscogido(Ataque[] lista,String nombreAtaqueUsado ) {
//			Ataque[] resultadoFinal=new Ataque[lista.length-1];
//			int j=0;
//			for (int i = 0; i < lista.length; i++) {
//				if (!lista[i].getNombre().equals(nombreAtaqueUsado)) {
//					resultadoFinal[j].copia(lista[i]);
//					j++;
//				}
//				
//			}
//			return resultadoFinal;
//		}
		private void showListaPosibles(Vector<Ataque> lista) {
			System.out.println(lista.size());
			for(int i=0; i<lista.size();i++){
				String[] listaEfectosOtro=lista.get(i).getEfectosOtro();
				System.out.println("nombre: "+lista.get(i).getNombre());
				System.out.println("El cual tiene las siguientes características:");
				System.out.println("	- tipo: "+lista.get(i).getTipo());
				System.out.println("	- categoría: "+lista.get(i).getCategoria());
				System.out.println("	- potencia: "+lista.get(i).getPotencia());
				System.out.println("	- precision: "+lista.get(i).getPrecision());
				System.out.println("	- pp: "+lista.get(i).getPp());
				System.out.println("	-efectos secundarios que tiene:");
				for(int j=0; j<lista.get(i).getEfectosOtro().length;j++){
					System.out.println("		-"+listaEfectosOtro[j]);
				}
				
			}
		}
//		devuelve el ataque numero i de la lista al completo
	public Ataque getAtaqueDeLaListaCompleta(int i) {
		return listaAtaques[i];
	}
		
	public Vector<Ataque> getListaAtaquesPosibles(){
		boolean exit;
		Ataque ataque;
		Vector<Ataque>listaAtaquesPosibles=new Vector<Ataque>();
		for(int i=0;i<listaAtaques.length;i++ ){
//				este segundo for es para comparar cada pokemon que puede realizar cada uno de los ataques
			exit = false;
			for(int j=0;j<listaAtaques[i].getPokemonPuedeUsarlo().length && exit==false;j++ ){
				if (nombre.equals(listaAtaques[i].getNombrePokemonValido(j))){
					ataque= new Ataque();
					ataque.copia(listaAtaques[i]);
					System.out.println("he añadido un ataque");
					listaAtaquesPosibles.add(ataque);
					exit=true;		
				}
					
			}
		}
		System.out.println(listaAtaquesPosibles.toString()); 
		return listaAtaquesPosibles; 
	}
}
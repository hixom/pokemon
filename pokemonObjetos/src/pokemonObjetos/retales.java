package pokemonObjetos;

public class retales {

}


public  void setataqueOAtaqueESP(){
	do{
	System.out.println("Lado por el que atacas");
	tipo=sc.nextLine();
	}while(!tipo.equals("fuego") && !tipo.equals("agua") && !tipo.equals("planta") );
}
public  void setNombre(){
	System.out.println("nombre del ataque");
	nombre=sc.nextLine();
}
public  void setTipo(){
	do{
	System.out.println("tipo del ataque");
	tipo=sc.nextLine();
	}while(!tipo.equals("fuego") && !tipo.equals("agua") && !tipo.equals("planta") );
}
public void setCategoria(){
	
	do{
		System.out.println("tipo de categoria");
		categoria=sc.nextLine();
	}while(!categoria.equals("daño") && !categoria.equals("otro") );
	
}
public void setDaño(){
	do{
		System.out.println("daño");
		daño=sc.nextInt();
	}while(daño<20 || daño>200);
}
public void setPrecision(){
	do{
		System.out.println("precision");
		daño=sc.nextInt();
	}while(daño<0 || daño>100);
}
public void setPP(){
	do{
		System.out.println("precision");
		daño=sc.nextInt();
	}while(daño<0 || daño>45);
}
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
	}while(!categoria.equals("da�o") && !categoria.equals("otro") );
	
}
public void setDa�o(){
	do{
		System.out.println("da�o");
		da�o=sc.nextInt();
	}while(da�o<20 || da�o>200);
}
public void setPrecision(){
	do{
		System.out.println("precision");
		da�o=sc.nextInt();
	}while(da�o<0 || da�o>100);
}
public void setPP(){
	do{
		System.out.println("precision");
		da�o=sc.nextInt();
	}while(da�o<0 || da�o>45);
}
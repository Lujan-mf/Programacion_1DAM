package test;

import tipos.Persona;
import tipos.Sexo;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Christian", 21, 70.2, Sexo.HOMBRE);
		System.out.println(p1.getNombre());

		Persona p2 = new Persona("Ana", 20, 60.3, Sexo.MUJER);
		System.out.println(p2.getNombre());
		
		// para cambiar el nombre
		p1.setNombre("Cristiano");
		System.out.println(p1.getNombre());
		
		
	}

}

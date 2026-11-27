package testProyecto;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import tipos.Color;
import tipos.Estado;
import tipos.Mascota;
import tipos.Raza;


public class TestProyecto {

	public static void main(String[] args) {
		Mascota m1 =new Mascota("Nora",Raza.CHIHUAHUA, LocalDateTime.of(LocalDate.of(2020, 10, 5), LocalTime.of(0, 0) ), Color.ROSA , Estado.VIVE_DEBAJO_DE_UN_PUENTE, null);
		Mascota m2 =new Mascota("Luján",Raza.CANICHETOY, LocalDateTime.of(LocalDate.of(2023, 10, 5), LocalTime.of(0, 0) ) , Color.MARRON, Estado.VIVE_DEBAJO_DE_UN_PUENTE, null);
		Mascota m3 =new Mascota("David",Raza.CHIHUAHUA, LocalDateTime.of(LocalDate.of(2025, 07, 5), LocalTime.of(0, 0) ), Color.ROSA, Estado.ADOPTADO, null);
		Mascota m4 =new Mascota("Juan Andés", Raza.LABRADOR, LocalDateTime.of(LocalDate.of(2019, 07, 5), LocalTime.of(0, 0)), Color.ROSA, Estado.ADOPTADO, null);
		
		List<Mascota> lis = new ArrayList<Mascota>();
		lis.add(m1);
		lis.add(m2);
		lis.add(m3);
		lis.add(m4);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}
}

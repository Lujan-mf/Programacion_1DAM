package tipos;

public class Caballo {
	private String id;
	private String nombre;
	private Raza raza;
	private Integer visctorias;
	private Double vewlocidad;
	
	
	public Caballo(String id, String nombre, Raza raza, Double vewlocidad) {
		
		this.id = id;
		this.nombre = nombre;
		this.raza = raza;
		this.visctorias =0;
		this.vewlocidad = vewlocidad;
	}
	
	
}

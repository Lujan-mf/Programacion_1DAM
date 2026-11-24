package tipos;
import java.util.ArrayList;
import java.util.List;

import tipos.Mascota;

public class Refugio_David_Nora_Lujan {

    private String nombre;
    private List<Mascota> mascotas;

    public Refugio_David_Nora_Lujan(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}


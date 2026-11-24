package tipos;

import java.time.LocalDateTime;

public class Mascota {
	private final String nombre;
	private Raza raza;

	private LocalDateTime fechaInicio;
	private Color color;
	private Estado estado;
	private Precio precio;

	public Mascota(String nombre, Raza raza, LocalDateTime fechaInicio, Color color, Estado estado, Precio precio) {
		if (nombre == null || nombre.trim().isEmpty()) {
			throw new IllegalArgumentException("El nombre no puede estar vacío.");
		}
		if (raza == null) {
			throw new IllegalArgumentException("La raza no puede ser nula.");
		}
		if (fechaInicio == null || fechaInicio.isAfter(LocalDateTime.now())) {
			throw new IllegalArgumentException("La fecha no puede ser nula ni futura.");
		}
		if (color == null) {
			throw new IllegalArgumentException("El color no puede estar vacío.");
		}
		this.nombre = nombre;
		this.raza = raza;
		this.fechaInicio = fechaInicio;
		this.color = color;
		this.estado = estado;
		this.precio = precio;

	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public LocalDateTime getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getNombre() {
		return nombre;
	}

	public int calcularEdad() {
		return LocalDateTime.now().getYear() - fechaInicio.getYear();
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Precio getPrecio() {
		return precio;
	}

	public void setPrecio(Precio precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Perro [ " + nombre + ", " + raza + ", " + calcularEdad() + " año " + ", " + color + ", " + estado + "]";
	}

}

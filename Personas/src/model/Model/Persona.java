package model.Model;


import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }
    
	/**
     * 
     */
    private String dni;

    /**
     * 
     */
    private String nombre;

    /**
     * 
     */
    private String apellido1;

    /**
     * 
     */
    private String apellido2;

    /**
     * 
     */
    private int edad = 0;

    /**
     * @param dni 
     * @param nombre 
     * @param apellido1 
     * @param apellido2 
     * @param edad
     */
    public void Persona(String dni, String nombre, String apellido1, String apellido2, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
    }

    /**
     * @param dni
     */
    public void SetDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return
     */
    public String getDni() {
        // TODO implement here
        return dni;
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}




    
    
    
}
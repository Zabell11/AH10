/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

/**
 *
 * @author ramsq2017
 */
public class estudiante {
    
    private int id_estudiante;
    private String nombre;
    private String apellido;
    private int edad;
    private int nota_promedio;

    public estudiante(int id_estudiante, String nombre, String apellido, int edad, int nota_promedio) {
        this.id_estudiante = id_estudiante;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota_promedio = nota_promedio;
    }

   

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNota_promedio() {
        return nota_promedio;
    }

    public void setNota_promedio(int nota_promedio) {
        this.nota_promedio = nota_promedio;
    }
    
    
    
}

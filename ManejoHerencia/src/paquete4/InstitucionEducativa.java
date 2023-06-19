/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author Usuario iTC
 */
public class InstitucionEducativa {
    public String nombre;
    public String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    @Override
    public String toString() {
        return "InstitucionEducativa{" +
                "nombre='" + nombre + '\'' +
                ", siglas='" + siglas + '\'' +
                '}';
    }
}

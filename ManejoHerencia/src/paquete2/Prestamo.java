/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {
    public Persona beneficiario;
    public int prestamoMeses;
    public String ciudadPrestamo;

    public Prestamo(Persona beneficiario, int prestamoMeses, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.prestamoMeses = prestamoMeses;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public void setCiudadPrestamo() {
        this.ciudadPrestamo = ciudadPrestamo.toLowerCase();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "beneficiario=" + beneficiario +
                ", prestamoMeses=" + prestamoMeses +
                ", ciudadPrestamo='" + ciudadPrestamo + '\'' +
                '}';
    }
}

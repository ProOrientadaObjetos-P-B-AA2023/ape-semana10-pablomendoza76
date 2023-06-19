/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoEducativo extends Prestamo {
    public String nivelEstudio;
    public InstitucionEducativa centroEducativo;
    public double valorCarrera;
    public double pagoMensualCarrera;

    public PrestamoEducativo(Persona beneficiario, double prestamoMeses, String ciudadPrestamo, String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, (int) prestamoMeses, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.pagoMensualCarrera = pagoMensualCarrera;
    }

    public void CalcularValorMensualE() {
        this.pagoMensualCarrera = (this.valorCarrera / this.prestamoMeses) - ((this.valorCarrera / prestamoMeses) * 0.10);

    }

    @Override
    public String toString() {
        return "PrestamoEducativo{" +
                "nivelEstudio='" + nivelEstudio + '\'' +
                ", centroEducativo=" + centroEducativo +
                ", valorCarrera=" + valorCarrera +
                ", pagoMensualCarrera=" + pagoMensualCarrera +
                '}';
    }
}
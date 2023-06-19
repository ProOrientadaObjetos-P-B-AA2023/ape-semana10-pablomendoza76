/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

public class PrestamoAutomovil extends Prestamo{
    public String tipoAuto;
    public String Marca;
    public Persona garante1;
    public double valorAuto;
    public double valorMensual;

    public PrestamoAutomovil(Persona beneficiario, double prestamoMeses, String ciudadPrestamo, String tipoAuto, String marca, Persona gar, double valorAuto) {
        super(beneficiario, (int) prestamoMeses, ciudadPrestamo);
        this.tipoAuto = tipoAuto;
        this.Marca = marca;
        this.garante1 = garante1;
        this.valorAuto = valorAuto;
        this.valorMensual = valorMensual;
    }

    public void CalularValorMensualA() {
        this.valorMensual = (this.valorAuto / this.prestamoMeses);
    }

    @Override
    public String toString() {
        return "PrestamoAutomovil{" +
                "tipoAuto='" + tipoAuto + '\'' +
                ", Marca='" + Marca + '\'' +
                ", garante1=" + garante1 +
                ", valorAuto=" + valorAuto +
                ", valorMensual=" + valorMensual +
                '}';
    }
}
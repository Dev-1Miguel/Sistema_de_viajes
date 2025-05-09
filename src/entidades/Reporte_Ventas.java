/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Asus
 */
public class Reporte_Ventas {
    
    private String periodo; // Mensual, Trimestral, Anual

    public Reporte_Ventas() {
    }

    public Reporte_Ventas(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "ReporteReservas{" +
                "periodo='" + periodo + '\'' +
                '}';
    }
}

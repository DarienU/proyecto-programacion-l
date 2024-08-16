/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Darien
 */
public class Medicamentos {
   
    // ATRIBUTOS
    
    // DATOS DEL Medicamento
    
    private String fecha;
    private String CantidadMedicamento;
    private String NombreMedicamento;
    private String PrecioXUnidad;
    
    
    
    //CONSTRCUTOR CON PARAMETROS
 
    public Medicamentos(String fecha, String CantidadMedicamento, String NombreMedicamento, String PrecioXUnidad) {
        this.fecha = fecha;
        this.CantidadMedicamento = CantidadMedicamento;
        this.NombreMedicamento = NombreMedicamento;
        this.PrecioXUnidad = PrecioXUnidad;
    }
    
    
    
    //CONSTRUCTOR VACIO
    
    public Medicamentos() {
    }
    
    
    
    //GETTERS Y SETTERS

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCantidadMedicamento() {
        return CantidadMedicamento;
    }

    public void setCantidadMedicamento(String CantidadMedicamento) {
        this.CantidadMedicamento = CantidadMedicamento;
    }

    public String getNombreMedicamento() {
        return NombreMedicamento;
    }

    public void setNombreMedicamento(String NombreMedicamento) {
        this.NombreMedicamento = NombreMedicamento;
    }

    public String getPrecioXUnidad() {
        return PrecioXUnidad;
    }

    public void setPrecioXUnidad(String PrecioXUnidad) {
        this.PrecioXUnidad = PrecioXUnidad;
    }
    
    

    
}

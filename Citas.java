/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Darien
 */
public class Citas {
    
    private String nombreClientes;
    private String fechaCita;
    private String horaDeCita;
    private String estadoDeCita;
    private String doctorAsignado;
    
    public Citas() {
    }

    public Citas(String nombreClientes, String fechaCita, String horaDeCita, String estadoDeCita, String doctorAsignado) {
        this.nombreClientes = nombreClientes;
        this.fechaCita = fechaCita;
        this.horaDeCita = horaDeCita;
        this.estadoDeCita = estadoDeCita;
        this.doctorAsignado = doctorAsignado;
    }    
    
    
        public String getNombreClientes() {
        return nombreClientes;
    }

    public void setNombreClientes(String nombreClientes) {
        this.nombreClientes = nombreClientes;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraDeCita() {
        return horaDeCita;
    }

    public void setHoraDeCita(String horaDeCita) {
        this.horaDeCita = horaDeCita;
    }

    public String getEstadoDeCita() {
        return estadoDeCita;
    }

    public void setEstadoDeCita(String estadoDeCita) {
        this.estadoDeCita = estadoDeCita;
    }

    public String getDoctorAsignado() {
        return doctorAsignado;
    }

    public void setDoctorAsignado(String doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }

    
}

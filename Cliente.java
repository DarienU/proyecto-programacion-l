/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;

/**
 *
 * @author Darien
 */
public class Cliente {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreCompletoFamiliar1() {
        return nombreCompletoFamiliar1;
    }

    public void setNombreCompletoFamiliar1(String nombreCompletoFamiliar1) {
        this.nombreCompletoFamiliar1 = nombreCompletoFamiliar1;
    }

    public String getTelefonoFamiliar1() {
        return telefonoFamiliar1;
    }

    public void setTelefonoFamiliar1(String telefonoFamiliar1) {
        this.telefonoFamiliar1 = telefonoFamiliar1;
    }

    public String getNombreCompletoFamiliar2() {
        return nombreCompletoFamiliar2;
    }

    public void setNombreCompletoFamiliar2(String nombreCompletoFamiliar2) {
        this.nombreCompletoFamiliar2 = nombreCompletoFamiliar2;
    }

    public String getTelefonoFamiliar2() {
        return telefonoFamiliar2;
    }

    public void setTelefonoFamiliar2(String telefonoFamiliar2) {
        this.telefonoFamiliar2 = telefonoFamiliar2;
    }

    public Cliente(String nombre, String primerApellido, String segundoApellido, String cedula, String fechaDeNacimiento, String correoElectronico, String genero, String telefono, String direccion, String clave, String nombreCompletoFamiliar1, String telefonoFamiliar1, String nombreCompletoFamiliar2, String telefonoFamiliar2) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.correoElectronico = correoElectronico;
        this.genero = genero;
        this.telefono = telefono;
        this.direccion = direccion;
        this.clave = clave;
        this.nombreCompletoFamiliar1 = nombreCompletoFamiliar1;
        this.telefonoFamiliar1 = telefonoFamiliar1;
        this.nombreCompletoFamiliar2 = nombreCompletoFamiliar2;
        this.telefonoFamiliar2 = telefonoFamiliar2;
    }

    public Cliente() {
    }
    //
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String fechaDeNacimiento;
    private String correoElectronico;
    private String genero;
    private String telefono;
    private String direccion;
    private String clave;
    
    //
    private String nombreCompletoFamiliar1;
    private String telefonoFamiliar1;
    //
    private String nombreCompletoFamiliar2;
    private String telefonoFamiliar2;
    
    
    

    
    
}

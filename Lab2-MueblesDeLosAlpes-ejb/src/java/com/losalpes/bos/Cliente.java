/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.bos;

/**
Fields 
Tipo de documento(*)
Número de documento (*) (único)
Nombre completo del cliente(*)
Teléfono de residencia (*)
Teléfono celular
Dirección (*)
Ciudad de residencia (*)
Departamento (*)
País (*)
Profesión
Email (*)
Los campos que están con (*) son obligatorios y el número de documento debe ser único en el sistema.

Los clientes pueden ser personas jurídicas o naturales, en caso de ser jurídica se debe registrar el número del NIT.
 * 
 * 
 * @author ma.cruz14
 */
public class Cliente {
    
      //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    
    /**
     * Tipo Documento del Cliente
     */
    private TipoDocumento tipo_documento;
    
    
    /**
     * Documento del Cliente
     */
    private int documento;
    
    /**
     * Nombre del Cliente
     */
    private String nombreCliente;

    /**
     * Contraseña del Cliente
     */
    private Integer telefonoResCliente;

    /**
     * Ciudad de Cliente
     */
    private String ciudadCliente;
    
    /**
     * Departamento de Cliente
     */
    private String departamentoResCliente;

    /**
     * País de Cliente
     */
    private String paisCliente;
    
    /**
     * Profesión de Cliente
     */
    private String profesiónCliente;
    
    /**
     * Email de Cliente
     */
    private String emailCliente;

    
    
    
    //-----------------------------------------------------------
    // Constructores
    //-----------------------------------------------------------
    
    /**
     * Constructor de la clase sin argumentos
     */
    public Cliente(){
        this.tipo_documento = TipoDocumento.CC;
        this.documento = 0;
        this.nombreCliente = "Pepito Pérez";
        this.telefonoResCliente = 1234567;
        this.ciudadCliente = "Cartagena";
        this.departamentoResCliente = "Cundinamarca";                
        this.paisCliente = "Colombia";
        this.emailCliente = "servicio.marketplace@losalpes.com.co";
        this.profesiónCliente = "Ingeniero";
    }
    
    public Cliente(TipoDocumento tipo_documento, int documento, String nombre, int telefono, String ciudad, String departamento, String pais, String email, String profesion){
        this.tipo_documento = tipo_documento;
        this.documento = documento;
        this.nombreCliente = nombre;
        this.telefonoResCliente = telefono;
        this.ciudadCliente = ciudad;
        this.departamentoResCliente = departamento;                
        this.paisCliente = pais;
        this.emailCliente = email;
        this.profesiónCliente = profesion;       
    }

      
    
    
    public TipoDocumento getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(TipoDocumento tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Integer getTelefonoResCliente() {
        return telefonoResCliente;
    }

    public void setTelefonoResCliente(Integer telefonoResCliente) {
        this.telefonoResCliente = telefonoResCliente;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String CiudadCliente) {
        this.ciudadCliente = CiudadCliente;
    }

    public String getDepartamentoResCliente() {
        return departamentoResCliente;
    }

    public void setDepartamentoResCliente(String departamentoResCliente) {
        this.departamentoResCliente = departamentoResCliente;
    }

    public String getPaisCliente() {
        return paisCliente;
    }

    public void setPaisCliente(String PaisCliente) {
        this.paisCliente = PaisCliente;
    }

    public String getProfesiónCliente() {
        return profesiónCliente;
    }

    public void setProfesiónCliente(String ProfesiónCliente) {
        this.profesiónCliente = ProfesiónCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    
}

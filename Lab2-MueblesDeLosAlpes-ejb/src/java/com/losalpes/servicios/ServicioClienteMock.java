/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import com.losalpes.bos.TipoDocumento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ma.cruz14
 */
public class ServicioClienteMock implements IServicioCliente{

    private ArrayList<Cliente> clientes;
    
    public ServicioClienteMock() {
        clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente());
        clientes.add(new Cliente(TipoDocumento.CC, 81740327, "Miguel Cruz", 7425588, "Bogotá", "Cundinamarca", "Colombia", "armigueo@gmail.com", "Ingeniero"));
        clientes.add(new Cliente(TipoDocumento.NIT, 900878653, "Cruz Ltda", 7426696, "Bogotá", "Cundinamarca", "Colombia", "servicio@cruzltda.com", "Fabricante"));
        clientes.add(new Cliente(TipoDocumento.CC, 1234567, "Gonzalo Galindo", 2859974, "Bogotá", "Cundinamarca", "Colombia", "gonzo@gmail.com", "Ingeniero"));
        clientes.add(new Cliente(TipoDocumento.CC, 7654321, "Mauricio Torres", 2654575, "Bogotá", "Cundinamarca", "Colombia", "m.torres@gmail.com", "Ingeniero"));
    }
    
    

    @Override
    public void agregaCliente(Cliente cliente) {
        try
        {
            
        }
        catch(Exception e){
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }

    @Override
    public List<Cliente> darClientes() {
        try{
            return clientes;
        }
        catch(Exception e){
            
        throw new UnsupportedOperationException("Not supported yet.==>" + e.getMessage()); //To change body of generated methods, choose Tools | Templates.}
        }
    }
    @Override
    public void quitarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

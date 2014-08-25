/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.losalpes.servicios;

import com.losalpes.bos.Cliente;
import java.util.List;

/**
 *
 * @author ma.cruz14
 * 
 * 
 * 
 */
public interface IServicioCliente {
    
    public void agregaCliente(Cliente cliente);
    
    public List<Cliente> darClientes();
    
    public void quitarCliente(Cliente cliente);
    
    
}

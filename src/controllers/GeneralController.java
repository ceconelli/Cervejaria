/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dbConnection.dbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import services.ClienteService;

/**
 *
 * @author gceconelli
 */
public class GeneralController {
    
    ClienteService _clienteService;
    Connection _dbConnection;
    
    public GeneralController(Connection dbConnection, ClienteService clienteService){
        this._clienteService = clienteService;
        this._dbConnection = dbConnection;
    }
    
    public void getCliente() throws SQLException{
        this._clienteService.getClientes();
    }
}

package services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import models.Cliente;

/**
 *
 * @author gceconelli
 */
public class ClienteService {
    
    Connection _dbConnection;
    
    public ClienteService(Connection dbConnection){
        this._dbConnection = dbConnection;
    }
    
    private ResultSet executeQuery(String query) throws SQLException{
        Statement st = this._dbConnection.createStatement();
        ResultSet rs = st.executeQuery(query);
        return rs;
    }
    
    public ArrayList<Cliente> getClientes() throws SQLException{
        ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
        ResultSet rs = executeQuery("select * from cliente");
        while(rs.next()){
            clienteList.add(new Cliente(rs.getString("cpf"),rs.getString("nome"),rs.getString("telefone"),rs.getString("email")));
        }
        return clienteList;
    }
    
    
    
}

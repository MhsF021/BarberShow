package com.sistema.barber.barbershop.model.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL implements ConnectionDB{
    
    private final String USERDB = "root";
    private final String PASSWORDDB = "123321";
    private final String URL = "jdbc:mysql://localhost:3306/?user=root";
    private Connection conexao;
    
    @Override
    public Connection buscarConexao() throws SQLException {
        if(conexao != null) {
            conexao = DriverManager.getConnection(URL, USERDB, PASSWORDDB);
        }
        return conexao;

    }
    
}

package com.sistema.barber.barbershop.model.connection;

import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionDB {
    public Connection buscarConexao() throws SQLException;
}

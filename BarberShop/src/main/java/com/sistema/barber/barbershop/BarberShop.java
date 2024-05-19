package com.sistema.barber.barbershop;

import com.sistema.barber.barbershop.helper.DatabaseHelper;
import com.sistema.barber.barbershop.model.connection.ConnectionDB;
import com.sistema.barber.barbershop.model.connection.ConnectionMySQL;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BarberShop {

    public static void main(String[] args) throws SQLException {
        ConnectionDB connection = new ConnectionMySQL();
        /*
        System.out.println(connection.buscarConexao());
        @anotacao: usado para saber se a conexão está sendo realizada com o banco de dados.
         */
        StringBuilder cNomeCliente = new StringBuilder();
        cNomeCliente.append(" SELECT nome_cliente ");
        cNomeCliente.append(" FROM barbershowdb.cliente "); //versão de teste

        DatabaseHelper dbHelper = new DatabaseHelper(connection.buscarConexao());
        ResultSet fNomeCliente = dbHelper.fetch(cNomeCliente.toString());

        while (fNomeCliente.next()) {
            String nomeCliente = fNomeCliente.getString(1);
            System.out.println(nomeCliente);
        }
    }
}

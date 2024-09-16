package com.sistema.barber.barbershop;

import com.sistema.barber.barbershop.helper.DatabaseHelper;
import com.sistema.barber.barbershop.model.connection.ConnectionDB;
import com.sistema.barber.barbershop.model.connection.ConnectionMySQL;
import com.sistema.barber.barbershop.model.entidades.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BarberShop {

    public static void main(String[] args) throws SQLException {
        ConnectionDB connection = new ConnectionMySQL();
        Cliente cliente = new Cliente();
        /*
        System.out.println(connection.buscarConexao());
        @anotacao: usado para saber se a conexão está sendo realizada com o banco de dados.
         */
        cliente.setCdCliente(2);
        DatabaseHelper dbHelper = new DatabaseHelper(connection.buscarConexao());
        dbHelper.addParameter("P_CD_CLIENTE", cliente.getCdCliente());
        ResultSet fNomeCliente = dbHelper.select("nm_cliente", "cliente", "cd_cliente = @P_CD_CLIENTE");
        try {
            if (fNomeCliente != null) {
                cliente.setNmCliente(fNomeCliente.getString("nm_cliente"));
                System.out.println(cliente.getNmCliente());
            } else {
                System.out.println("Cliente não encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

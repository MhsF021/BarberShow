package com.sistema.barber.barbershop.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DatabaseHelper {

    private Connection connection;
    private Map<String, Object> parametros;

    public DatabaseHelper(Connection connection) {
        this.connection = connection;
        this.parametros = new HashMap<>();
    }

    public void addParameter(String parametro, Object valor) {
        parametros.put(parametro, valor);
    }

    private String substituirParametros(String query) {
        for (String key : parametros.keySet()) {
            query = query.replace("@" + key, "?");
        }
        return query;
    }

    private void setParametros(PreparedStatement stmt) throws SQLException {
        int index = 1;
        for (Object valor : parametros.values()) {
            stmt.setObject(index++, valor);
        }
    }

    public ResultSet select(String columns, String tableName, String condition) throws SQLException {
        /*@EXEMPLO DE USO
            dbHelper.select("cliente", "nm_cliente, nr_fone", "'João', '9999-9999'");
         */
        String query = "SELECT " + columns + " FROM barbershowdb." + tableName;
        if (condition != null && !condition.trim().isEmpty()) {
            query += " WHERE " + condition;
        }
        query = substituirParametros(query);
        PreparedStatement stmt = connection.prepareStatement(query);
        setParametros(stmt);
        ResultSet command = stmt.executeQuery();
        if (command.next()) {
            return command;
        } else {
            return null;
        }
    }

    public boolean insert(String tableName, String columns, String values) throws SQLException {
        /*@EXEMPLO DE USO
            dbHelper.insert("cliente", "nm_cliente, nr_fone", "'João', '9999-9999'");
         */
        String query = " INSERT INTO " + tableName + " (" + columns + ") VALUES (" + values + ")";
        query = substituirParametros(query);
        PreparedStatement stmt = connection.prepareStatement(query);
        setParametros(stmt);
        int affectedRows = stmt.executeUpdate();
        return affectedRows > 0;

    }

    public boolean delete(String tableName, String condition) throws SQLException {
        /*@EXEMPLO DE USO
            dbHelper.delete("cliente", "cd_cliente = 1");
         */
        String query = " DELETE FROM " + tableName + " WHERE " + condition;
        query = substituirParametros(query);
        PreparedStatement stmt = connection.prepareStatement(query);
        setParametros(stmt);
        int affectedRows = stmt.executeUpdate();
        return affectedRows > 0;

    }

    public boolean update(String tableName, String setClause, String condition) throws SQLException {
        /*@EXEMPLO DE USO
            dbHelper.update("cliente", "nm_cliente = 'Maria'", "cd_cliente = 1");
         */
        String query = " UPDATE " + tableName + " SET " + setClause + " WHERE " + condition;
        query = substituirParametros(query);
        PreparedStatement stmt = connection.prepareStatement(query);
        setParametros(stmt);
        int affectedRows = stmt.executeUpdate();
        return affectedRows > 0;

    }

}

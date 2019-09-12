package com.saga.demo.jwt.persona;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersonasDAO {
    private static String PATT_PERSONAS = "_X_PERSONAS_X_";
    private static String JSON_RES_STR = "{\"personas\":[" + PATT_PERSONAS + "]}";
//    private static String BBDD_URL = "jdbc:mysql://192.168.1.167/prototipo";
    private static String BBDD_URL = "jdbc:mysql://localhost/prototipo";
    private static String BBDD_USER = "prototipo";
    private static String BBDD_PSW = "prototipo";

    private static String PARAM_NAME_ID = "id";
    private static String PARAM_NAME_NOMBRE = "nombre";
    private static String PARAM_NAME_APELLIDO1 = "apellido1";
    private static String PARAM_NAME_APELLIDO2 = "apellido2";
    private static String PARAM_NAME_DNI = "dni";
    private static String PARAM_NAME_TELEFONO = "telefono";

    private static String MYSQL_DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    // Métodos para el Controller
    public static Persona getPersonaConId(int id) {
        Persona persona = new Persona();
        try {
            String personas = "";
            Connection conexion;
            Class.forName(MYSQL_DRIVER_CLASS_NAME);
            // Establecemos la conexión con la base de datos.
            conexion = DriverManager.getConnection(BBDD_URL, BBDD_USER, BBDD_PSW);
            Statement s = conexion.createStatement();
            String sqlStr = "select id, nombre, apellido1, apellido2, dni, telefono from persona where id = " + id;
            ResultSet rs = s.executeQuery(sqlStr);
            while (rs.next()) {
                persona = generatePersona(rs);
            }
            conexion.close();
        } catch (NumberFormatException e) {
            // Nada que hacer
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return persona;
    }

    public static boolean deletePersonaConId(int id) {
        boolean res = false;
        try {
            Class.forName(MYSQL_DRIVER_CLASS_NAME);
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection(BBDD_URL, BBDD_USER, BBDD_PSW);
            Statement s = conexion.createStatement();
            res = s.execute("delete FROM persona where id = " + id);
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return res;
    }

    public static boolean actualizaPersona(Persona p) {
        boolean res = false;
        try {
            Class.forName(MYSQL_DRIVER_CLASS_NAME);
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection(BBDD_URL, BBDD_USER, BBDD_PSW);
            Statement s = conexion.createStatement();
            String sqlStr = "UPDATE persona" +
                    " SET nombre = '" + p.getNombre() + "', " +
                    " apellido1 = '" + p.getApellido1() + "', " +
                    " apellido2 = '" + p.getApellido2() + "', " +
                    " dni = '" + p.getDni() + "', " +
                    " telefono = '" + p.getTelefono() + "' " +
                    "WHERE id = " + p.getId();
            res = s.execute(sqlStr);
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return res;
    }

    public static List<Persona> getAllPersonas() {
        List<Persona> personas = new ArrayList<>();
        try {
            Class.forName(MYSQL_DRIVER_CLASS_NAME);
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection(BBDD_URL, BBDD_USER, BBDD_PSW);
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery("select * from persona order by " + PARAM_NAME_ID);
            while (rs.next()) {
                personas.add(generatePersona(rs));
            }
            conexion.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return personas;
    }

    public static Persona insertaPersona(Persona persona) {
        try {
            Class.forName(MYSQL_DRIVER_CLASS_NAME);
            // Establecemos la conexión con la base de datos.
            Connection conexion = DriverManager.getConnection(BBDD_URL, BBDD_USER, BBDD_PSW);
            Statement s = conexion.createStatement();
            String sql = "INSERT INTO persona " +
                    "(nombre,apellido1,apellido2,dni,telefono) " +
                    "VALUES " +
                    "('" + persona.getNombre() + "', " +
                    "'" + persona.getApellido1() + "', " +
                    "'" + persona.getApellido2() + "', " +
                    "'" + persona.getDni() + "', " +
                    "'" + persona.getTelefono() + "')";
            s.execute(sql);
            conexion.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
        return persona;
    }

    //UTILS
    private static Persona generatePersona(ResultSet rs) throws SQLException {
        Persona p = new Persona();
        p.setId(rs.getInt(1));
        p.setNombre(rs.getString(2));
        p.setApellido1(rs.getString(3));
        p.setApellido2(rs.getString(4));
        p.setDni(rs.getString(5));
        p.setTelefono(rs.getString(6));
        return p;
    }

    public static String getStringOrEmpty(Map<String, String[]> parameterMap, String paramName) {
        String res = "";
        try {
            res = parameterMap.get(paramName)[0];
        } catch (Exception e) {
            //Nada que hacer
        }
        return res;
    }

    public static int getIntegerOrZero(Map<String, String[]> parameterMap, String paramName) {
        int res = 0;
        try {
            res = Integer.parseInt(parameterMap.get(paramName)[0]);
        } catch (Exception e) {
            //Nada que hacer
        }
        return res;
    }
}

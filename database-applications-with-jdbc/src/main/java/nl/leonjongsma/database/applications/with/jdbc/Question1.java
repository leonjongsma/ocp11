package nl.leonjongsma.database.applications.with.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question1 {
    public static void main(String[] args) {
        try {
            String dbURL = "jdbc:derby://localhost:1527/sample;user-test;password=password";
            Connection cn = DriverManager.getConnection(dbURL);
            String query = "SELECT Customer_ID, Name, City, State, ZIP FROM Customer";
            Statement stmt = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            rs.previous();
            rs.next();
            System.out.println(rs.getInt(1) + "-" + rs.getString(2));
        } catch (SQLException ex) {
            System.err.println("ERROR");
        }
    }
}

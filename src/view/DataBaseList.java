/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Person;


/**
 *
 * @author usuario
 */
public class DataBaseList {
    public static List read() throws ClassNotFoundException, SQLException{
        List<Person> listPerson = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connec = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\usuario\\Desktop\\Kata6\\KATA.sDB");
        Statement st = connec.createStatement();
        String query = "SELECT * FROM PEOPLE;";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next()){
            Integer id = rs.getInt(1);
            String nam = rs.getString(2);
            Character gender = rs.getString(3).charAt(0);
            String birthDate = rs.getString(4);
            Float weight = rs.getFloat(5);
            String mail = rs.getString(6);
            listPerson.add(new Person(id, nam, gender, birthDate, weight, mail));
        }
        return listPerson;
    }
}

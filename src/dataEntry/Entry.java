package dataEntry;

import student.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Entry {
    public boolean createNewStudentInDatabase(Connection connection, Student student) throws SQLException {
        //INSERT INTO student (id, name, year, cpi) VALUES ();
        PreparedStatement preparedStatement = connection.prepareStatement
                ("INSERT INTO student (id, name, year, cpi) VALUES (?, ?, ?, ?);");
        preparedStatement.setInt(1, student.getId());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setInt(3, student.getYear());
        preparedStatement.setDouble(4, student.getCpi());
        int rows = preparedStatement.executeUpdate();
        return rows >= 1;
    }
}

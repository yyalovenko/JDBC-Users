package org.example.app.repository;

import org.example.app.database.DBConn;
import org.example.app.entity.User;
import org.example.app.utils.Constants;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCreateRepository {

    public String createUser(User contact) {

        String sql = "INSERT INTO " + Constants.TABLE_USERS +
                " (name, email) VALUES(?, ?)";
        // PreparedStatement - підготовлений вираз, щоб уникнути SQL-ін'єкцій
        try (PreparedStatement pstmt = DBConn.connect().prepareStatement(sql)) {
            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getEmail());
            pstmt.executeUpdate();
            return Constants.DATA_INSERT_MSG;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}

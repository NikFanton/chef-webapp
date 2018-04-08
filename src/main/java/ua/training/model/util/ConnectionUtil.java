package ua.training.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
    private static final String DRIVER = ConnectionConstants.DATABASE_DRIVER;
    private static final String USER = ConnectionConstants.DATABASE_USER;
    private static final String PASSWORD = ConnectionConstants.DATABASE_PASSWORD;
    private static final String URL = ConnectionConstants.DATABASE_URL;

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnectionAutoCommitFalse() throws SQLException {
        Connection connection = getConnection();
        connection.setAutoCommit(false);
        return connection;
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

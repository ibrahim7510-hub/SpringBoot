package com.jdbc.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    private static final String DATABASE_DRIVER = "database.driver";
    private static final String DATABASE_URL = "database.url";
    private static final String DATABASE_USERNAME = "database.username";
    private static final String DATABASE_PASSWORD = "database.password";

    private DatabaseConfig() {
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        PropertiesConfig propertiesConfig = PropertiesConfig.getInstance();
        String url = propertiesConfig.getProp(DATABASE_URL);
        String username = propertiesConfig.getProp(DATABASE_USERNAME);
        String password = propertiesConfig.getProp(DATABASE_PASSWORD);
        Class.forName(propertiesConfig.getProp(DATABASE_DRIVER));
        return DriverManager.getConnection(url, username, password);
    }

}

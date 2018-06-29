package com.bin.spring.datasource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {

    private String url;
    private String username;
    private String password;
    private String driverName;

    public Connection getConnection() throws Exception {
        Class.forName(driverName);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}

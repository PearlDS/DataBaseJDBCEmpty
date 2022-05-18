package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {

                return DriverManager.getConnection("jdbc:mysql://db.intecbrussel.be:33100/student00",
                        "student00", "student6890");
    }

}

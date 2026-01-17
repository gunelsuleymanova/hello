//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//public class DBConfig {
//
//        //private static final String URL = "jdbc:postgresql://localhost:5432/postgres/"; // Buranı dəyişməyi unutma
//        private static final String URL = "jdbc:postgresql://localhost:5432/postgres1/postgres?gssEncMode=disable";
//        private static final String USER = "postgres1";
//        private static final String PASSWORD = "12345";
//
//        public static Connection getConnection() throws SQLException {
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//        }
//
//    }
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConfig {
    // Veritabanı adının "postgres" olduğundan əmin ol
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres1";
    private static final String USER = "postgres1";
    private static final String PASSWORD = "12345"; // Öz parolunu yaz

    public static Connection getConnection() throws SQLException {
        Properties props = new Properties();
        props.setProperty("postgres", USER);
        props.setProperty("12345", PASSWORD);

        // Bu iki sətir xətanı aradan qaldırmaq üçün mütləqdir:
        props.setProperty("gssEncMode", "disable");
        props.setProperty("sspiServiceClass", "");

        return DriverManager.getConnection(URL, props);
    }
}
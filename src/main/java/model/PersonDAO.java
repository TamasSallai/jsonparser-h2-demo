package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDAO {

    public void save(Person person) {
        try {
            Connection conn = createConnection();
            String sql = Files.readString(Paths.get("sql/insert_person.sql"));
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, person.getNameSuffix());
            stmt.setString(2, person.getFirstName());
            stmt.setString(3, person.getLastName());
            stmt.setString(4, person.getEmail());
            stmt.setString(5, person.getGender());
            stmt.setString(6, person.getAddress().getCountry());
            stmt.setString(7, person.getAddress().getCity());
            stmt.setString(8, person.getAddress().getStreet());
            stmt.setString(9, person.getAddress().getHouseNumber());
            stmt.executeUpdate();
        } catch (SQLException | IOException e) {
            System.out.println("Error: " + e);
        }
    }

    private Connection createConnection() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:h2:./h2/sampleDB");
        try {
            String sql = Files.readString(Paths.get("sql/create_table.sql"));
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.execute();
        } catch (SQLException | IOException e) {
            System.out.println("Error: " + e);
        }
        return conn;
    }
}

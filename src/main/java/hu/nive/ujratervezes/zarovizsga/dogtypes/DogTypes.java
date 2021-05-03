package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country) {
        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt =
                        conn.prepareStatement("select name from dog_types where country = ?");
        ) {
            stmt.setString(1, country);
            return getStrings(stmt);
        } catch (SQLException sqle) {
            throw new IllegalArgumentException("Error by insert", sqle);
        }
    }

    private List<String> getStrings(PreparedStatement stmt) throws SQLException {
        List<String> results = new ArrayList<>();
        try (ResultSet rs = stmt.executeQuery()){
            while (rs.next()) {
                results.add(rs.getString("name").toLowerCase());
            }
            return results;
        }
    }

}

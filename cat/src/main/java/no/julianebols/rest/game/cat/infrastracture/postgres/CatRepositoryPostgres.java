package no.julianebols.rest.game.cat.infrastracture.postgres;

import no.julianebols.rest.game.cat.domain.Cat;
import no.julianebols.rest.game.cat.infrastracture.CatRepository;

import java.sql.*;
import java.util.List;
import java.util.Properties;

public class CatRepositoryPostgres implements CatRepository {

    private String url;
    private Properties props;
    private Connection conn;

    public CatRepositoryPostgres() {
        this.url = "jdbc:postgresql://localhost:5432/myDB";
        this.props = new Properties();
        props.setProperty("user", "dbuser");
        props.setProperty("password", "myblog");

    }

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(url, props);
    }

    @Override
    public boolean createCat(Cat cat) {
        String SQL = "INSERT INTO cats(id, name, damage, health) "
                + "VALUES(?,?,?,?)";


        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL,
                     Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, cat.getId());
            pstmt.setString(2, cat.getName());
            pstmt.setInt(3, cat.getDamage());
            pstmt.setInt(4, cat.getHealth());

            int affectedRows = pstmt.executeUpdate();
            // check the affected rows
            if (affectedRows > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
        return false;
    }


    @Override
    public List<Cat> getCats() {
        return null;
    }

    @Override
    public Cat getCat(String id) {
        return null;
    }

    @Override
    public boolean updateCat(String id, Cat cat) {
        return false;
    }

    @Override
    public void deleteCate(String id) {

    }
}

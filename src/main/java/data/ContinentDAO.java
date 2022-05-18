package data;

import model.Continent;
import model.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContinentDAO {

    private Connection connection;

    public ContinentDAO() throws SQLException {
        connection = ConnectionFactory.getConnection();
    }

    //TODO: create update, delete and Insert methods

    public Continent getContinentById(int id) throws SQLException {
        return null;
    }


    public List<Continent> getAllContinents() throws SQLException {
        return null;
    }

    public Continent getContinentByCountry(Country country) throws SQLException {
        return null;
    }

    public void addContinent(Continent continent) throws SQLException {

    }

    public void updateContinent(Continent continent, int id) throws SQLException {


    }
    public void deleteContinent(Continent continent) throws SQLException {

    }


}

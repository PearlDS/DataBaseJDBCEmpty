package data;

import model.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CountryDAO {

    private Connection connection ;

    public CountryDAO() throws SQLException {
        connection = ConnectionFactory.getConnection();
    }


    public Country getCountryById(int id) throws SQLException {
        return null;
    }

    public List<Country> getAllCountries() throws SQLException {
        return null;
    }


    public void addCountry(Country country) throws SQLException {

    }

    public void updateCountry(Country country, int id) throws SQLException {


    }
    public void deleteCountry(Country country) throws SQLException {

    }
}

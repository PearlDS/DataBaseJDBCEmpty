package dataBaseconnectors;

import model.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryDAO {

    private Connection connection;

    public CountryDAO() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://moktok.intecbrussel.org:33062/you",
                "you", "you2021");
    }


    public Country getCountryById(int id){
      return null;
    }

    public List<Country> getAllCountries() throws SQLException {
        Statement statement = connection.createStatement();
        String select = "SELECT * FROM Country;";
        ResultSet resultSet = statement.executeQuery(select);
        List<Country> countryList = new ArrayList<Country>();
        while (resultSet.next()){
            Country country = new Country(resultSet.getInt("Id"),resultSet.getString("name"),resultSet.getInt("continentID"));
            countryList.add(country);
        }
        return countryList;
    }

    public void addCountry(Country country) throws SQLException {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Country (name, continentID) VALUES (?,?);");
            preparedStatement.setString(1, country.getName());
            preparedStatement.setInt(2, country.getContinentId());
            preparedStatement.execute();
    }

    public void updateCountry(Country country, int id){

    }
    public void deleteCountry(Country country){

    }
}

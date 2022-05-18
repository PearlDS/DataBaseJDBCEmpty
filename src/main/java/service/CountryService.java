package service;

import data.ContinentDAO;
import data.CountryDAO;
import model.Country;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CountryService {

    private Scanner scanner = new Scanner(System.in);
    private CountryDAO countryDAO;
    private ContinentDAO continentDAO;

    public CountryService() throws SQLException {
        countryDAO = new CountryDAO();
        continentDAO = new ContinentDAO();
    }


    public void showAllCountries() throws SQLException {

    }

    public void showCountryById() throws SQLException {

    }

    public void  addCountry() throws SQLException {


    }

    public void updateCountry() throws SQLException {


    }

    public void deleteACountry() throws SQLException {


    }



}

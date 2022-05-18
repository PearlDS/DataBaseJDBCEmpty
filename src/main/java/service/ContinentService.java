package service;

import data.ContinentDAO;
import model.Continent;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ContinentService {

    //TODO fill in all methods needed
    private ContinentDAO continentDAO;
    private Scanner scanner = new Scanner(System.in);

    public ContinentService() throws SQLException {
        continentDAO = new ContinentDAO();
    }


    public void showAllContinents() throws SQLException {

    }

    public void showContinentById() throws SQLException {


    }
    public void insertAContinent() throws SQLException {


    }
    public void updateAContinent() throws SQLException {


    }
    public void deleteAContinent() throws SQLException {


    }

}

import dataBaseconnectors.CountryDAO;
import model.Country;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class MainDBClass {
    public static void main(String[] args) {

        try {


            /*Maak eerst de Country DataBase via Squirrel

            CREATE TABLE Country (
                    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    name varchar(255),
                    ContinentId int,
                    FOREIGN KEY (ContinentId) REFERENCES Continent(id)
                    );

                    CREATE TABLE Continent (
                    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                    name varchar(255)
                    );

                    INSERT INTO CONTINENT (name) VALUES ('Europe');
                    INSERT INTO CONTINENT (name) VALUES ('Africa');
                    INSERT INTO CONTINENT (name) VALUES ('Asia');

            INSERT INTO Country (name, continentId) VALUES ('Kenya', 2);
            INSERT INTO Country (name, continentId) VALUES ('Belgium', 1);
            INSERT INTO Country (name) VALUES ('Russia');
            INSERT INTO Country (name, continentId) VALUES ('Korea', 3);
            INSERT INTO Country (name, continentId) VALUES ('Italy', 1);
            INSERT INTO COUNTRY (name, continentId) VALUES ('Congo', 2);
            INSERT INTO Country (name, continentId) VALUES ('Egypt', 2);
            INSERT INTO Country (name, continentId) VALUES ('Japan', 3);*/




            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert a Country you want to add:");
            String countryName = scanner.next();
            int continentId = scanner.nextInt();
            Country countryIJustMade = new Country(countryName, continentId);


            CountryDAO countryDAO = new CountryDAO();
            countryDAO.addCountry(countryIJustMade);
            List<Country> countryList = countryDAO.getAllCountries();

            for (Country country: countryList){
                System.out.println(country);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

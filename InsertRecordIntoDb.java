package com.company;

import java.sql.*;

public class InsertRecordIntoDb {
    public static void main(String[] args) {
        try {

            Connection con = null;
            Statement stmt = null;

            con = DriverManager
                    .getConnection(
                            "jdbc:sqlite:/C:\\sqlite\\java\\connect\\net\\sqlitetutorial\\Mulesoft\\MoviesDatabase.db");

            System.out.println("Database Connection Successful !!");

            stmt = con.createStatement();

            String query0 = "INSERT INTO MyMovies values ('Bahubali','Prabhas','Anushka', 2019,'Rajamouli');";
            stmt.executeUpdate(query0);

            String query1 = "INSERT INTO MyMovies values ('KGF','yash','srinidhi', 2022,'prashnath');";
            stmt.executeUpdate(query1);

            String query2 = "INSERT INTO MyMovies values ('f3','venkatesh','Tamanna',2022,'anil');";
            stmt.executeUpdate(query2);

            String query3 = "INSERT INTO MyMovies values ('Radeshyam','prabhas','pooja',2022,'radha');";
            stmt.executeUpdate(query3);

            String query4 = "INSERT INTO MyMovies values ('kushi`','pawan kalyan','bhoomika',2001,'surya');";
            stmt.executeUpdate(query4);

            String query5 = "INSERT INTO MyMovies values ('Hit','viswak sen','sanya',2019,'sailesh');";
            stmt.executeUpdate(query5);
            stmt.close();

            con.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Record  Insertion successful");
    }
}
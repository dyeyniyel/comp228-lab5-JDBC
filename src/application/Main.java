package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.*;

 
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

            try {

                    System.out.println("> Start Program ...");
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    System.out.println("> Driver Loaded successfully.");

//establish a connection
//if you are outside Centennial College
//the Username and the password will be provided by your professor. (Like //COMP228_M20_001_8 and password as used below: //Everyone will have a unique one.

            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@ 199.212.26.208:1521:SQLD","COMP228_W24_sy_49", "password");


//Use the following if you are inside Centennial College lab. The user name and password will be
//provided by your professor. Everyone will have a unique one

//DriverManager.getConnection("jdbc:oracle:thin:@oracle1.centennialcollege.ca:1521: SQLD","COMP228_W24_sy_49", "password");

					System.out.println("Database connected successfully.");
            }
  
			catch(Exception e)
                    {
                    e.printStackTrace();
            }
    }

    public static void main(String[] args)
    {
            Main.launch();
    }
}
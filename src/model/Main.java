package model;

import dao.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;


public class Main extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Launching Login Page");
        Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) throws SQLException {

        dbConnection.makeConnection();
        launch(args);
        dbConnection.closeConnection();

    }

}

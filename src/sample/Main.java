package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application  {

    @Override
    public void start(Stage primaryStage) {
        try {
            //création d'une HashMaps pour les spécialités
            //clef = String
            //valeur = Specialte

            //instanciation de la HashMap



            Parent root = FXMLLoader.load(getClass().getResource("/sample/login.fxml"));
            Scene scene = new Scene(root,600,500);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);

    }

}
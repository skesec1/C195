package model;

//public class Main {
//
//    public static void main(String[] args) {
//        // write your code here
//        JDBC.openConnection();
//        JDBC.closeConnection();
//    }
//}

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * <h1>C195 - Software II</h1>
 * Main creates an app for the management of customers and appointments.
 * <p>
 * <b>FUTURE ENHANCEMENT: </b>
 * <p>
 * <b>Javadocs:</b> Unzip and see /javadoc
 * @author Samantha Kesecker
 */
public class Main extends Application {

    /**
     * Loads login.fxml to start the GUI and display the initial login screen.
     *
     * @param primaryStage main stage used to set scene
     * @throws IOException change scene
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/login.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
    //Test French translation for login screen with:
    //Locale.setDefault(new Locale("fr"));

    /**
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

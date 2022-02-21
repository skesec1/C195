package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

/**
 * Controls changing scenes on the stage
 *
 * @author Samantha Kesecker
 */
public abstract class SceneController {

    public void changeScene(ActionEvent actionEvent, String page) throws IOException {
        Stage stage;
        Parent root;

        stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource(page)));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

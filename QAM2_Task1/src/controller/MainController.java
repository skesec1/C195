package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MainController extends SceneController {

    @FXML
    private TextField userIdField;
    @FXML
    private TextField passwordField;

//    String userId;
//    {
//        assert userIdField != null;
//        userId = userIdField.getText();
//    }
//
//    String password;
//    {
//        assert passwordField != null;
//        password = passwordField.getText();
//    }

    public void initialize() {

        // location check for language here?

    }

    public void OnSubmit(ActionEvent actionEvent) throws IOException {
        if (validateLogin()) {
            changeScene(actionEvent, "/view/dashboard.fxml");
        };
    }

    public boolean validateLogin() {
        String userId = userIdField.getText();
        String password = passwordField.getText();

        //If user id or password is null, not found in db, or does not match exactly
        if (userId == null){
            System.out.println("User ID not found");
        }
        else if (password == null) {
            System.out.println("Password not found");
        }
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Incorrect Login Information");
        alert.setContentText("User ID and password cannot be blank and are case sensitive.");
        alert.showAndWait();
        return false;
    }
}
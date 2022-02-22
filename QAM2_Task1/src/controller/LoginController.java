package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController extends SceneController {

    @FXML
    private TextField usernameField;
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
        String userId = usernameField.getText();
        String password = passwordField.getText();

        //If user id or password is null, not found in db, or does not match exactly
        if (userId.isBlank()){
            System.out.println("Username not found");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incorrect Login Information");
            alert.setContentText("Username cannot be blank and is case sensitive.");
            alert.showAndWait();
            return false;
        }
        else if (password.isBlank()) {
            System.out.println("Password not found");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Incorrect Login Information");
            alert.setContentText("Password cannot be blank and is case sensitive.");
            alert.showAndWait();
            return false;
        }

        return true;
    }

    //ZoneId class for time zones
}
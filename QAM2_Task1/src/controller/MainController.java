package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

        //function to handle userIdField input validation
        validateUserId();

        //function to handle passwordField input validation
        validatePassword();
            //functions check good, then change scene
            //if not, display login error
        //changeScene(actionEvent, "/view/dashboard.fxml");
    }

    public void validateUserId() {
        String userId = userIdField.getText();
        if (userId != null) {
            System.out.println(userId);
        }
    }

    public void validatePassword () {
        String password = passwordField.getText();
        if (password != null) {
            System.out.println(password);
        }

    }
}
package controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class ReportOtherController extends SceneController{

    public void OnDashboard(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/dashboard.fxml");
    }
}

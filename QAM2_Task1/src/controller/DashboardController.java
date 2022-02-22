package controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardController extends SceneController{
    public void OnAddCustomer(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/customer.fxml");
    }

    public void OnSelectedCustBtn(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/customer.fxml");
    }

    public void OnSelectedAppBtn(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }

    public void OnAddApp(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }
}

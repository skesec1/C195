package controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class DashboardController extends SceneController{

    //Customer buttons
    public void OnAddCustomer(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/customer.fxml");
    }

    public void OnSelCustomerBtn(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/customer.fxml");
    }

    //Appointment buttons
    public void OnSelectedAppBtn(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }

    public void OnAddApp(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }

    //Appointment table filter radio buttons
    public void OnAllApp(ActionEvent actionEvent) {
    }

    public void OnWeekApp(ActionEvent actionEvent) {
    }

    public void OnMonthApp(ActionEvent actionEvent) {
    }

    public void OnAllRadio(ActionEvent actionEvent) {
    }

    public void OnWeekRadio(ActionEvent actionEvent) {
    }

    public void OnMonthRadio(ActionEvent actionEvent) {
    }

    public void OnCustApp(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/reportCustomerApp.fxml");
    }
}

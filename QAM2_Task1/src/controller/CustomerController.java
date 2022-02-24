package controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CustomerController extends SceneController{
    
    //Dashboard button takes user to main Dashboard screen
    public void OnDashboard(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/dashboard.fxml");
    }

    //Radio selections
    public void OnAllRadio(ActionEvent actionEvent) {
    }

    public void OnWeekRadio(ActionEvent actionEvent) {
    }

    public void OnMonthRadio(ActionEvent actionEvent) {
    }

    //Customer form Buttons
    public void OnDeleteCustomer(ActionEvent actionEvent) {
    }

    public void OnSaveCustomer(ActionEvent actionEvent) {
    }
    
    //Appointment form buttons
    public void OnAddApp(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }

    public void OnUpdateApp(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }

    public void OnDelApp(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/appointment.fxml");
    }
}

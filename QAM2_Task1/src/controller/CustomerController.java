package controller;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CustomerController extends SceneController{
    public void OnDashboard(ActionEvent actionEvent) throws IOException {
        changeScene(actionEvent, "/view/dashboard.fxml");
    }

    public void OnAddCustomer(ActionEvent actionEvent) {
    }

    public void OnSelCustomerInfo(ActionEvent actionEvent) {
    }

    public void OnAllRadio(ActionEvent actionEvent) {
    }

    public void OnWeekRadio(ActionEvent actionEvent) {
    }

    public void OnMonthRadio(ActionEvent actionEvent) {
    }

    public void OnDeleteCustomer(ActionEvent actionEvent) {
    }

    public void OnSaveCustomer(ActionEvent actionEvent) {
    }
}

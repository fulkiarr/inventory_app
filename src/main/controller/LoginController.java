package main.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    //Inisiasi ID dari fxml
    @FXML
    private Button loginbuton;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private void login(ActionEvent event){
        if(this.username.getText().trim().isEmpty() || this.password.getText().trim().isEmpty())
            new Alert(Alert.AlertType.ERROR, "Username and Password not valid!").showAndWait();
        else
            new Alert(Alert.AlertType.CONFIRMATION, "Your Username is : "+ this.username.getText() +" And your password is : "+ this.password.getText()).showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


}

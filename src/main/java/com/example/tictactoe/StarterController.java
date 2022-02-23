package com.example.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class StarterController implements Initializable {

    @FXML
  public  Button Login;

  @FXML
  public Button Signup;




  public void SwitchToSignUp(ActionEvent event) throws IOException
  {
    Stage stage;
    Scene scene;
    Parent root;
    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Signup.fxml")));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

  }
  public void SwitchToLogin(ActionEvent event) throws IOException
  {
    Stage stage;
    Scene scene;
    Parent root;
    root = FXMLLoader.load(getClass().getResource("Login.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

  }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

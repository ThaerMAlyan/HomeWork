/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkconvert;

import homeworkconvert.ViewManger;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class LoginPageController implements Initializable {

    @FXML
    private Label labelError;
    @FXML
    private TextField tfUserName;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Button buttonSubmit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buttonSubmitAction(ActionEvent event) throws IOException {

        if (tfUserName.getText().equals("user") && tfPassword.getText().equals("userpass")) {
            ViewManger.closeLoginPage();
            ViewManger.openConvertPage();
        } else {
            labelError.setText("Data Is Invalid");
        }
    }

}

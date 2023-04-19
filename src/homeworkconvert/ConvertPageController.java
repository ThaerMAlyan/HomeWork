/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkconvert;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class ConvertPageController implements Initializable {

    @FXML
    private Button buttonLogOut;
    @FXML
    private TextField tfUsd;
    @FXML
    private TextField tfNis;
    @FXML
    private Button buttonConvert;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void buttonLogOutAction(ActionEvent event) throws IOException {
        ViewManger.closeConvertPage();
        ViewManger.openLoginPage();
    }

    @FXML
    private void buttonConvertAction(ActionEvent event) {

        if (!tfUsd.getText().isEmpty()) {
            double nis = Double.parseDouble(tfUsd.getText()) * 3.7;
            tfNis.setText(nis + "");
        } else if (!tfNis.getText().isEmpty()) {
            double usd = Double.parseDouble(tfNis.getText()) / 3.7;
            tfUsd.setText(usd + "");
        }
    }

}

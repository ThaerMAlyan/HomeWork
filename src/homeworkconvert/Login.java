/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkconvert;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class Login extends Stage {

    public Login() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginPage.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        this.setScene(scene);
        this.setTitle("Login Page");

    }

}

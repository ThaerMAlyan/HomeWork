/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkconvert;

import java.io.IOException;

/**
 *
 * @author pc
 */
public class ViewManger {

    public static Login login;
    public static Convert covert;

    private ViewManger() {
    }

    public static void openLoginPage() throws IOException {
        if (login == null) {
            login = new Login();
            login.show();
        } else {
            login.show();
        }

    }
    
        public static void openConvertPage() throws IOException {
        if (covert == null) {
            covert = new Convert();
            covert.show();
        } else {
            covert.show();
        }

    }

    public static void closeLoginPage() {
        if (login != null) {
            login.close();
        }
    }
    
    
        public static void closeConvertPage() {
        if (covert != null) {
            covert.close();
        }
    }
}
